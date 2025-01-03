package com.example.api.controllers;

import com.example.api.dto.ProductoDTO;
import com.example.api.entities.Producto;

import java.util.List;

public interface ProductoController extends BaseController<Producto, ProductoDTO,Long>{

    List<ProductoDTO>buscarPorStockRepo(Integer cantidad);

}
