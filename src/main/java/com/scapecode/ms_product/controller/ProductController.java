package com.scapecode.ms_product.controller;

import com.scapecode.ms_product.entity.ProductEntity;
import com.scapecode.ms_product.repository.ProductRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ExampleObject;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    protected ProductRepository productRepository;

    @GetMapping
    @Operation(
            summary = "Obtener todos los productos",
            description = "Devuelve una lista de productos disponibles",
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Lista de productos",
                            content = @Content(
                                    mediaType = "application/json",
                                    array = @ArraySchema(schema = @Schema(implementation = ProductEntity.class))
                            )
                    ),
                    @ApiResponse(responseCode = "500", description = "Error del servidor")
            }
    )
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    @Operation(summary = "Crear un producto")
    @ApiResponse(responseCode = "201", description = "Producto creado exitosamente")
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(
            @io.swagger.v3.oas.annotations.parameters.RequestBody(
                    description = "Datos del producto a crear",
                    required = true,
                    content = @Content(
                            mediaType = "application/json",
                            schema = @Schema(implementation = ProductEntity.class),
                            examples = @ExampleObject(
                                    value = "{ \"productName\": \"Laptop\", \"productDescription\": \"The best computer\", \"unitPrice\": 2000 }"
                            )
                    )
            )
            @RequestBody ProductEntity product){
        productRepository.save(product);
    }
}
