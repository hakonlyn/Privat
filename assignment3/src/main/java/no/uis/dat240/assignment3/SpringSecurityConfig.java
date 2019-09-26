package no.uis.dat240.assignment3;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;



@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

    // Create 2 users for demo
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {

        auth.inMemoryAuthentication()
                .withUser("hei").password("{noop}nei").roles("USER")
                .and()
                .withUser("admin").password("{noop}password").roles("USER", "ADMIN");

    }

    // Secure the endpoins with HTTP Basic authentication
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                //HTTP Basic authentication
                
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest()
                .authenticated()
                // .antMatchers(HttpMethod.GET, "/degree").hasRole("USER")
                // .antMatchers(HttpMethod.POST, "/books").hasRole("ADMIN")
                // .antMatchers(HttpMethod.PUT, "/books/**").hasRole("ADMIN")
                // .antMatchers(HttpMethod.PATCH, "/books/**").hasRole("ADMIN")
                // .antMatchers(HttpMethod.DELETE, "/books/**").hasRole("ADMIN")
                .and()
                .httpBasic();
                // .csrf().disable()
                // .formLogin().disable();
    }

    // @Bean
    // public UserDetailsService userDetailsService() {
    //     //ok for demo, todo legg til noe inport i gradle build for å få userbuilder til å fungere
    //     // User.UserBuilder users = User.withDefaultPasswordEncoder();

    //     InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
    //     // manager.createUser(users.username("user").password("password").roles("USER").build());
    //     // manager.createUser(users.username("admin").password("password").roles("USER", "ADMIN").build());
    //     return manager;
    // }
}