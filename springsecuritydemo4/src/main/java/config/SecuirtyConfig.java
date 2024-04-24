package config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecuirtyConfig {
	
	@Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception
	{
		
		http.authorizeHttpRequests((requests) -> requests
                .requestMatchers("/myAccount","/myBalance","/myLoans","/myCards").authenticated()
                .requestMatchers("/notices","/contacts").permitAll())
       .formLogin(Customizer.withDefaults())
        .httpBasic(Customizer.withDefaults());
		
		return http.build();  
	}
	
	/* Approach 1
	@Bean
	InMemoryUserDetailsManager userDetailsInfo() {
		UserDetails admin = User.withDefaultPasswordEncoder()
				.username("Ramya")
				.password("1234")
				.authorities("admin")
				.build();
		
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("Bowya")
				.password("1234")
				.authorities("read")
				.build();
		return new InMemoryUserDetailsManager(admin, user);
	}
	*/
	 
	/*Approach 2 - With PasswordEncoder Bean
	@Bean
	InMemoryUserDetailsManager userDetailsInformation() {
		UserDetails admin = User.withUsername("Ramya")
				.password("12345").authorities("admin")
				.build();
		UserDetails user = User.withUsername("Bowya")
				.password("12345").authorities("read")
				.build();
		
		return new InMemoryUserDetailsManager(admin,user);
		
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	*/
	//Approach 3 - JDBC
	@Bean
	UserDetailsService	userDetailsService(DataSource datasource) {
		return new JdbcUserDetailsManager(datasource);
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}

}
