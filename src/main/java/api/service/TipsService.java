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
	
	public List<Tip> getTipsByCreator(String username){
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
		case 0:
			return tipsRepository.findWarmthTips();
		case 1:
			return tipsRepository.findWaterTips();
		case 2:
			return tipsRepository.findShelterTips();
		case 3:
			return tipsRepository.findFoodTips();
		case 4:
			return tipsRepository.findHealthTips();
		case 5:
			return tipsRepository.findSecurityTips();
		case 6:
			return tipsRepository.findStorageTips();
		case 7:
			return tipsRepository.findOtherTips();
		default:
			throw new IllegalArgumentException("No such category, please use lowercase");
		}
		
	}
}
