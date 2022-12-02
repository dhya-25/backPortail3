package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.CessionPersRep;
import com.arabsoft.ajir.dao.LigCessionRep;
import com.arabsoft.ajir.dao.PersonnelRep;
import com.arabsoft.ajir.dao.PretPersDetRep;
import com.arabsoft.ajir.dao.RembourserCessionRep;
import com.arabsoft.ajir.entities.CessionPers;
import com.arabsoft.ajir.entities.LigCession;
import com.arabsoft.ajir.entities.PretPersDet;





@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cessionpers")
public class CessionPersController {

	@Autowired
	CessionPersRep cessionPersRep;

	@Autowired
	PersonnelRep personnelRep;
	
	@Autowired
	LigCessionRep ligCessionRep;
	@Autowired
	RembourserCessionRep   rembourserCessionRep;
	
	@Autowired
	PretPersDetRep pretPersDetRep;

	

	@GetMapping("/getall")
	public List<CessionPers>  getall(){
			return  cessionPersRep.findAll();
		}
	
	@CrossOrigin
	@GetMapping("/getbyiid/{matPers}")
	public List<CessionPers> getDemandee(@PathVariable String matPers) {

		return cessionPersRep.get(matPers);
	}
	
	
	@PostMapping("/cessionPersLig")
	public CessionPers getCessionPers(@RequestBody CessionPers b){
		
		String codSoc = b.getCod_soc();
		String matPers = b.getMat_pers();
		List<CessionPers>bs=(List<CessionPers>) this.cessionPersRep.getCessionLigCessionPers(codSoc, matPers);
		
		
	
	    for (int i = 0; i <bs.size(); i++) {
	        System.out.println(bs.get(i));
	        if(i==bs.size()-1) {
	        bs.get(i).setLigCession(ligCessionRep.getLigCession(codSoc, matPers));
	      //  bs.get(i).setPersonnel(personnelRep.getPers(codSoc, matPers));
	        }
	      }
		

	    if (!bs.isEmpty()) {
			return bs.get(bs.size()-1) ;
		    }
		    else
		    {
		    	return null;
		    }
	}
	
	//to show the det with pret
	@PostMapping("/cessionPersLigPret")
	public CessionPers getCessionPersPret(@RequestBody CessionPers b){
		
		
		
		String codSoc = b.getCod_soc();
		String matPers = b.getMat_pers();
		Integer codPret=b.getCod_pret();
		List<CessionPers>bs=(List<CessionPers>) this.cessionPersRep.getCessionLigCessionPersPret(codSoc, matPers, codPret);
		
		
	
	    for (int i = 0; i <bs.size(); i++) {
	        System.out.println(bs.get(i));
	        if(i==bs.size()-1) {
	        bs.get(i).setLigCession(ligCessionRep.getLigCessionPret(codSoc, matPers, codPret));
	     /*   bs.get(i).setRembourserCession(rembourserCessionRep.getRembourserCession(codSoc, matPers, codPret));
	        bs.get(i).setPersonnel(personnelRep.getPers(codSoc, matPers));*/
	        }
	      }
		
	    if (!bs.isEmpty()) {
			return  bs.get(0);
		    }
		    else
		    {
		    	return null;
		    }
	}
	//Get pret from tab personnel and pret_pers
	
	@PostMapping("/getpret")
	public PretPersDet getPret(@RequestBody PretPersDet b){
		
		
		
		String codSoc = b.getCod_soc();
		String matPers = b.getMat_pers();
		Integer codPret = b.getCod_pret();
		
		PretPersDet pr= this.pretPersDetRep.getPret(codSoc, matPers,codPret);
		pr.setListCodPret(this.pretPersDetRep.getListCodPret(codSoc, matPers));
		
		return pr;
		
	}
	@CrossOrigin
	@GetMapping("/getlistpret/{codSoc}/{matPers}")
	 public List<Integer> getListCodPret(@PathVariable String codSoc,@PathVariable String matPers){
		
		
		
		return pretPersDetRep.getListCodPret(codSoc, matPers);
		
		
	}
	
	
	@CrossOrigin
	@GetMapping("/getlistpretpers/{codSoc}/{matPers}")
	 public List<String> getListCodPretPers(@PathVariable String codSoc,@PathVariable String matPers){
		
		
		
		return cessionPersRep.getCessionPersCode(codSoc, matPers);
		
		
	}
	
	
	////to get l pret
	
	@PostMapping("/getlpret")
	public CessionPers getlPret(@RequestBody LigCession b){
		
		
		
		String codSoc = b.getCod_soc();
		String matPers = b.getMat_pers();
		Integer codPret = b.getCod_pret();
		Long lPret=b.getL_pret();
		
		List<CessionPers>bs=(List<CessionPers>) this.cessionPersRep.getCessionLigCessionPersPret(codSoc, matPers, codPret);
		
		
		
	    for (int i = 0; i <bs.size(); i++) {
	        System.out.println(bs.get(i));
	        if(i==bs.size()-1) {
	   		 bs.get(i).setLigCession(this.ligCessionRep.getLigCessionLPret(codSoc, matPers,codPret,lPret));
	     
	        }
	      }
		
		 if (!bs.isEmpty()) {
				return  bs.get(0);
			    }
			    else
			    {
			    	return null;
			    }
		
	}
}
