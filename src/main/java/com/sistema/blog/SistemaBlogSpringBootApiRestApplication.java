package com.sistema.blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Todoitems API", version = "1.0.0"), servers = {
		@Server(url = "http://localhost:8080")
})

@SecurityScheme(name = "BearerJWT", type = SecuritySchemeType.HTTP, bearerFormat = "JWT", scheme = "bearer", description = "Bearer token for the project")
public class SistemaBlogSpringBootApiRestApplication {

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(SistemaBlogSpringBootApiRestApplication.class, args);
	}

}
