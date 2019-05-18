package api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import api.models.Tip;
import api.service.TipsService;

@RestController
@RequestMapping("/tips")
public class TipsController {

	@Autowired
	TipsService service;

	@GetMapping("/all")
	public List<Tip> getTips() {
		return service.getAll();
	}

	@GetMapping("/{id}")
	public Tip getTipById(@PathVariable int id) {
		return service.getTipById(id);
	}

	@GetMapping("/all/{category}")
	public List<Tip> getTipByCategory(@PathVariable int category) {
		return service.getTipsByCategory(category);
	}

	@GetMapping("/by/{creator_username}")
	public List<Tip> getTipByCreator(@PathVariable String creator_username) {
		return service.getTipsByCreator(creator_username);
	}

	@PostMapping("/add")
	public void addTip(@RequestBody Tip tip) {
		service.addTip(tip);
	}

	@GetMapping("/{id}/like")
	public void likeTip(@PathVariable int id) {
		service.likeTip(id);
	}

	@PutMapping("/update")
	public void updateTip(@RequestBody Tip tip) {
		service.updateTip(tip);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteTip(@PathVariable int id) {
		service.deleteTip(id);
	}

	@GetMapping("/")
	public String test() {
		return "tipscontroller";
	}

}
