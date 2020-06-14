package com.cgrdev.springbootthymeleafcruddb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;

@Configuration
@EnableWebSecurity
public class DemoSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        // add users for in memory authentication

        User.UserBuilder users = User.withDefaultPasswordEncoder();

        auth.inMemoryAuthentication()
                .withUser(users.username("employee").password("employee").roles("EMPLOYEE"))
                .withUser(users.username("manager").password("manager").roles("EMPLOYEE", "MANAGER"))
                .withUser(users.username("admin").password("admin").roles("EMPLOYEE", "ADMIN"));
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/employees/delete-employee").hasRole("ADMIN")
                .antMatchers("/employees/*-employee").hasAnyRole("MANAGER", "ADMIN")
                .antMatchers("/employees/save").hasAnyRole("MANAGER","ADMIN")
                .antMatchers("/employees/**").hasRole("EMPLOYEE")
                .antMatchers("/resources/**").permitAll()
                .and()
                .formLogin()
                    .loginPage("/show-login-page")
                    .loginProcessingUrl("/authenticate-user")
                    .permitAll()
                .and()
                .logout().permitAll()
                .and()
                .exceptionHandling().accessDeniedPage("/access-denied");
    }
}
