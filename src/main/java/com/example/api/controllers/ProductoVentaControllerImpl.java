package com.example.api.controllers;

import com.example.api.dto.ProductoVentaDTO;
import com.example.api.entities.ProductoVenta;
import com.example.api.services.ProductoVentaServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/productoVentas")
public class ProductoVentaControllerImpl
        extends BaseControllerImpl<ProductoVenta, ProductoVentaDTO, ProductoVentaServiceImpl>
        implements ProductoVentaController {
}
