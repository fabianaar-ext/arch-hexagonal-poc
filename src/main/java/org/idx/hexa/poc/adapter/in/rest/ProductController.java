package org.idx.hexa.poc.adapter.in.rest;

import org.idx.hexa.poc.core.domain.model.Product;
import org.idx.hexa.poc.core.domain.service.ProductService;
import org.idx.hexa.poc.core.port.in.ProductUseCase;

public class ProductController {

    ProductUseCase productUseCase = new ProductService();
    ProductMapper mapper = ProductMapper.getMapper();
            
    public void createProduct(ProductDTO dto) {
        System.out.println("IN 1 ProductController.createProduct");
        
        Product request = mapper.fromDtoToEntity(dto);
        
        productUseCase.createProduct(request);
        
    }
    
}
