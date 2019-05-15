package api.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.models.Tip;
import api.repository.TipsRepository;

@Service
public class TipsService {

	@Autowired
	private TipsRepository repository;

	public List<Tip> getAll() {
		List<Tip> tips = new ArrayList<>();
		repository.findAll().forEach(tips::add);
		return tips;
	}

	public Tip getTipById(Integer id) {
		return repository.findById(id).get();
	}
	
	public List<Tip> getTipsByCreator(int creator_id){
		return null;
	}

	public void addTip(Tip tip) {
		repository.save(tip);
	}
	
	public void updateTip(Tip tip) {
		repository.save(tip);
	}

	public void deleteTip(Integer id) {
		repository.deleteById(id);
	}

}
