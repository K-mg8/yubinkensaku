package com.hoget.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class FrontServiceImpl implements FrontService{
	
	@Autowired
	ObjectMapper objectMapper;
	
	RestTemplate restTemplate = new RestTemplate();
	private static final String URL = "https://zip-cloud.appspot.com/api/search?zipcode={zipcode}";
	// private static final String URL = "https://zip-cloud.appspot.com/api/search?zipcode=%s";
	
			
	@Override
	public String getAddress(String zipCode) {
		String zipCodeJson = restTemplate.getForObject(URL,String.class,zipCode);
		
		return zipCodeJson;
	}
	/** public ZipcodeDto getAddress(String zipCode) {
		
		ZipcodeDto zipcodeDto = null;;
		try {
			// OdjectMapperでURLと受け取りクラスを指定
			java.net.URL url = new java.net.URL(String.format(URL, zipCode));
			zipcodeDto = objectMapper.readValue(url, ZipcodeDto.class);
			
		} catch (Exception e) {
			e.getStackTrace();
		}
		return zipcodeDto;
		
	} */

}