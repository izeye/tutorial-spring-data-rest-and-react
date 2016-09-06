package com.izeye.payroll.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Controller for home.
 *
 * @author Johnny Lim
 */
@Controller
public class HomeController {

	@GetMapping("/")
	public String index() {
		return "index";
	}

}
