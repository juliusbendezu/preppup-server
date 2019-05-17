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

	
	@GeneratedValue
	@Id
	private int id;

	//@Column(name = "title")
	private String title;
	
	//@Column(name = "description")
	private String description;
	
	//@Column(name = "category")
	private boolean värme;
	
	private boolean vatten;
	
	private boolean skydd;

	private boolean mat;
	
	private boolean sjukvård;
	
	private boolean infosec;
	
	//@Column(name = "likes")
	private int likes;

	//@Column(name = "creator_id")
	private int creator_id;
	

	public Tip() {
		super();
	}

	public Tip(int id, String title, String description, 
			boolean värme, boolean vatten, boolean skydd, boolean mat, boolean sjukvård, boolean infosec, 
			int likes, int creator_id) {
		super();	
		this.id = id;
		this.title = title;
		this.description = description;
		this.värme = värme;
		this.vatten = vatten;
		this.skydd = skydd;
		this.mat = mat;
		this.sjukvård = sjukvård;
		this.infosec = infosec;
		this.likes = likes;
		this.creator_id = creator_id;
	}
	
	//Constructor to be called by request (ID generates)
	public Tip(String title, String description, boolean värme, boolean vatten, boolean skydd, boolean mat,
			boolean sjukvård, boolean infosec, int likes, int creator_id) {
		super();
		this.title = title;
		this.description = description;
		this.värme = värme;
		this.vatten = vatten;
		this.skydd = skydd;
		this.mat = mat;
		this.sjukvård = sjukvård;
		this.infosec = infosec;
		this.likes = likes;
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

	public boolean isVärme() {
		return värme;
	}

	public void setVärme(boolean värme) {
		this.värme = värme;
	}

	public boolean isVatten() {
		return vatten;
	}

	public void setVatten(boolean vatten) {
		this.vatten = vatten;
	}

	public boolean isSkydd() {
		return skydd;
	}

	public void setSkydd(boolean skydd) {
		this.skydd = skydd;
	}

	public boolean isMat() {
		return mat;
	}

	public void setMat(boolean mat) {
		this.mat = mat;
	}

	public boolean isSjukvård() {
		return sjukvård;
	}

	public void setSjukvård(boolean sjukvård) {
		this.sjukvård = sjukvård;
	}

	public boolean isInfosec() {
		return infosec;
	}

	public void setInfosec(boolean infosec) {
		this.infosec = infosec;
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
