package api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import api.models.Tip;
import api.service.TipsService;

@RestController
@RequestMapping("/tips")
public class TipsController {
	
	TipsService service; 
			
	@GetMapping("/all")
	public List<Tip> getTips(){
		service = new TipsService();
		return service.getAll();
	}
	
	@GetMapping("/")
	public String test() {
		return "tipscontroller";
	}
	
}
