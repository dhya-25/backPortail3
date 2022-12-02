package com.arabsoft.ajir.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.IDScolaritefam;
import com.arabsoft.ajir.entities.SCOLARITE_FAMILLE;

public interface ScolFam extends JpaRepository<SCOLARITE_FAMILLE, IDScolaritefam> {
	@Query(value="select s.cod_soc  ,\r\n"
			+ "		s.mat_pers ,\r\n"
			+ "		s.num_fam   ,\r\n"
			+ "		s.annee_scolaire   ,\r\n"
			+ "		s.etablissement  ,\r\n"
			+ "		s.cod_niveau ,\r\n"
			+ "		s.moy_niv ,\r\n"
			+ "		s.result_niv  ,\r\n"
			+ "		s.etat_scol ,\r\n"
			+ "		s.code_domaine  ,\r\n"
			+ "		s.cod_lieu_geog  ,\r\n"
			+ "		s.classement_gen ,\r\n"
			+ "		s.classement_ur  ,\r\n"
			+ "		s.boursier ,\r\n"
			+ "		s.id_scolarite_famille, \r\n"
			+ "(select f.prenom from  famille f  where f.num_fam =s.num_fam and f.cod_soc=s.cod_soc and f.mat_pers=s.mat_pers and s.mat_pers =:matPers and s.cod_soc = :codSoc  ) libprenom,\r\n"
			+ "(select f.nom_jf from  famille f   where f.num_fam =s.num_fam and f.cod_soc=s.cod_soc and f.mat_pers=s.mat_pers and s.mat_pers =:matPers and  s.cod_soc = :codSoc) libnomjf,\r\n"
			+ "(select f.dat_naiss from  famille f    where f.num_fam =s.num_fam and f.cod_soc=s.cod_soc and f.mat_pers=s.mat_pers and s.mat_pers =:matPers and  s.cod_soc = :codSoc) libdat_naiss,\r\n"
			+ "(select f.sexe from  famille f   where f.num_fam =s.num_fam and f.cod_soc=s.cod_soc and f.mat_pers=s.mat_pers and s.mat_pers =:matPers and  s.cod_soc = :codSoc) libsexe\r\n"
            + "from scolarite_famille s,famille f\r\n"
			+ "where s.cod_soc = :codSoc and s.mat_pers = :matPers and s.num_fam=f.num_fam and f.mat_pers=s.mat_pers ",nativeQuery = true)
	public List<SCOLARITE_FAMILLE> getscofam(@Param("codSoc") String codSoc,@Param("matPers") String matPers);


}

