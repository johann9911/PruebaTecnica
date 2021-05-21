package prueba.autos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "autos")
public class Auto {
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "marca")
	private String marca = null;
	
	@Column(name = "color")
	private String color = null;
	
	@Column(name = "numPasajeros")
	private int numPas;
	
	@Column(name = "placa")
	private String placa = null;
	
	@Column(name = "estado")
	private boolean estado=true;
	
	public Auto() {

	}
	public Auto(String marca, String color, int numPas, String placa) {
		this.marca = marca;
		this.color = color;
		this.numPas = numPas;
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumPas() {
		return numPas;
	}

	public void setNumPas(int numPas) {
		this.numPas = numPas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public void changeState() {
		this.estado = estado ? false:true;
	}
	
	
	
	

}

	
