package com.example.api.dto;

import jakarta.validation.constraints.*;
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
public class VentaConDetalleDTO {

    @NotNull(message = "El código de venta es obligatorio")
    @Positive(message = "El código de venta debe ser un número positivo")
    private Long codigoVenta;

    @NotNull(message = "La fecha de venta es obligatoria")
    @FutureOrPresent(message = "La fecha de venta debe ser una fecha presente o futura")
    private LocalDate fechaVenta;

    @NotNull(message = "El total es obligatorio")
    @Positive(message = "El total debe ser un número positivo")
    private Double total;

    @NotBlank(message = "El nombre del cliente es obligatorio")
    @Size(max = 100, message = "El nombre del cliente no puede tener más de 100 caracteres")
    private String nombreCliente;

    @NotBlank(message = "El apellido del cliente es obligatorio")
    @Size(max = 100, message = "El apellido del cliente no puede tener más de 100 caracteres")
    private String apellidoCliente;

    @NotNull(message = "La lista de productos es obligatoria")
    @Size(min = 1, message = "Debe haber al menos un producto en la venta")
    private List<ProductoVentaDTO> productos;
}