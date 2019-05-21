package api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import utilities.Capitalizer;

@Entity
@Table(name = "pantry_items")
public class PantryItem {

	@Id
	@GeneratedValue
	int id;

	String name;
	String category;
	@Column(name = "expiry_date")
	String expiryDate;
	@Column(name = "generalCategory")
	String generalCategory;
	int amount;
	int calories;
	int fat;
	int carbs;
	int protein;
	String owner;

	public PantryItem() {

	}

	// Without id
	public PantryItem(String name, String category, String expiryDate, String generalCategory, int amount, int calories,
			int fat, int carbs, int protein, String owner) {
		this.name = Capitalizer.capitalize(name);
		this.category = Capitalizer.capitalize(category);
		this.expiryDate = expiryDate;
		this.generalCategory = Capitalizer.capitalize(generalCategory);
		this.amount = amount;
		this.calories = calories;
		this.fat = fat;
		this.carbs = carbs;
		this.protein = protein;
		this.owner = owner;
	}

	// With id
	public PantryItem(int id, String name, String category, String expiryDate, String generalCategory, int amount,
			int calories, int fat, int carbs, int protein, String owner) {
		this(name, category, expiryDate, generalCategory, amount, calories, fat, carbs, protein, owner);
		this.id = id;
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

	public String getGeneralCategory() {
		return generalCategory;
	}

	public void setGeneralCategory(String generalCategory) {
		this.generalCategory = generalCategory;
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
