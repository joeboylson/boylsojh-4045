package com.boylsojh_4045.boylsojh_4045;
import org.springframework.web.bind.annotation.RequestMapping;

public class boylsojh_4045Controller {

	@RequestMapping("/")
	public String start() {
		return "index";
	}
	
}
