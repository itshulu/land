package com.sl.land.config;

import com.sl.land.validate.filter.ValidateFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

/**
 * @author 舒露
 */
@Component
class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
    @Bean
    PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        ValidateFilter filter=new ValidateFilter();
        http.csrf().disable();
        http.authorizeRequests().
                antMatchers("/css/**", "/js/**","/code/image").permitAll().
                anyRequest().authenticated().
                and()
                .formLogin().loginPage("/login").loginProcessingUrl("/startLogin").permitAll().
                and().logout().permitAll();
        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        http.logout().logoutSuccessUrl("/a");
    }
}
