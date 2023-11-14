package org.idx.hexa.poc.adapter.out.repository.oracle;

public class ProductEntity {
    
    private String name;
    private String description;
    
    public ProductEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDescription() {
        return description;
    }
}
