package api.controllers;

import java.sql.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tips")
public class TipsController {
	
	@RequestMapping("/dbtest")
	public String test() {
		Connect();
		return "";
	}


	@GetMapping("/bycategory")
	public String GetTipsFromCategory(@RequestParam(value="category") String category) {
		
		Connect();
		return "Test";
	}
	
	
	private void Connect() {
		String url = "jdbc:mysql://@mysql.dsv.su.se/jeve9726";
		String username = "jeve9726";
		String password = "too0EeQuah1A";

		System.out.println("Connecting database...");

		try (Connection connection = DriverManager.getConnection(url, username, password)) {
		    System.out.println("Database connected!");
		} catch (SQLException e) {
		    throw new IllegalStateException("Cannot connect the database!", e);
		}
	}
}
