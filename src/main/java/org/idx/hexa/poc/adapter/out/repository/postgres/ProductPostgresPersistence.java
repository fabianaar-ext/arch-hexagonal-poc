package org.idx.hexa.poc.adapter.out.repository.postgres;

import org.idx.hexa.poc.adapter.out.repository.oracle.ProductEntity;
import org.idx.hexa.poc.adapter.out.repository.oracle.ProductMapper;
import org.idx.hexa.poc.core.domain.model.Product;
import org.idx.hexa.poc.core.port.out.ProductOracleProvider;

public class ProductPostgresPersistence implements ProductOracleProvider {
    
    private ProductMapper mapper = ProductMapper.getMapper();
    @Override
    public void createProduct(Product product) {
        System.out.println("OUT 4 ProductPersistence.createProduct");
        
        org.idx.hexa.poc.adapter.out.repository.oracle.ProductEntity productEntity = mapper.fromDomainToEntity(product);
        persist(productEntity);
    }
    
    private void persist(ProductEntity productEntity) {
        System.out.println("OUT 6 sending to Oracle DB");
    }
}
