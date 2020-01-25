//package org.example;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@EnableWebSecurity
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    // In memory Authentication:
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("barilska")
//                .password("barilska")
//                .roles("USER")
//                .and()
//                .withUser("admin")
//                .password("admin")
//                .roles("ADMIN");
//    }
//
//    @Bean
//    public PasswordEncoder setPasswordEncoder() {
////        Don't do this in a real app. Here it's set just because Spring Security expects it
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//
//
//    // Authorization:
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/admins").hasRole("ADMIN")
//                .antMatchers("/users").hasAnyRole("USER", "ADMIN")
//                .antMatchers("/").permitAll()
//                .and().formLogin();
//    }
//}
