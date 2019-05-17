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

	@Query(value = "SELECT * FROM TIPS WHERE värme = true", nativeQuery = true)
	public List<Tip> findVärmeTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE vatten = true", nativeQuery = true)
	public List<Tip> findVattenTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE skydd = true", nativeQuery = true)
	public List<Tip> findSkyddTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE mat = true", nativeQuery = true)
	public List<Tip> findMatTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE sjukvård = true", nativeQuery = true)
	public List<Tip> findSjukvårdTips();
	
	@Query(value = "SELECT * FROM TIPS WHERE infosec = true", nativeQuery = true)
	public List<Tip> findInfosecTips();
}
