package com.arabsoft.ajir.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arabsoft.ajir.dao.ComptePersDAO;
import com.arabsoft.ajir.dao.PossModpDAO;
import com.arabsoft.ajir.entities.PossModp;

@Service
public class PossModpService {
	
	@Autowired
	PossModpDAO possModpDAO;
	@Autowired
	ComptePersDAO comptePersDAO;
	
	
	public List<PossModp> getListPossModp(String codSoc,String matPers){
		List<PossModp> mp = this.possModpDAO.getModPay(codSoc, matPers);		
		for (int i=0;i<mp.size();i++) {
			String codTypBul = mp.get(i).getCod_typ_bul();
			mp.get(i).setComptes_pers(this.comptePersDAO.getComptePers(codSoc, matPers, codTypBul));
		}
		return  mp;
	}

}
