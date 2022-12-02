package com.arabsoft.ajir.controller;

import java.io.IOException;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.arabsoft.ajir.dao.CalPersDao;
import com.arabsoft.ajir.dao.DemandeDao;
import com.arabsoft.ajir.dao.GroupePretDao;
import com.arabsoft.ajir.dao.LibreDemandeBisDao;
import com.arabsoft.ajir.dao.LibreDemandeKDao;
import com.arabsoft.ajir.dao.MotifJDao;
import com.arabsoft.ajir.dao.PersonnelRep;
import com.arabsoft.ajir.dao.ThemeDao;
import com.arabsoft.ajir.dao.TitreFormationDao;
import com.arabsoft.ajir.dao.TypeAutorisationDao;
import com.arabsoft.ajir.dao.TypeFormationDao;
import com.arabsoft.ajir.dao.TypePretDao;
import com.arabsoft.ajir.entities.Cal_Pers;
import com.arabsoft.ajir.entities.Groupe_pret;
import com.arabsoft.ajir.entities.Libre_demande;
import com.arabsoft.ajir.entities.Libre_demandeBis;
import com.arabsoft.ajir.entities.Motif_j;
import com.arabsoft.ajir.entities.Theme;
import com.arabsoft.ajir.entities.TitreFormation;
import com.arabsoft.ajir.entities.TypeFormation;
import com.arabsoft.ajir.entities.Type_autorisation;
import com.arabsoft.ajir.entities.Type_pret;
import com.arabsoft.ajir.entities.libreDemandek;
import com.arabsoft.ajir.sevices.LibreDemandeService;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping(value="demande")
public class LibreDemandeController {
	@Autowired
	PersonnelRep personnelRep;
	@Autowired
	DemandeDao demandeDAO;
	@Autowired
	LibreDemandeKDao demandeK;
	@Autowired
	LibreDemandeBisDao bisDao;
	@Autowired
	ThemeDao themeDao;
	@Autowired
	TypeAutorisationDao autorisationDao;
	@Autowired
	TitreFormationDao formationDao;
	@Autowired
	TypeFormationDao typeDao;
	@Autowired
	GroupePretDao groupePretController;
	@Autowired 
	TypePretDao pretDao;
	@Autowired 
	MotifJDao motifJDao;
	@Autowired
	LibreDemandeService LibreService;
	  @Autowired
	  CalPersDao calPersDao;
	  @CrossOrigin
	  @PostMapping("/createDemande")
	  public ResponseEntity<ResponseMessage> createDemande(@RequestParam("file") MultipartFile file,@RequestParam("demande") String dem) throws IOException {	        
	    ResponseMessage responseMessage;
	    responseMessage = this.LibreService.createDem(file,dem);
	    if(responseMessage.getCode()=="0") {
	    	return ResponseEntity.ok(responseMessage);
	    } else {
	    	return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseMessage);
	    }
	  }
	  
	 /* @CrossOrigin
	  @PostMapping("/getListDemande")
	  public Libre_demande getListDemande(@RequestBody Libre_demande dem) throws IOException {	        
		  String codSoc = dem.getCodSoc();
			
			Libre_demande d = this.demandeDAO.getListDemande();
			System.out.println(codSoc);
			return d;
	    }*/
	
	@CrossOrigin
	@GetMapping("/getDemande")
	public ResponseEntity<List<Libre_demande>> getAllDemande() {

		return ResponseEntity.ok(demandeDAO.findAll());
	}
	
	@CrossOrigin
	@GetMapping("/getDemandes")
	public ResponseEntity<List<Libre_demande>> getDemande() {

		return ResponseEntity.ok(demandeDAO.getDemRh());
	}
	@CrossOrigin
	@GetMapping("/getDemandesRepRh")
	public ResponseEntity<List<Libre_demande>> getDemandeRepRhnotnull() {

		return ResponseEntity.ok(demandeDAO.getDemRhByRepNotNull());
	}
	@CrossOrigin
	@GetMapping("/getListConje/{codSoc}/{matpers}")
	public ResponseEntity<List<Cal_Pers>> getConge(@PathVariable("codSoc") String codSoc,@PathVariable("matpers") String matPers) {

		return ResponseEntity.ok(calPersDao.getListConje(codSoc,matPers));
	}
	@CrossOrigin
	@GetMapping("/getTypeFormation/{codTit}")
	public ResponseEntity<List<TypeFormation>> getTypeFormation(@PathVariable("codTit") String codTit) {

		return ResponseEntity.ok(typeDao.getTypeFormation(codTit));
	}
	@CrossOrigin
	@GetMapping("/getTitreFormation")
	public ResponseEntity<List<TitreFormation>> getTitreFormation() {

		return ResponseEntity.ok(formationDao.getTitreFormation());
	}
	
	@CrossOrigin
	@GetMapping("/getGroupePret")
	public ResponseEntity<List<Groupe_pret>> getGroupePret() {

		return ResponseEntity.ok(groupePretController.getGroupePret());
	}
	@CrossOrigin
	@GetMapping("/getTypePret/{codpret}")
	public ResponseEntity<List<Type_pret>> getTypePret(@PathVariable("codpret") String codpret) {

		return ResponseEntity.ok(pretDao.getTypePret(codpret));
	}
	
	@CrossOrigin
	@GetMapping("/getThemeFormation/{codTit}/{codTyp}")
	public ResponseEntity<List<Theme>> getThemeFormation(@PathVariable("codTit") String codTit,@PathVariable("codTyp") String codTyp) {

		return ResponseEntity.ok(themeDao.getThemeFormation(codTit,codTyp));
	}
	@CrossOrigin
	@GetMapping("/getTypeAut")
	public ResponseEntity<List<Type_autorisation>> getTypeAutorisation() {

		return ResponseEntity.ok(autorisationDao.getTypeAutorisation());
	}
	@CrossOrigin
	@GetMapping("/getMotifCng")
	public ResponseEntity<List<Motif_j>> getMotifCng() {

		return ResponseEntity.ok(motifJDao.getMotifCng());
	}
