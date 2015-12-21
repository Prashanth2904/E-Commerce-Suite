package com.ecomsuite;

import java.util.HashMap;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.ecomsuite.controller.TestController;
import com.ecomsuite.repository.TestRespository;
import com.ecomsuite.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = EcomSuiteApplication.class)
@WebAppConfiguration
public class EcomSuiteApplicationTests {

	@Autowired
	private TestController testController;
	
	@Autowired
	private TestService testService;
	
	@Autowired
	private TestRespository testRespository;
	
	@Test
	public void controllerTest() {
		String expected = "home";
		String actual = testController.getLoginPage(new HashMap<String, Object>());
		Assert.assertEquals(expected, actual);
	}

	@Test
	public void serviceTest() {
		int expected = 8;
		int actual = testService.getCategories().size();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void repositoryTest() {
		int expected = 8;
		int actual = testRespository.getCategories().size();
		Assert.assertEquals(expected, actual);
	}
}
