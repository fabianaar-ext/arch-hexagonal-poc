package org.idx.hexa.poc.adapter.out.repository.oracle;

import org.idx.hexa.poc.core.domain.model.Product;

public class ProductMapper {
    
    private static ProductMapper mapper = new ProductMapper();
    
    private ProductMapper() {
    }
    
    public static ProductMapper getMapper() {
        return mapper;
    }
    
    public ProductEntity fromDomainToEntity(Product product) {
        System.out.println("OUT 5 ProductMapper.fromDomainToEntity");
        
        return new ProductEntity(product.getCompleteName(), product.getDescription());
    }
}