/*	@CrossOrigin
	@GetMapping("/getListDemande/{CodSoc}")
	public ResponseEntity<List<Libre_demande>> getDemande(@PathVariable String CodSoc) {
List<Libre_demande> d = demandeDAO.getListDemande(CodSoc);
System.out.println(d);
		return ResponseEntity.ok(d);
	}*/

	
	
	@CrossOrigin
	@GetMapping("/getListDemande/{codSoc}/{matpers}/{type}")
	public List<Libre_demande> getDemandee(@PathVariable String codSoc,@PathVariable String matpers,@PathVariable String type) {

		return demandeDAO.getDem(codSoc,matpers,type);
	}
	@CrossOrigin
	@GetMapping("/getListDemandeChef/{codSoc}/{matpers}/{serCodSer}")
	public List<Libre_demande> getDemandeChef(@PathVariable("codSoc") String codSoc,@PathVariable("matpers") String matpers,
			@PathVariable("serCodSer") String serCodSer) {

		return demandeDAO.getDemm(codSoc,matpers,serCodSer);
	}
	@CrossOrigin
	@GetMapping("/getListDemandeByChef/{codSoc}/{matpers}/{serCodSer}")
	public List<Libre_demande> getDemandeByRepChef(@PathVariable("codSoc") String codSoc,@PathVariable("matpers") String matpers,
			@PathVariable("serCodSer") String serCodSer) {

		return demandeDAO.getDemByRepChefNull(codSoc,matpers,serCodSer);
	}
	@CrossOrigin
	@GetMapping("/getListDemandeByChefNotNull/{codSoc}/{matpers}/{serCodSer}")
	public List<Libre_demande> getDemandeByRepChefNotNull(@PathVariable("codSoc") String codSoc,@PathVariable("matpers") String matpers,
			@PathVariable("serCodSer") String serCodSer) {

		return demandeDAO.getDemByRepChefNotNull(codSoc,matpers,serCodSer);
	}
	
	@CrossOrigin
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Libre_demandeBis> findDemandeById(@PathVariable Long id) {
		return ResponseEntity.ok(
				bisDao.gettByid(id));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDemande(@PathVariable Long id) {
		demandeDAO.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}
	/*@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Libre_demande>> getDemandeList() {

		return ResponseEntity.ok(demandeService.getDemande());
	}
	
	@DeleteMapping("/deleteClient/{id}")
	public ResponseEntity<Boolean> deleteClient(@PathVariable Long id) throws Exception{
		return ResponseEntity.ok(demandeService.deleteDemande(id));
	}*/
	
	/*@GetMapping("/downloadFile/{fileId}")
	public ResponseEntity<ByteArrayResource> downloadFile(@PathVariable String fileId) {

		Libre_demande fileModel =  LibreService.getFile(fileId);
		return ResponseEntity.ok().contentType(MediaType.parseMediaType(fileModel.getContentType()))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileModel.getFileName() + "\"")
				.body(new ByteArrayResource(fileModel.getFichierJoint()));
	}*/
	
	@GetMapping("/files/{id}")
	  public ResponseEntity<byte[]> getFile(@PathVariable Long id) {
	    Libre_demandeBis fileDB = LibreService.getFile(id);

	    return ResponseEntity.ok()
	        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getFileName() + "\"")
	        .body(fileDB.getFichierJoint());
	  }
	  @CrossOrigin
	  @GetMapping("/downloadFile/{documentId}")
		public void downloadFile(@PathVariable("documentId") Long documentId, HttpServletResponse response)
				throws IOException {

			Libre_demandeBis document = LibreService.getDocument(documentId);
			try {
				response.setHeader("Content-Disposition", "inline;filename=\"" + document.getFileName() + "\"");
				response.setContentType(document.getContentType());


				InputStream ins = new ByteArrayInputStream(document.getFichierJoint());
				IOUtils.copy(ins, response.getOutputStream());

			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	
	  @CrossOrigin
	  @PutMapping("/updateag")
		 
	  public ResponseEntity<libreDemandek> updateUclt( @RequestBody libreDemandek Ag) {
	  
	     Optional<libreDemandek> AgData = demandeK.findById(Ag.getId_libre_demande());
	    if (AgData.isPresent()) {
	    	libreDemandek agg = AgData.get();
	   agg.setTxtChef(Ag.getTxtChef());
	   agg.setReponseChef(Ag.getReponseChef());
	      
	     return new ResponseEntity<>(demandeK.save(agg), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } }
	  @CrossOrigin
	  @PutMapping("/updateRh")
		 
	  public ResponseEntity<libreDemandek> updateRh( @RequestBody libreDemandek Ag) {
	  
	     Optional<libreDemandek> AgData = demandeK.findById(Ag.getId_libre_demande());
	    if (AgData.isPresent()) {
	    	libreDemandek agg = AgData.get();
	   agg.setTxtReponse(Ag.getTxtReponse());
	   agg.setReponse(Ag.getReponse());
	      
	     return new ResponseEntity<>(demandeK.save(agg), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    } }
	

}
