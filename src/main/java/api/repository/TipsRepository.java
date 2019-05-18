package api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.*;

import api.models.Tip;

@Repository
public interface TipsRepository extends JpaRepository<Tip, Integer> {

	/*
	 * Find tips by categories, current list of categories:
	 * "warmth, water, shelter, food, health, security, storage, other"
	 */
	
	@Query(value = "SELECT * FROM TIPS WHERE warmth = true", nativeQuery = true)
	public List<Tip> findWarmthTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE water = true", nativeQuery = true)
	public List<Tip> findWaterTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE shelter = true", nativeQuery = true)
	public List<Tip> findShelterTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE food = true", nativeQuery = true)
	public List<Tip> findFoodTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE health = true", nativeQuery = true)
	public List<Tip> findHealthTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE security = true", nativeQuery = true)
	public List<Tip> findSecurityTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE storage = true", nativeQuery = true)
	public List<Tip> findStorageTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE other = true", nativeQuery = true)
	public List<Tip> findOtherTips();
	
	
	/*
	 * Find all tips by creator 
	 */
	
	@Query(value = "SELECT * FROM TIPS WHERE creator = :username", nativeQuery = true)
	public List<Tip> findAllByCreator(@Param("username") String username);
	
}
