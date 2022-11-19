package com.PinsoftProje.PinsoftProjews;




import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	@Autowired
	CalculatorService calculatorService;
	
	@PostMapping("/api/calculate")
	public HashMap<String,Integer> calculate(@RequestBody Expression exprs) {	
		return this.calculatorService.calculate(exprs);
	}
}
