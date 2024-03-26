package config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	
@Bean
 SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
	
  
    http.authorizeHttpRequests((requests) -> requests
                    .requestMatchers("/myAccount","/myBalance","/myLoans","/myCards").authenticated()
                    .requestMatchers("/notices","/contacts").permitAll())
           .formLogin(Customizer.withDefaults())
            .httpBasic(Customizer.withDefaults());
    return http.build();  
    
    //To denyAll
    /*http.authorizeHttpRequests((requests) -> requests
            .anyRequest().denyAll())
   .formLogin(Customizer.withDefaults())
    .httpBasic(Customizer.withDefaults());
    return http.build();*/
    
    
    //To permitAll
   /* http.authorizeHttpRequests((requests) -> requests
            .anyRequest().permitAll())
   .formLogin(Customizer.withDefaults())
    .httpBasic(Customizer.withDefaults());
    return http.build(); */
    
    
    
    //Before spring security 6, the below code format used
    /*
     http.authorizeHttpRequests().requestMatchers("myAccount","myBalance","myCards","myLoans").authenticated()
	.requestMatchers("notices","contacts").permitAll()
	.and().formLogin().and().httpBasic();
	
	 http.authorizeHttpRequests().anyRequest().authenticated();
	 http.formLogin();
	 http.httpBasic();
	 return http.build();
	 */
}
}
