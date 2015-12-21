/**
 * 
 */
package com.ecomsuite.repository.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.ecomsuite.domain.Category;
import com.ecomsuite.domain.Customer;
import com.ecomsuite.repository.TestRespository;

/**
 * @author Prashanth
 * @date Mar 22, 2015
 * 
 */
@Repository
public class TestRespositoryImpl extends JdbcTemplate implements TestRespository {

	@Autowired
	@Override
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}
	
	@Override
	public List<Customer> getCustomers() {
		return query("SELECT * FROM vendor", new ResultSetExtractor<List<Customer>>(){
			@Override
			public List<Customer> extractData(ResultSet rs)
					throws SQLException, DataAccessException {
				List<Customer> customers = new ArrayList<Customer>();
				while(rs.next()){  
					Customer c = new Customer(rs.getInt(1), rs.getString(2));  
				    customers.add(c);
				   }  
				return customers;
			}
		});
	}

	@Override
	public List<Category> getCategories() {
		List<Category> categories = new ArrayList<Category>();
		categories.add(new Category("CAT001", "Electronics"));
		categories.add(new Category("CAT002", "Men"));
		categories.add(new Category("CAT003", "Women"));
		categories.add(new Category("CAT004", "Baby & Kids"));
		categories.add(new Category("CAT005", "Home & Furniture"));
		categories.add(new Category("CAT006", "Books & Media"));
		categories.add(new Category("CAT007", "Auto & Sports"));
		categories.add(new Category("CAT008", "Offers"));
		return categories;
	}
	
}
