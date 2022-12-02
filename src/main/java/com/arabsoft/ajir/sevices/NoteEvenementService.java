package com.arabsoft.ajir.sevices;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.arabsoft.ajir.controller.ResponseMessage;
import com.arabsoft.ajir.dao.NOTES_EVENEMENTSDao;
import com.arabsoft.ajir.entities.NOTES_EVENEMENTS;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class NoteEvenementService {
	
	@Autowired
	private NOTES_EVENEMENTSDao dao;
	
	
	@Transactional
	public ResponseMessage createEvent(MultipartFile file, String event) throws IOException {
		ResponseMessage responseMessage = new ResponseMessage();
		NOTES_EVENEMENTS even = new ObjectMapper().readValue(event, NOTES_EVENEMENTS.class);
		even.setFichier_joint(file.getBytes());
		even.setFile_name(file.getOriginalFilename());
		even.setContent_type(file.getContentType());
		even.setPath("DB");
		try {
			dao.save(even);
			responseMessage.setCode("0");
			responseMessage.setMessage("Demande created");
		} catch (Exception e) {
			responseMessage.setCode("1");
			responseMessage.setMessage("Demande Not created");
		}
		return responseMessage;
	}

}
