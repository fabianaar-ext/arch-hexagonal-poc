package org.idx.hexa.poc.core.port.in;

import org.idx.hexa.poc.core.domain.model.Product;

public interface ProductUseCase {
    
    void createProduct(Product product);
}
