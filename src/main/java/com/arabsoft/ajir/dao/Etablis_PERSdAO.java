package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.ETABLIS_PERS;
import com.arabsoft.ajir.entities.Etab_persId;

public interface Etablis_PERSdAO extends JpaRepository<ETABLIS_PERS, Etab_persId> {
	@Query(value="select cod_soc,\r\n"
			+ "	   mat_pers,\r\n"
			+ "	   num_etablis,\r\n"
			+ "	   dat_emb,\r\n"
			+ "	   dat_fin,\r\n"
			+ "	   etablissement,\r\n"
			+ "	   emploi,\r\n"
			+ "	   duree,\r\n"
			+ "	   pec_anc,\r\n"
			+ "	   etat_etablis,\r\n"
			+ "	   fonct_corr,\r\n"
			+ "	   wannee,\r\n"
			+ "	   wmois,\r\n"
			+ "	   wjours,\r\n"
			+ "	   cod_org,\r\n"
			+ "	   id_etablis_pers,\r\n"
			+ "	   cod_user\r\n"
			+ "from etablis_pers\r\n"
			+ "where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery = true)
	List <ETABLIS_PERS> getetablissementbycodesocandmatpers(@Param("codSoc")String x,@Param("matPers")String y);
}
