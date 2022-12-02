package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Pk_ValeurFicheEval;
import com.arabsoft.ajir.entities.VALEUR_FICHE_EVAL;

public interface VALEUR_FICHE_EVALDao extends JpaRepository<VALEUR_FICHE_EVAL,Pk_ValeurFicheEval> {
	@Query(value="  Select t.cod_soc  ,\r\n"
			+ "  t.mat_pers ,\r\n"
			+ "  t.ref_mod  ,\r\n"
			+ "  t.dat_eval ,\r\n"
			+ "  t.cod_nat_comp,\r\n"
			+ "  t.cod_comp, \r\n"
			+ "  t.cod_crit_comp ,\r\n"
			+ "  t.cod_val  ,\r\n"
			+ "  nvl(t.commentaires,' ') commentaires ,\r\n"
			+ "   t.nbr_point  ,\r\n"
			+ "  t.acquis  ,\r\n"
			+ "  t.id_valeur_fiche_eval,\r\n"
			+ "  pk_get_lib.GET_COMPETENCE$LIB_COMP(t.cod_nat_comp,t.cod_comp) lib_competence ,\r\n"
			+ " pk_get_lib.GET_CRITERE_CO$LIB_CRIT_COMP(t.cod_crit_comp) lib_critere ,\r\n"
			+ " pk_get_lib.GET_VALEUR_CRIT_COMP$LIB_VAL(t.cod_val) libval ,\r\n"
			+ " (select lib_val from VALEUR_CRITERE_COMPETENCE y where y.nbr_point=t.nbr_point) libapp ,\r\n"
			+ "  decode(t.acquis,'O','Aquis','N','Non Aquis') Aquis_O_N  \r\n"
			+ "  from VALEUR_FICHE_EVAL  t  where t.mat_pers = :mat  and t.ref_mod=:ref \r\n",nativeQuery=true)
	public List<VALEUR_FICHE_EVAL> getFicheEval(@Param("mat")String mat,@Param("ref")String ref);

}
