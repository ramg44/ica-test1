package com.ica.test1.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author ramrushendranathgulla
 *
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "ramica")
public class RestController {
	@GetMapping("/counterUrinals")
	public int counterUrinals(String str)
	{
		return 1;
	}
}
