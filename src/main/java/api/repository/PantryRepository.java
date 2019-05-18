package api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

import api.models.PantryItem;

@Repository
public interface PantryRepository extends JpaRepository<PantryItem, Integer> {

	@Query(value = "SELECT * FROM pantry_items WHERE owner = :owner", nativeQuery = true)
	public List<PantryItem> getUserPantry(@Param("owner") String owner);

	@Query(value = "SELECT * FROM pantry_items WHERE owner = :owner AND category = :category", nativeQuery = true)
	public List<PantryItem> getItemsByCategory(@Param("owner") String owner, @Param("category") String category);
}
