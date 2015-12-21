/**
 * 
 */
package com.ecomsuite.repository;

import java.util.List;

import com.ecomsuite.domain.Category;
import com.ecomsuite.domain.Customer;

/**
 * Respository class the communicates with a database and does crud operations.
 * 
 * @author Prashanth
 * @date Dec 15, 2015
 * 
 */
public interface TestRespository {

	List<Category> getCategories();
	
	List<Customer> getCustomers();

}
