package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecuirtyConfig {
	
	@Bean
	SecurityFilterChain defaultSettings(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests((request) ->
			request.requestMatchers("/myAccount","/myBalance","/myCards","/myLoans").authenticated()
			.requestMatchers("/contacts","/notices").permitAll())
		.formLogin(Customizer.withDefaults())
		.httpBasic(Customizer.withDefaults());
		return http.build();
	}

}