package com.arabsoft.ajir.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arabsoft.ajir.dao.AdrPersRep;
import com.arabsoft.ajir.dao.ComptePersDAO;
import com.arabsoft.ajir.dao.Etablis_PERSdAO;
import com.arabsoft.ajir.dao.PersonnelRep;
import com.arabsoft.ajir.dao.PossModpDAO;
import com.arabsoft.ajir.dao.PossedeDao;
import com.arabsoft.ajir.dao.RenseignementPersDAO;
import com.arabsoft.ajir.entities.POSSEDE;
import com.arabsoft.ajir.entities.Personnel;
import com.arabsoft.ajir.entities.PossModp;
import com.arabsoft.ajir.entities.RenseignementPers;

@Service
public class PersonnelService {
	
	@Autowired
	PersonnelRep personnelDAO;
	@Autowired
	AdrPersRep adrPersDAO;
	@Autowired
	PossModpDAO possModpDAO;
	@Autowired
	RenseignementPersDAO renseignementPersDAO;
	@Autowired
	Etablis_PERSdAO ETABB;
	@Autowired
	PossModpService possModpService;
	@Autowired
	PossedeDao possdao;
	
	public Personnel getpersInfo(String codSoc,String matPers) {
		Personnel p = this.personnelDAO.getPersonnel(codSoc, matPers);
		p.setAdresses_personnel(adrPersDAO.getAdrPers(codSoc, matPers));
		p.setMode_payement(possModpService.getListPossModp(codSoc, matPers));
		p.setRens_pers(renseignementPersDAO.getRensPers(codSoc, matPers));
		p.setEtab(ETABB.getetablissementbycodesocandmatpers(codSoc, matPers));
	p.setPossede(this.getListPOSS(codSoc, matPers));
		return p;
	}
	
	
	public List<POSSEDE> getListPOSS(String codSoc,String matPers){
		List<POSSEDE> mp =possdao.getPOSSEDEPers(codSoc, matPers);		
		for (int i=0;i<mp.size();i++) {
			String d=mp.get(i).getAbrv_fixe();
			mp.get(i).setLib_ind(possdao.getlibind(d));
		}
		return  mp;
	}

}
