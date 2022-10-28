package com.ica.test1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ica.test1.service.Urinals;

/**
 * 
 * @author ramrushendranathgulla
 *
 */
@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "ramica")
public class RestController {

	@Autowired
	private Urinals urinals;

	@GetMapping("/counterUrinals")
	public int counterUrinals(@RequestParam String str) {

		return urinals.countUrinals(str);
	}
}
