package com.ecomsuite.domain;

import java.util.List;

import lombok.Data;

/**
 * @author Prashanth
 *
 */
@Data 
public class Subcategory {
	
	private String id;
	
	private String name;
	
	private List<Product> subCategories;
	
	public Subcategory(String id, String name){
		this.id = id;
		this.name = name;
	}
}
