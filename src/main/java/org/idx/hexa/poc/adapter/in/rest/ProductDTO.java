package org.idx.hexa.poc.adapter.in.rest;

public class ProductDTO {
    
    private String shortName;
    private String LastName;
    
    public ProductDTO(String shortName, String LastName) {
        this.shortName = shortName;
        this.LastName = LastName;
    }

    public String getLastName() {
        return LastName;
    }
    
    public String getShortName() {
        return shortName;
    }
    
}
