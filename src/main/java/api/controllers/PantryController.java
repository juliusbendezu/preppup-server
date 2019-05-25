package api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
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
	
	@GetMapping("/{user}/{category}")
	public List<PantryItem> getItemsByCategory(@PathVariable String user, @PathVariable String category){
		return pantryService.getItemsByCategory(user, category);
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping("/add")
	public void addPantryItem(@RequestBody PantryItem pantryItem) {
		pantryService.addPantryItem(pantryItem);
	}
}
