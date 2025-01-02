package com.example.api.repositories;

import com.example.api.entities.ProductoVenta;

import java.util.List;

public interface ProductoVentaRepository extends BaseRepository<ProductoVenta, Long> {

    /**
     * Busca productos vendidos por el ID de la venta.
     *
     * @param ventaId El ID de la venta para buscar.
     * @return Una lista de productos vendidos que coinciden con el ID de venta especificado.
     */
    List<ProductoVenta> findByVentaId(Long ventaId);

}