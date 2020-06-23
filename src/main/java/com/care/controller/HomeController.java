package com.care.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.care.dto.InfoDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@RequestMapping("non_ajax")
	public String non_ajax() {
		return "non_ajax";
	}
	
	@RequestMapping("ajax")
	public String ajax() {
		System.out.println("ajax실행");
		return "ajax";
	}
	
	static int cnt =0;
	@RequestMapping("ajax_result")
	@ResponseBody
	public String ajax_result() {
		
		return ++cnt + "";
	}
	
	
	@RequestMapping("ajax02")
	public String ajax02() {
		System.out.println("ajax02실행");
		return "ajax02";
	}
	
	
	@RequestMapping(value="ajax_result02",produces="application/text;charset=utf-8")
	@ResponseBody
	public String ajax_result02(InfoDTO Info) {
		System.out.println("name : " + Info.getName());
		System.out.println("age : " + Info.getAge());
		return Info.getName() + ":" + Info.getAge();
	}
	
	@RequestMapping(value="ajax_json02", 
			produces="application/json;charset=utf-8")
	@ResponseBody
	public String ajax_json(InfoDTO info) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String strJson = mapper.writeValueAsString(info);
		return strJson;
	}
	@GetMapping("ajax_json")
	public String ajax_json02() {
		return "ajax_json";
	}
	
}
