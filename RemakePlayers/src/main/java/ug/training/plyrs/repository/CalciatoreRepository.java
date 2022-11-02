package ug.training.plyrs.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ug.training.plyrs.model.Calciatore;
import net.minidev.json.JSONObject;;

@Repository
public interface CalciatoreRepository extends JpaRepository<Calciatore,Integer>{

	@Query(value="SELECT * FROM calciatori",nativeQuery=true)
	public List<JSONObject> getAllPlayers();
	
	@Query(value="SELECT * FROM calciatori WHERE id=:id", nativeQuery=true)
	public List<JSONObject> getPlayersByID(@Param("id") int id);

	@Transactional
	@Modifying
	@Query(value="INSERT INTO calciatori(nome,cognome,squadra) VALUES(:nome,:cognome,:squadra)",nativeQuery=true)
	public void insertPlayer(@Param("nome") String nome, @Param("cognome") String cognome, @Param("squadra") String squadra);

	@Transactional
	@Modifying
	@Query(value="UPDATE calciatori SET squadra=:squadra WHERE id=:id",nativeQuery=true)
	public void updatePlayer(@Param("id") int id, @Param("squadra") String squadra);
	
	@Transactional
	@Modifying
	@Query(value="DELETE FROM calciatori WHERE id=:id",nativeQuery=true)
	public void deletePlayer(@Param("id") int id);
}
