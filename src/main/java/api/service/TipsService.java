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
		Collections.sort(tips);
		return tips;
	}

	public Tip getTipById(int id) {
		return tipsRepository.findById(id).get();
	}
	
	public List<Tip> getTipsByCreator(String username){
		return tipsRepository.findAllByCreator(username);
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
		List<Tip> tips = new ArrayList<>();
		switch(category) {
		case 0:
			tips = tipsRepository.findWarmthTips();
			break;
		case 1:
			tips = tipsRepository.findWaterTips();
			break;
		case 2:
			tips = tipsRepository.findShelterTips();
			break;
		case 3:
			tips = tipsRepository.findFoodTips();
			break;
		case 4:
			tips = tipsRepository.findHealthTips();
			break;
		case 5:
			tips = tipsRepository.findSecurityTips();
			break;
		case 6:
			tips = tipsRepository.findStorageTips();
			break;
		case 7:
			tips = tipsRepository.findOtherTips();
			break;
		default:
			throw new IllegalArgumentException("No such category, please use lowercase");
		}
		
		Collections.sort(tips);
		return tips;
	}

	public void likeTip(int id) {
		Tip tip = tipsRepository.findById(id).get();
		tip.like();
		tipsRepository.save(tip);
	}
}
