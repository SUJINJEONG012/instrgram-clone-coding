package cloneinstrgramstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Configuration //빈 등록(Ioc관리)빈등록 :  스프링 컨테이너에서 객체를 관리할 수 있게 하는 것
@EnableWebSecurity // 시큐리티에 필터가 등록이 된다. 설정은 아래에서 하면된다.
public class SecurityConfig {

	
	   // encode() 를 호출하면 new BCryptPasswordEncoder() 객체를 리턴받을 수 있다.
		@Bean
		public BCryptPasswordEncoder encode() {
			 return new BCryptPasswordEncoder(); //스프링관리 , 필요할때마다 가져다가 사용하면 된다.
		 }
		
		@Bean 
		 public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	          
		        http.csrf().disable(); //csrf 토큰 비활성화 (테스트시걸어두는게 좋음)
		        
		        http.authorizeRequests()
				    .antMatchers("/", "/user/**", "/image/**", "/follow/**","/comment/**").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")  // 막을것만 막고 나머진 허용 / authenticated:로그인하면 허용/
		        	.antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
		        	.anyRequest()	
		        	.permitAll() //로그인하지않고 모두 궈한을 가짐 
		        	.and()
		        	.formLogin()
		        	.loginPage("/auth/login")
		        	.loginProcessingUrl("/login") //스프링 시큐리티가 로그인을 가로챈다.
		        	.defaultSuccessUrl("/"); //정상적으로 요청이 완료
        
		        return http.build();
		    }
		
		 
	
}
