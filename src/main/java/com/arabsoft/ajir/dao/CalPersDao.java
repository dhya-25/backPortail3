package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CalPersPK;
import com.arabsoft.ajir.entities.Cal_Pers;

public interface CalPersDao extends JpaRepository<Cal_Pers, CalPersPK>{
	@Query(value="select 	t.cod_soc,t.mat_pers,t.years,t.months,t.days, to_char(to_date(t.years||'-'||lpad(t.months,2,'0')||'-'|| (lpad(t.days,2,'0')),'yyyy-mm-dd'),'yyyy-mm-dd') dateC,"
			+ "to_char(to_date(t.years||'-'||lpad(t.months,2,'0')||'-'|| (lpad(t.days,2,'0')),'yyyy-mm-dd')+t.j_semaine  ,'yyyy-mm-dd') fin , \r\n"
			+ "      t.j_semaine,\r\n"
			+ "    m.lib_mot , t.cod_m,\r\n"
			+ "      t.semaine,\r\n"
			+ "      t.prec_cod_m,\r\n"
			+ "      t.base_h,\r\n"
			+ "      t.base_m,\r\n"
			+ "      t.pause_shift,\r\n"
			+ "      t.marg_shift,\r\n"
			+ "      t.cod_reg,\r\n"
			+ "      t.cod_serv,\r\n"
			+ "      t.pres_h,\r\n"
			+ "      t.pres_m,\r\n"
			+ "      t.cod_fil,\r\n"
			+ "      t.regime_trav,\r\n"
			+ "      t.regime_heur,\r\n"
			+ "      t.droit_astr,\r\n"
			+ "      t.dt_bul, \r\n"
			+ "      t.cod_typ_bul,\r\n"
			+ "      t.id_cal_pers,    \r\n"
			+ "       t.unite,\r\n"
			+ "      t.seance \r\n"
			+ "      from cal_pers t,motif_j m where t.cod_soc=:codSoc "
			+ "and t.mat_pers=:matPers  and t.cod_m not in ('P')"
			+ "  and m.cod_m=t.cod_m",nativeQuery=true)
	public List<Cal_Pers> getListConje(@Param("codSoc") String codSoc,@Param("matPers") String matpers);
	
}
