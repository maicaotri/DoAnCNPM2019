package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.service.impl.UserLoginServiceImpl;

@SpringBootApplication
@EntityScan(basePackages = "com.model.entitymodel")
public class JobpoolApplication extends WebSecurityConfigurerAdapter {
	@Autowired
	UserLoginServiceImpl loginServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(JobpoolApplication.class, args);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().antMatchers("/admin/**").hasRole("ADMIN").and().authorizeRequests()
		.antMatchers("/user/**").hasRole("USER").anyRequest().permitAll().anyRequest().permitAll().and()
		.formLogin().loginPage("/login").loginProcessingUrl("/login").usernameParameter("username")
		.passwordParameter("password").defaultSuccessUrl("/admin/danhsach").failureUrl("/login?error=failed")
		.and().exceptionHandling().accessDeniedPage("/login?error=deny");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/css/**", "/js/**", "/img/**");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(loginServiceImpl);
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
