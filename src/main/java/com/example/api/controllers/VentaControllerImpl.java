package com.example.api.controllers;

import com.example.api.dto.VentaDTO;
import com.example.api.entities.Venta;
import com.example.api.services.VentaServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/venta")
public class VentaControllerImpl
        extends BaseControllerImpl<Venta, VentaDTO, VentaServiceImpl>
        implements VentaController {
}
