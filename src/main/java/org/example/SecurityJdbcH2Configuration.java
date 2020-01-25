//package org.example;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//import javax.sql.DataSource;
//
//@EnableWebSecurity
//public class SecurityJdbcH2Configuration extends WebSecurityConfigurerAdapter {
//
//    // JDBC h2 Authentication:
//
//    @Autowired
//    private DataSource dataSource;
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.jdbcAuthentication()
//                .dataSource(dataSource);
//
////        We can change the default schema:
////                .usersByUsernameQuery("select username, password, enabled from users where username = ?")
////                .authoritiesByUsernameQuery("select username, authority from authorities where username = ?");
//
//
////        We can use data-h2.sql isntead:
////                .withDefaultSchema() //Spring creates two tables: Users and Authorities
////                .withUser(
////                        User.withUsername("barilska")
////                                .password("barilska")
////                                .roles("USER"))
////                .withUser(
////                        User.withUsername("admin")
////                                .password("admin")
////                                .roles("ADMIN"));
//    }
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
//
//    @Bean
//    public PasswordEncoder setPasswordEncoder() {
////        Don't do this in a real app. Here it's set just because Spring Security expects it
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//}
