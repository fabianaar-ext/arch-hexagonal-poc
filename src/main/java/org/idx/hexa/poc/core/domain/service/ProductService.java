package org.idx.hexa.poc.core.domain.service;

import org.idx.hexa.poc.adapter.out.repository.oracle.ProductOraclePersistence;
import org.idx.hexa.poc.core.domain.model.Product;
import org.idx.hexa.poc.core.port.in.ProductUseCase;
import org.idx.hexa.poc.core.port.out.ProductOracleProvider;

public class ProductService implements ProductUseCase {
    
    ProductOracleProvider productProvider = new ProductOraclePersistence();
    @Override
    public void createProduct(Product product) {
        System.out.println("CORE 3 ProductService.createProduct");
        
        productProvider.createProduct(product);
    }
}
