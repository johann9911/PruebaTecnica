package prueba.autos.persistence.impl;

import org.springframework.stereotype.Service;
import prueba.autos.model.Auto;
import prueba.autos.persistence.AutosPersistenceExeption;
import prueba.autos.persistence.IAutosPersistence;

@Service
public class AutosPersistenceInMemory {

	public Auto saveAutos(Auto auto) throws AutosPersistenceExeption {
		return auto;
	}

}
