package com.example.api.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Audited
@Table(name = "ventas")
public class Venta extends Base {
    @Column
    private LocalDate fechaVenta;

    @Column
    private Double total;

    @OneToMany(mappedBy = "venta", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProductoVenta> productosVenta = new ArrayList<>();

    public void addProductoVenta(ProductoVenta productoVenta) {
        productosVenta.add(productoVenta);
        productoVenta.setVenta(this);
    }

    public void removeProductoVenta(ProductoVenta productoVenta) {
        productoVenta.setVenta(null);
        productosVenta.remove(productoVenta);

    }
}
