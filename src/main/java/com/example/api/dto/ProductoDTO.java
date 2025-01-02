package com.example.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
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
public class ProductoDTO extends BaseDTO {

    @NotBlank(message = "El nombre es obligatorio")
    @Size(max = 100, message = "El nombre no puede tener más de 100 caracteres")
    private String nombre;

    @NotBlank(message = "La marca es obligatoria")
    @Size(max = 100, message = "La marca no puede tener más de 100 caracteres")
    private String marca;

    @NotNull(message = "El costo es obligatorio")
    @Positive(message = "El costo debe ser un número positivo")
    private Double costo;

    @NotNull(message = "La cantidad disponible es obligatoria")
    @Positive(message = "La cantidad disponible debe ser un número positivo")
    private Long cantidadDisponible;
}
