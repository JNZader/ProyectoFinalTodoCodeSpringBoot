package com.example.api.services;

import com.example.api.dto.VentaDTO;
import com.example.api.entities.Venta;
import com.example.api.mappers.GenericMapper;
import com.example.api.repositories.BaseRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class VentaServiceImpl extends BaseServiceImpl<Venta, VentaDTO,Long> implements VentaService{
    /**
     * Constructor que inicializa el repositorio base, el mapeador y el EntityManager.
     *
     * @param baseRepository el repositorio base utilizado para realizar operaciones CRUD
     * @param mapper         el mapeador que convierte entre entidades y DTOs
     * @param entityManager  el EntityManager para realizar operaciones de persistencia
     */
    protected VentaServiceImpl(BaseRepository<Venta, Long> baseRepository, GenericMapper<Venta, VentaDTO> mapper, EntityManager entityManager) {
        super(baseRepository, mapper, entityManager);
    }
}
