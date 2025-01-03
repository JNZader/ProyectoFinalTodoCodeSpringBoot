package com.example.api.controllers;

import com.example.api.dto.ProductoDTO;
import com.example.api.entities.Producto;
import com.example.api.services.ProductoServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/producto")
public class ProductoControllerImpl
        extends BaseControllerImpl<Producto, ProductoDTO, ProductoServiceImpl>
        implements ProductoController {

    @Override
    @GetMapping("/buscar_por_stock/{cantidad}")
    public List<ProductoDTO> buscarPorStockRepo(@PathVariable Integer cantidad) {
        return servicio.findByCantidadDisponibleLessThan(cantidad);
    }
}
