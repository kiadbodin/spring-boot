package com.web.springbootcrudsqlserver;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()));
		http.authorizeHttpRequests()
			.antMatchers("/").permitAll().and()
			.formLogin().loginPage("/authen/admin/login").permitAll()
			.and().logout().logoutUrl("/logout")
			.permitAll();				
		return http.build();
	}
	
	@Bean
	public WebSecurityCustomizer webSecurityCustomizer() throws Exception {
		return (web) ->web.ignoring().antMatchers("/resources/**");
	}
}
