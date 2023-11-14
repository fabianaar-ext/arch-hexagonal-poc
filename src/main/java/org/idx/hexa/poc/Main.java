package org.idx.hexa.poc;

import org.idx.hexa.poc.adapter.in.rest.ProductController;
import org.idx.hexa.poc.adapter.in.rest.ProductDTO;

public class Main {

  public static void main(String[] args) {
    
    System.out.println("0 Starting request...");

    new ProductController().createProduct(getProductMock());
  }

  private static ProductDTO getProductMock() {
    return new ProductDTO("Product 1", "Description 1");
  }
}