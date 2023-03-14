package com.hoget.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hoget.DTO.ZipcodeDto;
import com.hoget.service.FrontService;

@Controller

public class FrontController {
	@Autowired
	private FrontService frontService;
	
	
	@GetMapping("/zip2address")
	public String yubinList(Model model,String zipCode) throws JsonMappingException, JsonProcessingException {
		
		ObjectMapper mapper = new ObjectMapper();
		ZipcodeDto zcd = mapper.readValue(frontService.getAddress(zipCode), ZipcodeDto.class);
		model.addAttribute("zip2address",zcd.results);
		
		return "yubinList";
	}
	/** public ZipcodeDto zip2address(String zipCode) {
		return frontService.getAddress(zipCode);
	} */

}
