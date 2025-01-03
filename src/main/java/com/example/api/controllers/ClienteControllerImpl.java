package com.example.api.controllers;

import com.example.api.dto.ClienteDTO;
import com.example.api.entities.Cliente;
import com.example.api.services.ClienteServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/cliente")
public class ClienteControllerImpl
        extends BaseControllerImpl<Cliente, ClienteDTO, ClienteServiceImpl>
        implements ClienteController {
}
