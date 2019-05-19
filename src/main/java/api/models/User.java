package api.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import utilities.Capitalizer;

@Entity
@Table(name = "users")
public class User {

	@Id
	String username;
	
	public User() {
		
	}
	
	public User(String username) {
		this.username = Capitalizer.capitalize(username);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
