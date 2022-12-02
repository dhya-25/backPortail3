package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.Acte;
import com.arabsoft.ajir.entities.CleActe;
import com.arabsoft.ajir.entities.LigBult;


@Repository
public interface ActeRep extends JpaRepository<Acte, CleActe>{

	
	@Query(value="select\r\n"
			+ "  type_act,\r\n"
			+ "  abrv_act,\r\n"
			+ "  lib_act,\r\n"
			+ "  a_indice,\r\n"
			+ "  mtt_acte,\r\n"
			+ "  dat_acte,\r\n"
			+ "  taux_act,\r\n"
			+ "  plafonne,\r\n"
			+ "  plafond,\r\n"
			+ "  verif_piece,\r\n"
			+ "  nat_act,\r\n"
			+ "  verif_vign,\r\n"
			+ "  duree_act,\r\n"
			+ "  taux_avance,\r\n"
			+ "  type_plafond,\r\n"
			+ "  id_acte\r\n"
			+ "from Acte\r\n"
			+ "where type_act = :typeActe and abrv_act = :abrvActe ",nativeQuery = true)
	public List<LigBult> getActe(@Param("typeActe") String typeActe,@Param("abrvActe") String abrvActe);

	

}
