package com.example.api.services;

import com.example.api.dto.ClienteDTO;
import com.example.api.entities.Cliente;
import com.example.api.mappers.GenericMapper;
import com.example.api.repositories.BaseRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl extends BaseServiceImpl<Cliente, ClienteDTO,Long> implements ClienteService{
    /**
     * Constructor que inicializa el repositorio base, el mapeador y el EntityManager.
     *
     * @param baseRepository el repositorio base utilizado para realizar operaciones CRUD
     * @param mapper         el mapeador que convierte entre entidades y DTOs
     * @param entityManager  el EntityManager para realizar operaciones de persistencia
     */
    protected ClienteServiceImpl(BaseRepository<Cliente, Long> baseRepository, GenericMapper<Cliente, ClienteDTO> mapper, EntityManager entityManager) {
        super(baseRepository, mapper, entityManager);
    }
}
