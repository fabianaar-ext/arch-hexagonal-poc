package org.idx.hexa.poc.core.port.out;

import org.idx.hexa.poc.core.domain.model.Product;

public interface ProductOracleProvider {
    
    void createProduct(Product product);
}
