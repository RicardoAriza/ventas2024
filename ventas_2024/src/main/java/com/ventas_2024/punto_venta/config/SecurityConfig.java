package com.ventas_2024.punto_venta.config;

import com.ventas_2024.punto_venta.security.JwtFilter;
import com.ventas_2024.punto_venta.util.JwtUtil;
import com.ventas_2024.punto_venta.service.UsuarioDetailsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
public class SecurityConfig {

    private final JwtFilter jwtFilter;

    public SecurityConfig(JwtUtil jwtUtil, UsuarioDetailsService usuarioDetailsService) {
        this.jwtFilter = new JwtFilter(jwtUtil, usuarioDetailsService);
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable()
            .authorizeHttpRequests(auth -> auth
            .requestMatchers("/auth/login", "/auth/registro").permitAll()
            .anyRequest().authenticated()            
            )
            .addFilterBefore(jwtFilter, UsernamePasswordAuthenticationFilter.class); // Registrar el filtro
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration configuration) throws Exception {
        return configuration.getAuthenticationManager();
    }
}