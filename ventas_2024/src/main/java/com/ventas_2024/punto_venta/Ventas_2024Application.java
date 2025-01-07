package com.ventas_2024.punto_venta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class Ventas_2024Application {

	public static void main(String[] args) {
		SpringApplication.run(Ventas_2024Application.class, args);
	}
        
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**") // Permite todas las rutas
                        .allowedOrigins("http://localhost:3000","https://system-app-ventas.vercel.app","http://127.0.0.1:3000","https://app-ventas-latest.onrender.com") // Permite todos los orígenes
                        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
                        .allowedHeaders("*") // Encabezados permitidos
                        .allowCredentials(true); // Si se requiere que se envíen credenciales (como cookies o tokens)
            }
        };
    }

}
