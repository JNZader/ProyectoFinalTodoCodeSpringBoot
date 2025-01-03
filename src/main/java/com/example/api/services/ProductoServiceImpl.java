package com.example.api.services;

import com.example.api.dto.ProductoDTO;
import com.example.api.entities.Producto;
import com.example.api.mappers.GenericMapper;
import com.example.api.repositories.BaseRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto, ProductoDTO,Long> implements ProductoService{
    /**
     * Constructor que inicializa el repositorio base, el mapeador y el EntityManager.
     *
     * @param baseRepository el repositorio base utilizado para realizar operaciones CRUD
     * @param mapper         el mapeador que convierte entre entidades y DTOs
     * @param entityManager  el EntityManager para realizar operaciones de persistencia
     */
    protected ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, GenericMapper<Producto, ProductoDTO> mapper, EntityManager entityManager) {
        super(baseRepository, mapper, entityManager);
    }
}
