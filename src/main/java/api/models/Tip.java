package api.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tips")
public class Tip implements Comparable<Tip> {

	@GeneratedValue
	@Id
	private int id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "warmth")
	private boolean warmth;

	@Column(name = "water")
	private boolean water;

	@Column(name = "shelter")
	private boolean shelter;

	@Column(name = "food")
	private boolean food;

	@Column(name = "health")
	private boolean health;

	@Column(name = "security")
	private boolean security;

	@Column(name = "storage")
	private boolean storage;

	@Column(name = "other")
	private boolean other;

	@Column(name = "likes")
	private int likes;

	@Column(name = "creator")
	private String creator;

	public Tip() {
		super();
	}

	public Tip(int id, String title, String description, boolean warmth, boolean water, boolean shelter, boolean food,
			boolean health, boolean security, boolean storage, boolean other, int likes, String creator) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.warmth = warmth;
		this.water = water;
		this.shelter = shelter;
		this.food = food;
		this.health = health;
		this.security = security;
		this.storage = storage;
		this.other = other;
		this.likes = likes;
		this.creator = creator;
	}

	public Tip(String title, String description, boolean warmth, boolean water, boolean shelter, boolean food,
			boolean health, boolean security, boolean storage, boolean other, int likes, String creator) {
		super();
		this.title = title;
		this.description = description;
		this.warmth = warmth;
		this.water = water;
		this.shelter = shelter;
		this.food = food;
		this.health = health;
		this.security = security;
		this.storage = storage;
		this.other = other;
		this.likes = likes;
		this.creator = creator;
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

	public boolean isWarmth() {
		return warmth;
	}

	public void setWarmth(boolean warmth) {
		this.warmth = warmth;
	}

	public boolean isWater() {
		return water;
	}

	public void setWater(boolean water) {
		this.water = water;
	}

	public boolean isShelter() {
		return shelter;
	}

	public void setShelter(boolean shelter) {
		this.shelter = shelter;
	}

	public boolean isFood() {
		return food;
	}

	public void setFood(boolean food) {
		this.food = food;
	}

	public boolean isHealth() {
		return health;
	}

	public void setHealth(boolean health) {
		this.health = health;
	}

	public boolean isSecurity() {
		return security;
	}

	public void setSecurity(boolean security) {
		this.security = security;
	}

	public boolean isStorage() {
		return storage;
	}

	public void setStorage(boolean storage) {
		this.storage = storage;
	}

	public boolean isOther() {
		return other;
	}

	public void setOther(boolean other) {
		this.other = other;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public void like() {
		likes++;
	}

	public String getCreator() {
		return creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	@Override
	public int compareTo(Tip other) {
		return Integer.compare(other.likes, likes);
	}

}
