package com.example.demo;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class Hello {
	
	@ResponseBody
	@RequestMapping("test")
	public String test(HttpServletRequest request) throws IOException {
		BufferedReader reader = request.getReader();
		StringBuffer stringBuffer = new StringBuffer();
		String string = "";
		while ((string = reader.readLine()) != null) {
			stringBuffer.append(string);
		}
		System.out.println(stringBuffer.toString());
		return "";
	}
}
