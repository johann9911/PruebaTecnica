package prueba.autos.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import prueba.autos.model.Auto;

public interface IAutosPersistence extends JpaRepository<Auto, Long>{
	
}
