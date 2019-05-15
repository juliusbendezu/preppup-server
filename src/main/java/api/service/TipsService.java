package api.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import api.models.Tip;
import api.repository.TipsRepository;

@Service
public class TipsService {

	@Autowired
	private TipsRepository tipsRepository;

	public List<Tip> getAll() {
		List<Tip> tips = new ArrayList<>();
		tipsRepository.findAll().forEach(tips::add);
		return tips;
	}

	public Tip getTipById(String id) {
		return tipsRepository.findById(id).get();
	}
	
	public List<Tip> getTipsByCreator(int creator_id){
		return null;
	}

	public void addTip(Tip tip) {
		tipsRepository.save(tip);
	}
	
	public void updateTip(Tip tip) {
		tipsRepository.save(tip);
	}

	public void deleteTip(String id) {
		tipsRepository.deleteById(id);
	}

}
