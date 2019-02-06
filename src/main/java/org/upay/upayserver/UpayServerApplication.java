package org.upay.upayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class UpayServerApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(UpayServerApplication.class, args);
	}

}

