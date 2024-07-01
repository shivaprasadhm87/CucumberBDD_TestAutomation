package com.shiftlefttautomation.api.pages;

public class Phone {
	private String id;
    private String name;
    private double price;
 
    public Phone(String id,String name, double price) {
        this.id=id;
    	this.name = name;
        this.price = price;
    }
    public Phone(String name, double price) {       
    	this.name = name;
        this.price = price;
    }
    
    public String getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
 
    public double getPrice() {
        return price;
    }

    
    
}
