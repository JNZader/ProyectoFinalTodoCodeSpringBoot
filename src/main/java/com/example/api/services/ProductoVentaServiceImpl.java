package com.example.api.services;

import com.example.api.dto.ProductoVentaDTO;
import com.example.api.entities.ProductoVenta;
import com.example.api.mappers.GenericMapper;
import com.example.api.repositories.BaseRepository;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;

@Service
public class ProductoVentaServiceImpl extends BaseServiceImpl<ProductoVenta, ProductoVentaDTO,Long> implements ProductoVentaService{
    /**
     * Constructor que inicializa el repositorio base, el mapeador y el EntityManager.
     *
     * @param baseRepository el repositorio base utilizado para realizar operaciones CRUD
     * @param mapper         el mapeador que convierte entre entidades y DTOs
     * @param entityManager  el EntityManager para realizar operaciones de persistencia
     */
    protected ProductoVentaServiceImpl(BaseRepository<ProductoVenta, Long> baseRepository,
                                       GenericMapper<ProductoVenta, ProductoVentaDTO> mapper,
                                       EntityManager entityManager) {
        super(baseRepository, mapper, entityManager);
    }
}
