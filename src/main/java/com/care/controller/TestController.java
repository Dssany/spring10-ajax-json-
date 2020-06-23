package com.care.controller;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("rest")
public class TestController {
	@GetMapping
	public String get() {return "get실행 : 데이터 요철할때 사용";}
	@PostMapping
	public String post() {return "post실행 : 데이터 추가";}
	@PutMapping
	public String put() {return "put실행 : 데이터 수정";}
	@DeleteMapping
	public String delete() {return "delete실행 : 데이터 삭제";}
}
