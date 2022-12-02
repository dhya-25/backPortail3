package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.Motif_j;

public interface MotifJDao extends JpaRepository<Motif_j, String>{

	@Query(value="select COD_M,TYP_CNG,ABRV_FIXE,LIB_MOT,ABRV_MOT,DED_SAL"
			+ ",DED_CNG,PLAFOND_CNG,TYP_PLAFOND,FREQUENCE,UNITE,ABATEMENT,"
			+ "JOUR,LIM_DEM_CNG,UNIT_PLAF,PLAFOND_CNG_DEMI,PLAFOND_CNG_SOLD,"
			+ "PLAFOND_DECE,ORD_REND,RESERVE,PLAFOND_ABAT,MOIS_DEBUT,MOIS_FIN,"
			+ "PLAFOND_BONUS,LIB_MOT_A,ABRV_MOT_A,DED_CNR,NATURE_CNG,"
			+ "CORRES_COD_M,MOTIF_POINT,TYPE_ABS,CORRES_PERS,NAT_CNG,MOTIF_CHEV_POINT"
			+ ",NBR_JOUR_MIN,CUMUL_HSUP48,DED_ANCIENNETE,UNITE_POINT,COEF_POINT,COD_SIT,"
			+ "SEXE,DED_TICKET,FRANCH_TICKET,COD_ALERT,ABAT_PSPES,NUM_DEC from MOTIF_J "
			+ " where nat_cng='C' and typ_cng in ('01','02','03')",nativeQuery = true)
	public List<Motif_j> getMotifCng();

}
