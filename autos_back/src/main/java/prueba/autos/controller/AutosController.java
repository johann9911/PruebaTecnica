package prueba.autos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import prueba.autos.model.Auto;
import prueba.autos.persistence.AutosPersistenceExeption;
import prueba.autos.services.AutosServices;


@RestController
@RequestMapping(value = "/api")
@CrossOrigin("*")
public class AutosController {

	@Autowired
	AutosServices services;
	
	
	@PostMapping("/auto")
	public ResponseEntity<?> manejadorPostCreateAuto(@RequestBody Auto auto){
	    try {
	    	Auto newAuto = services.addAuto(auto);
	        return new ResponseEntity<>(newAuto, HttpStatus.CREATED);
	    } catch (AutosPersistenceExeption ex) {
	        return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);            
	    }        

	}
	
	@GetMapping("/auto")
	public ResponseEntity<?> manejadorGetAuto(){
	    try {
	    	List<Auto> auto = services.getAutos();
	        return new ResponseEntity<>(auto, HttpStatus.ACCEPTED);
	    } catch (AutosPersistenceExeption ex) {
	    	return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);            
	    }        
	}
	
	@PutMapping("/auto/{id}")
	public ResponseEntity<?> manejadorPutAuto(@PathVariable("id") long id){
	    try {
	    	
	        return new ResponseEntity<>(services.updateAuto(id),HttpStatus.OK);
	    } catch (AutosPersistenceExeption ex) {
	    	return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);            
	    }        

	}
	

}
