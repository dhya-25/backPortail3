package com.arabsoft.ajir.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.arabsoft.ajir.jwt.AuthEntryPointJwt;
import com.arabsoft.ajir.jwt.AuthTokenFilter;
import com.arabsoft.ajir.sevices.UserDetailsServiceImpl;




@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(
    // securedEnabled = true,
    // jsr250Enabled = true,
    prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  UserDetailsServiceImpl userDetailsService;

  @Autowired
  private AuthEntryPointJwt unauthorizedHandler;

  @Bean
  public AuthTokenFilter authenticationJwtTokenFilter() {
    return new AuthTokenFilter();
  }

  @Override
  public void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
    authenticationManagerBuilder.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
  }

  @Bean
  @Override
  public AuthenticationManager authenticationManagerBean() throws Exception {
    return super.authenticationManagerBean();
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.cors().and().csrf().disable()
      .exceptionHandling().authenticationEntryPoint(unauthorizedHandler).and()
      .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
      .authorizeRequests().antMatchers("/api/auth/**").permitAll()
      .antMatchers("/demande/**").permitAll()
      .antMatchers("/consPaie/**").permitAll()
      .antMatchers("/conge/**").permitAll()
      .antMatchers("/bultSoin/**").permitAll()
      .antMatchers("/cessionpers/**").permitAll()
      .antMatchers("/ligbult/**").permitAll()
      .antMatchers("/affilprs/**").permitAll()
      .antMatchers("/comptepers/**").permitAll()
      .antMatchers("/famille/**").permitAll()
      .antMatchers("/infoPers/**").permitAll()
      .antMatchers("/scofam/**").permitAll()
      .antMatchers("/noteevent/**").permitAll()
      .antMatchers("/valeurficheeval/**").permitAll()
      .antMatchers("/FICHEEVALCOMP/**").permitAll()
      .antMatchers("/Mod/**").permitAll()
      .antMatchers("/Absanteisme/**").permitAll()

      .antMatchers("/api/test/**").permitAll().antMatchers("/api/auth/getall").permitAll()
      .anyRequest().authenticated();

    http.addFilterBefore(authenticationJwtTokenFilter(), UsernamePasswordAuthenticationFilter.class);
  }
}
