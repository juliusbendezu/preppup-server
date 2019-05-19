package api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

import api.models.PantryItem;
import api.repository.PantryRepository;
import utilities.Capitalizer;

@Service
public class PantryService {

	@Autowired
	PantryRepository pantryRepository;

	public List<PantryItem> getPantry(String user) {
		return pantryRepository.getUserPantry(user);
	}

	public void addPantryItem(PantryItem pantryItem) {
		pantryRepository.save(pantryItem);
	}

	public List<PantryItem> getPantries() {
		List<PantryItem> pantries = pantryRepository.findAll();
		return pantries;
	}

	public List<PantryItem> getItemsByCategory(String owner, String category) {
		category = Capitalizer.capitalize(category);
		return pantryRepository.getItemsByCategory(owner, category);
	}
}
