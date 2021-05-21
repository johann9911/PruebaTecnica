package prueba.autos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import prueba.autos.model.Auto;
import prueba.autos.persistence.AutosPersistenceExeption;
import prueba.autos.persistence.IAutosPersistence;

@Service
public class AutosServices {

	@Autowired
	IAutosPersistence persistence;

	public Auto addAuto(Auto auto) throws AutosPersistenceExeption {
		return persistence.save(auto);
	}
	
	public List<Auto> getAutos() throws AutosPersistenceExeption{
		return persistence.findAll();
	}
	
	public Auto updateAuto(Long id) throws AutosPersistenceExeption{
		try {
			Auto auto = persistence.getById(id);
			auto.changeState();
			return persistence.save(auto);
		}catch(javax.persistence.EntityNotFoundException e) {
			System.out.println("no estaaaa");
			throw new AutosPersistenceExeption("El auto no ha sido registrado");
		}
		
		
		
	
	}
}
