package com.example.api.repositories;

import com.example.api.entities.Producto;

import java.util.List;

public interface ProductoRepository extends BaseRepository<Producto, Long> {

    /**
     * Busca productos por cantidad disponible menor que un valor especificado.
     *
     * @param cantidad La cantidad disponible para buscar.
     * @return Una lista de productos que tienen una cantidad disponible menor que el valor especificado.
     */
    List<Producto> findByCantidadDisponibleLessThan(Integer cantidad);

}