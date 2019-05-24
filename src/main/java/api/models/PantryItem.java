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

	@Column(name = "name")
	String name;
	@Column(name = "category")
	String category;
	@Column(name = "general_category")
	String generalCategory;
	@Column(name = "expiry_date")
	String expiryDate;
	@Column(name = "amount")
	int amount;
	@Column(name = "owner")
	String owner;

	public PantryItem() {

	}

	// Without id
	public PantryItem(String name, String category, String generalCategory, String expiryDate, int amount, String owner) {
		this.name = Capitalizer.capitalize(name);
		this.category = Capitalizer.capitalize(category);
		this.expiryDate = expiryDate.isEmpty() ? "-" : expiryDate;
		this.generalCategory = Capitalizer.capitalize(generalCategory);
		this.amount = amount;
		this.owner = owner;
	}

	// With id
	public PantryItem(int id, String name, String category, String generalCategory, String expiryDate, int amount, String owner) {
		this(name, category, generalCategory, expiryDate, amount, owner);
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
	
	public String getGeneralCategory() {
		return generalCategory;
	}

	public void setGeneralCategory(String generalCategory) {
		this.generalCategory = generalCategory;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
