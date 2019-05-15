package api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name = "Tips")
public class Tip {

	
	//@GeneratedValue
	@Id
	private String id;

	//@Column(name = "title")
	private String title;
	
	//@Column(name = "description")
	private String description;
	
	//@Column(name = "category")
	private int category;
	
	//@Column(name = "likes")
	private int likes;

	//@Column(name = "creator_id")
	private int creator_id;
	

	public Tip() {
		super();
	}

	public Tip(String id, String title, String description, int category, int likes, int creator_id) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.category = category;
		this.likes = likes;
		this.creator_id = creator_id;
	}
	
	//Constructor to be called by request
	public Tip(String title, String description, int category, int likes, int creator_id) {
		super();
		this.title = title;
		this.description = description;
		this.category = category;
		this.likes = likes;
		this.creator_id = creator_id;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
	
	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getCreator_id() {
		return creator_id;
	}

	public void setCreator(int creator_id) {
		this.creator_id = creator_id;
	}

}
