package com.fdmgroup.icode.metrics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MetricsController {
	private MetricsService service;

	public MetricsController(MetricsService service) {
		super();
		this.service = service;
	}

	@GetMapping("/converterpage")
	public String loadConverter() {
		return "metrics/converter";
	}

	@PostMapping("/converter")
	public String convertMetrics(@RequestParam("unit") String unit, @RequestParam("value") double value, Model model) {
		ResultDto rdto = new ResultDto();

		// Perform conversion logic based on the selected unit
		if ((unit.equals("metersToFeet")) || (unit.equals("feetToMeters"))) {
			rdto = service.convertMetersFeet(unit, value);
		}
		if ((unit.equals("metersToKilometers")) || (unit.equals("KilometersToMeters"))) {
			rdto = service.convertMetersKilometers(unit, value);
		}
		/************** ADD CODE BELOW *******************/
		
		
		/************* ADD CODE ABOVE ******************/

		// Pass the result and units back to the view
		model.addAttribute("result", rdto.result);
		model.addAttribute("value", value);
		model.addAttribute("fromUnit", rdto.fromUnit);
		model.addAttribute("convertedUnit", rdto.convertedUnit);

		return "metrics/converter";
	}
}
