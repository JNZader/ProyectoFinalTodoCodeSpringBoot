package com.example.api.controllers;

import com.example.api.dto.ProductoDTO;
import com.example.api.entities.Producto;
import com.example.api.services.ProductoServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/producto")
public class ProductoControllerImpl
        extends BaseControllerImpl<Producto, ProductoDTO, ProductoServiceImpl>
        implements ProductoController {
}
