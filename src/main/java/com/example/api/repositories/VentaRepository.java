package com.example.api.repositories;

import com.example.api.entities.Venta;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface VentaRepository extends BaseRepository<Venta, Long> {

    /**
     * Busca ventas por fecha de venta.
     *
     * @param fechaVenta La fecha de venta para buscar.
     * @return Una lista de ventas que coinciden con la fecha especificada.
     */
    List<Venta> findByFechaVenta(LocalDate fechaVenta);

    /**
     * Busca la venta con el monto más alto.
     *
     * @return Una lista de ventas que tienen el monto más alto.
     * Se devuelve una lista en caso de que haya varias ventas con el mismo monto más alto.
     */
    @Query("SELECT v FROM Venta v WHERE v.total = (SELECT MAX(v2.total) FROM Venta v2)")
    List<Venta> findVentaConMontoMasAlto();

}