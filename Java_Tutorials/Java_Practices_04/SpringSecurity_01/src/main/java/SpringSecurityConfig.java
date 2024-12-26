import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// JDBC and MySQL spring security

//		auth.jdbcAuthentication().dataSource(dataSource);
//		.authoritiesByUsernameQuery("select username, password, enabled from users where username=?")
//		.authoritiesByUsernameQuery("select username, authority  from authorities where username=?");
//	}
//
//	@Override
//	protected void configure(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.authorizeRequests()
//		.antMatchers("/admin").hasRole("ADMIN")
//		.antMatchers("/user").hasAnyRole("ADMIN", "USER")
//		.antMatchers("/","static/js").permitAll()
//		.and().formLogin();
//	}
//	@Bean
//	public PasswordEncoder getPasswordEncoder()
//	{
//		return NoOpPasswordEncoder.getInstance();
//	}
	
		// JDBC and MySQL spring security
//		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();
//		auth
//		    .jdbcAuthentication().dataSource(dataSource)
//		    .withDefaultSchema()
//		    .withUser(User.withUsername("user"))
//		    .password(encoder.encode("user"))
//		    .roles("USER")
//		    .withUser(User.withUsername("admin"))
//		    .password(encoder.encode("admin"))
//		    .roles("ADMIN");
//		)
//
//	@Override
//	protected void configure(HttpSecurity httpSecurity) throws Exception {
//		httpSecurity.authorizeRequests()
//		.antMatchers("/admin").hasRole("ADMIN")
//		.antMatchers("/user").hasAnyRole("ADMIN", "USER")
//		.antMatchers("/","static/js").permitAll()
//		.and().formLogin();
//	}

		// InMememory String Security with Authentication and Autherisation
//		PasswordEncoder encoder = PasswordEncoderFactories.createDelegatingPasswordEncoder()
//				auth
//				    .inMemoryAuthentication()
//				    .withUser("test")
//				    .password("test")
//				    .roles("USER");

		// InMememory String Security

//		auth
//		    .inMemoryAuthentication()
//		    .withUser("test")
//		    .password("test")
//		    .roles("Admin")
//		    .and()
//		    .withUser("suneel")
//		    .password("sunny")
//		    .roles("Manager");
//	}

//	@Bean
//	public PasswordEncoder getPasswordEncoder()
//	{
//		return NoOpPasswordEncoder.getInstance();
//	}

	
}
}
