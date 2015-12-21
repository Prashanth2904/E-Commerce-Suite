/**
 * 
 */
package com.ecomsuite.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecomsuite.domain.Category;
import com.ecomsuite.repository.TestRespository;
import com.ecomsuite.service.TestService;

/**
 * @author Prashanth
 * @date Mar 22, 2015
 * 
 */
@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private TestRespository testRespository;

	@Override
	public List<Category> getCategories() {
		return testRespository.getCategories();
	}

}
