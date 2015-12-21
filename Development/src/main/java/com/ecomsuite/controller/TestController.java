/**
 * 
 */
package com.ecomsuite.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ecomsuite.service.TestService;

/**
 * This is controller, which communicates with front end and service layer's business logic.
 * 
 * @author Prashanth
 * @date Dec 16, 2015
 */

@Controller
public class TestController {
	
	@Autowired
	private TestService testService;

	@RequestMapping(value="/login", method=RequestMethod.GET)
    public String getLoginPage(Map<String, Object> model) {
		model.put("categories", testService.getCategories());
        return "home";
    }

	
}
