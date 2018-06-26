package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaisDTO {

    public PaisDTO(){
        //constructor base
    }
    
    public PaisDTO(Long id){
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
    private DepartamentoDTO departamento;
    
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
	public DepartamentoDTO getDepartamento() {
	    return this.departamento;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setDepartamento(DepartamentoDTO departamento) {
	    this.departamento = departamento;
	}
	
}
