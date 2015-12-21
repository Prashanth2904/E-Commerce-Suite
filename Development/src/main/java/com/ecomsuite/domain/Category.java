/**
 * 
 */
package com.ecomsuite.domain;

import java.util.List;

import lombok.Data;

/**
 * @author Prashanth
 *
 */
@Data  
public class Category {
	
	private String id;
	
	private String name;
	
	private List<Subcategory> subCategories;
	
	public Category(String id, String name){
		this.id = id;
		this.name = name;
	}

}
