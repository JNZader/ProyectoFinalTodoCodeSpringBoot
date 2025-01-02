package com.example.api.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Entity
@Audited
@Table(name = "productos")
public class Producto extends Base {
    @Column
    private String nombre;

    @Column
    private String marca;

    @Column
    private Double costo;

    @Column
    private Long cantidadDisponible;

    public Boolean actualizarStock(int cantidad) {
        if (cantidadDisponible >= cantidad) {
            cantidadDisponible -= cantidad;
            return true;
        }
        return false;
    }
}
