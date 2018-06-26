package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class RegimenDTO {

    public RegimenDTO(){
        //constructor base
    }
    
    public RegimenDTO(Long id){
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
    private AseguradoraDTO aseguradora;
    
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
	public AseguradoraDTO getAseguradora() {
	    return this.aseguradora;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setAseguradora(AseguradoraDTO aseguradora) {
	    this.aseguradora = aseguradora;
	}
	
}
