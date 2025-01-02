package com.example.api.config;

import com.example.api.dto.ClienteDTO;
import com.example.api.dto.ProductoDTO;
import com.example.api.dto.ProductoVentaDTO;
import com.example.api.dto.VentaDTO;
import com.example.api.entities.Cliente;
import com.example.api.entities.Producto;
import com.example.api.entities.ProductoVenta;
import com.example.api.entities.Venta;
import com.example.api.mappers.GenericMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MapperConfig es una clase de configuración que define los beans de mapeo
 * para las entidades y sus respectivos DTOs (Data Transfer Objects) en la aplicación.
 * Utiliza la anotación {@link Configuration} para indicar que esta clase puede
 * contener definiciones de beans que serán gestionadas por el contexto de Spring.
 */
@Configuration
public class MapperConfig {


    @Bean
    public GenericMapper<Cliente, ClienteDTO> clienteMapper() {
        return new GenericMapper<>(Cliente.class, ClienteDTO.class);
    }

    @Bean
    public GenericMapper<Producto, ProductoDTO> productoMapper() {
        return new GenericMapper<>(Producto.class, ProductoDTO.class);
    }

    @Bean
    public GenericMapper<Venta, VentaDTO> ventaMapper() {
        return new GenericMapper<>(Venta.class, VentaDTO.class);
    }

    @Bean
    public GenericMapper<ProductoVenta, ProductoVentaDTO> productoVentaMapper() {
        return new GenericMapper<>(ProductoVenta.class, ProductoVentaDTO.class);
    }

}
