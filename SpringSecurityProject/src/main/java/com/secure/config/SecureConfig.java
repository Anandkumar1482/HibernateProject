package com.secure.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;
import org.springframework.util.AntPathMatcher;

@Configuration
@EnableWebSecurity
public class SecureConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private UserDetailsService userDetailsService;

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	public AuthenticationProvider authProvider() {

		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setUserDetailsService(userDetailsService);
		provider.setPasswordEncoder(bCryptPasswordEncoder());

		return provider;

	}

	/*
	 * @Override protected void configure(HttpSecurity http) throws Exception { http
	 * .csrf().disable() .authorizeRequests().antMatchers("/login").permitAll()
	 * .anyRequest().authenticated() .and() .formLogin()
	 * .loginPage("/login").permitAll() .and() .logout().invalidateHttpSession(true)
	 * .clearAuthentication(true) .logoutRequestMatcher(new
	 * AntPathRequestMatcher("/logout")) .logoutSuccessUrl("/home"); }
	 */
	/*
		 * @Bean
		 * 
		 * @Override protected UserDetailsService userDetailsService() {
		 * 
		 * List<UserDetails> user = new ArrayList<>();
		 * user.add(User.withDefaultPasswordEncoder().username("anand").password("1234")
		 * .roles("USER").build()); return new InMemoryUserDetailsManager(user);
		 * 
		 * }
		 */

}
