package org.idx.hexa.poc.adapter.in.rest;

import org.idx.hexa.poc.core.domain.model.Product;

public class ProductMapper {

    private static final ProductMapper mapper = new ProductMapper();
    
    public static ProductMapper getMapper() {
        return mapper;
    }
    
    private ProductMapper() {
        // Utility class
    }
    
    public Product fromDtoToEntity(ProductDTO dto) {
        System.out.println("IN 2 ProductMapper.fromDtoToEntity");
        
        Product entity = new Product();
        entity.setCompleteName(dto.getShortName());
        entity.setDescription(dto.getLastName());
        return entity;
    }
}
