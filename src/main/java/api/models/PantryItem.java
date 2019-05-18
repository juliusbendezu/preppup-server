package api.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import utilities.Capitalizer;

@Entity
public class PantryItem {

	@Id
	@GeneratedValue
	int id;

	String name;
	String category;
	String expiryDate;
	int amount;
	int calories;
	int fat;
	int carbs;
	int protein;
	String owner;
	
	public PantryItem() {
		
	}

	// With ID
	public PantryItem(int id, String name, String category, String expiryDate, int amount, int calories, int fat,
			int carbs, int protein, String owner) {
		this.id = id;
		this.name = Capitalizer.capitalize(name);
		this.category = Capitalizer.capitalize(category);
		this.expiryDate = expiryDate;
		this.amount = amount;
		this.calories = calories;
		this.fat = fat;
		this.carbs = carbs;
		this.protein = protein;
		this.owner = owner;
	}

	// Without ID
	public PantryItem(String name, String category, String expiryDate, int amount, int calories, int fat, int carbs,
			int protein, String owner) {
		this.name = name;
		this.category = category;
		this.expiryDate = expiryDate;
		this.amount = amount;
		this.calories = calories;
		this.fat = fat;
		this.carbs = carbs;
		this.protein = protein;
		this.owner = owner;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return fat;
	}

	public void setFat(int fat) {
		this.fat = fat;
	}

	public int getCarbs() {
		return carbs;
	}

	public void setCarbs(int carbs) {
		this.carbs = carbs;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
}
