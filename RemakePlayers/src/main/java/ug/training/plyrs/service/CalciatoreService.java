package ug.training.plyrs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.minidev.json.JSONObject;
import ug.training.plyrs.model.InsertCalciatore;
import ug.training.plyrs.model.PutCalciatore;
import ug.training.plyrs.repository.CalciatoreRepository;

@Service
public class CalciatoreService {

	@Autowired
	private CalciatoreRepository cRepo;
	
	public List<JSONObject> getAllPlayers(){
		return cRepo.getAllPlayers();
	}
	
	public List<JSONObject> getPlayerById(int id){
		return cRepo.getPlayersByID(id);
	}
	
	public void insertPlayer(InsertCalciatore gdi) {
		cRepo.insertPlayer(gdi.getNome(),gdi.getCognome(),gdi.getSquadra());
	}
	
	public void updatePlayer(int id, PutCalciatore gdm) {
		cRepo.updatePlayer(id, gdm.getSquadra());
	}
	
	public void deletePlayer(int id) {
		cRepo.deletePlayer(id);
	}
	
}
