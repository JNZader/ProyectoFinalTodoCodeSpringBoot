package com.example.api.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class VentaDTO extends BaseDTO {

    @NotNull(message = "La fecha de venta es obligatoria")
    @FutureOrPresent(message = "La fecha de venta debe ser una fecha presente o futura")
    private LocalDate fechaVenta;

    @NotNull(message = "El total es obligatorio")
    @Positive(message = "El total debe ser un número positivo")
    private Double total;

    private List<ProductoVentaDTO> productosVenta;
}