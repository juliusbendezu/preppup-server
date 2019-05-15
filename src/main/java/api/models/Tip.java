package api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tips")
public class Tip {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "category")
	private int category;
	
	@Column(name = "creator_id")
	private int creator_id;
	

	public Tip() {
		super();
	}

	public Tip(int id, String title, String description, int category, int creator_id) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.creator_id = creator_id;
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
