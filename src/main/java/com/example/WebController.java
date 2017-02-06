/**
 * 
 */
package com.example;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Bilgin
 *
 */
@Controller
public class WebController {
	
	@RequestMapping("/mslab1")
	public @ResponseBody String start(){
		
		return "Merhaba Dünyali!";	
	}
	
	@RequestMapping("/thymeleaf/{name}")
	public String thymeleafStart(Map model, @PathVariable String name){
		model.put("name", name);
		return "hello";
	}
	
}
