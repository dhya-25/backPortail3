package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.arabsoft.ajir.entities.CleRembourserCession;
import com.arabsoft.ajir.entities.RembourserCession;


@Repository
public interface RembourserCessionRep extends JpaRepository<RembourserCession, CleRembourserCession>{
	
	
	@Query(value="SELECT cod_soc ,\r\n"
			+ "  mat_pers         ,\r\n"
			+ "  cod_pret         ,\r\n"
			+ "  cod_typ_bul      ,\r\n"
			+ "  mnt_bul          ,\r\n"
			+ "  id_rembourser_cession ,\r\n"
			+ "  cod_user             \r\n"
			+ "  from rembourser_cession\r\n"
			+ "  where cod_soc = :codSoc and mat_pers = :matPers and cod_pret = :codPret ",nativeQuery=true)
	public List<RembourserCession> getRembourserCession(@Param("codSoc") String codSoc,@Param("matPers") String matPers ,@Param("codPret") Integer  codPret);



}
