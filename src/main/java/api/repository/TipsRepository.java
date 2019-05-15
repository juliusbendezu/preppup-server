package api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import api.models.Tip;

@Repository
public interface TipsRepository extends CrudRepository<Tip, Integer> {
}
