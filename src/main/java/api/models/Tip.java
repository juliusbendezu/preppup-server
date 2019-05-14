package api.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Tip {

	@Id
	int id;

	String title;
	String description;
	int category;
	int creator_id;
	
	public Tip(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public int getCreator_id() {
		return creator_id;
	}

	public void setCreator(int creator_id) {
		this.creator_id = creator_id;
	}

}
