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

	public Tip getTipById(int id) {
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

	public void deleteTip(int id) {
		tipsRepository.deleteById(id);
	}

	public List<Tip> getTipsByCategory(int category) {
		switch(category) {
		case 1:
			return tipsRepository.findVärmeTips();
		case 2:
			return tipsRepository.findVattenTips();
		case 3:
			return tipsRepository.findSkyddTips();
		case 4:
			return tipsRepository.findMatTips();
		case 5:
			return tipsRepository.findSjukvårdTips();
		case 6:
			return tipsRepository.findInfosecTips();
		default:
			throw new IllegalArgumentException("No such category, please use lowercase");
		}
		
	}
}
