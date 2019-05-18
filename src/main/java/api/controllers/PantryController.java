package api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import api.models.PantryItem;
import api.service.PantryService;

@RestController
@RequestMapping("/pantry")
public class PantryController {
	
	@Autowired
	PantryService pantryService;
	
	@GetMapping("/all")
	public List<PantryItem> getPantries(){
		return pantryService.getPantries();
	}
	@GetMapping("/{user}")
	public List<PantryItem> getPantry(@PathVariable String user){
		return pantryService.getPantry(user);
	}
	
	@PostMapping("/add")
	public void addPantryItem(@RequestBody PantryItem pantryItem) {
		pantryService.addPantryItem(pantryItem);
	}
}
