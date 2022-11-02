package ug.training.plyrs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.minidev.json.JSONObject;
import ug.training.plyrs.model.InsertCalciatore;
import ug.training.plyrs.model.PutCalciatore;
import ug.training.plyrs.service.CalciatoreService;

@RestController
@RequestMapping("/calciatori")
public class CalciatoreController {

	@Autowired
	private CalciatoreService cSvc;
	
	@GetMapping("/allPlayers")
	public List<JSONObject> getAllPlayers(){
		return cSvc.getAllPlayers();
	}
	
	@GetMapping("/allPlayers/{id}")
	public List<JSONObject> getPlayersById(@PathVariable int id){
		return cSvc.getPlayerById(id);
	}
	
	@PostMapping("/allPlayers")
	public void insertPlayer(@RequestBody InsertCalciatore giocatoreDaInserire) {
		cSvc.insertPlayer(giocatoreDaInserire);
	}
	
	@PatchMapping("/allPlayers/{id}")
	public void updatePlayer(@PathVariable int id, @RequestBody PutCalciatore giocatoreDaModificare) {
		cSvc.updatePlayer(id, giocatoreDaModificare);
	}
	
	@DeleteMapping("/allPlayers/{id}")
	public void deletePlayer(@PathVariable int id) {
		cSvc.deletePlayer(id);
	}
}
