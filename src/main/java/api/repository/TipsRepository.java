package api.repository;

import org.springframework.data.repository.CrudRepository;

import api.models.Tip;

public interface TipsRepository extends CrudRepository<Tip, Integer> {
}
