package com.care.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping(value="rest",produces="application/text;charset=utf-8")
	public String get() {return "get실행 : 데이터 요청할때 사용";}
	@PostMapping(value="rest",produces="application/text;charset=utf-8")
	public String post() {return "post실행 : 데이터 추가";}
	@PutMapping(value="rest",produces="application/text;charset=utf-8")
	public String put() {return "put실행 : 데이터 수정";}
	@DeleteMapping(value="rest",produces="application/text;charset=utf-8")
	public String delete() {return "delete실행 : 데이터 삭제";}
}
