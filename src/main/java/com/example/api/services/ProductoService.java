package com.example.api.services;

import com.example.api.dto.ProductoDTO;
import com.example.api.entities.Producto;

import java.util.List;

public interface ProductoService extends BaseService<Producto, ProductoDTO, Long> {

    List<ProductoDTO> findByCantidadDisponibleLessThan(Integer cantidad);

}
