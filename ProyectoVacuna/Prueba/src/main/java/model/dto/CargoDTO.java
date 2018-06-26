package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CargoDTO {

    public CargoDTO(){
        //constructor base
    }
    
    public CargoDTO(Long id){
        this.id=id;
    }

	private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
	
    
    /**
    * @generated
    */
    private String nombre;
    
    
    /**
    * @generated
    */
    private VacunadorDTO vacunador;
    
    /**
    * @return
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
	/**
	* @return
	* @generated
	*/
	public VacunadorDTO getVacunador() {
	    return this.vacunador;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setVacunador(VacunadorDTO vacunador) {
	    this.vacunador = vacunador;
	}
	
}
