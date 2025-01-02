package com.example.api.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class ProductoVentaDTO extends BaseDTO {

    @NotNull(message = "La cantidad es obligatoria")
    @Positive(message = "La cantidad debe ser un número positivo")
    private Integer cantidad;

    @NotNull(message = "El precio unitario es obligatorio")
    @Positive(message = "El precio unitario debe ser un número positivo")
    private Double precioUnitario;

    @NotNull(message = "El ID de la venta es obligatorio")
    @Positive(message = "El ID de la venta debe ser un número positivo")
    private Long ventaId;

    @NotNull(message = "El ID del producto es obligatorio")
    @Positive(message = "El ID del producto debe ser un número positivo")
    private Long productoId;
}
