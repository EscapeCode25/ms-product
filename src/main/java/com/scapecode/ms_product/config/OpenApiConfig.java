package com.scapecode.ms_product.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "API de Gestión de Productos",
                version = "1.0.0",
                description = "Documentación de la API para el microservicio de productos",
                contact = @Contact(
                        name = "Igor Ramos",
                        email = "igor.ramos.cruzado.w@gmail.com",
                        url = "https://linkedin.com/in/igor-rc"
                ),
                license = @License(
                        name = "MIT License",
                        url = "https://opensource.org/licenses/MIT"
                )
        )
)
public class OpenApiConfig {
}
