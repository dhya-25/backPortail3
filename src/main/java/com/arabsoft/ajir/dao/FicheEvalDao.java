package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.FICHE_EVAL_COMP;
import com.arabsoft.ajir.entities.Fiche_eval_comp_id;
import com.arabsoft.ajir.entities.NOTES_EVENEMENTS;
@Repository
public interface FicheEvalDao extends JpaRepository<FICHE_EVAL_COMP, Fiche_eval_comp_id> {
	@Query(value="  Select t.cod_soc  ,\r\n"
			+ "  t.mat_pers ,\r\n"
			+ "  t.ref_mod  ,\r\n"
			+ "  pk_get_lib.GET_MODELE$LIBELLE_MOD(t.ref_mod)libmod,\r\n"
			+ "  t.cod_metier,\r\n"
			+ "  t.cod_post,\r\n"
			+ "  t.dat_eval ,\r\n"
			+ "  t.cod_typ_eval,\r\n"
			+ "  t.cod_soc_evaluateur, \r\n"
			+ "  t.mat_pers_evaluateur ,\r\n"
			+ "  t.observation  ,\r\n"
			+ "  t.y_anciennete  ,\r\n"
			+ "   t.m_anciennete  ,\r\n"
			+ "  t.j_anciennete  ,\r\n"
			+ "  t.cod_typ_prom  ,\r\n"
			+ "  t.annee,\r\n"
			+ "  t.num_dem  ,\r\n"
			+ "  t.cod_nat  ,\r\n"
			+ "  t.avis_evaluateur  ,\r\n"
			+ "  t.id_fiche_eval_comp  ,\r\n"
			+ " pk_get_lib.GET_POSTE$LIB_POST(t.cod_post)libpost,\r\n"
			+ " (select nom_pers||' '||pren_pers from personnel a where a.cod_soc  = t.cod_soc_evaluateur and a.mat_pers  = t.mat_pers_evaluateur) libprenomevaluateur  \r\n"
			+ "  from fiche_eval_comp t,personnel p  where t.cod_soc = p.cod_soc and t.mat_pers = p.mat_pers and p.mat_pers =:mat and t.ref_mod=:ref \r\n"
			+ "",nativeQuery=true)
	public List<FICHE_EVAL_COMP> getFicheEval(@Param("mat")String mat,@Param("ref")String ref);
	


}
