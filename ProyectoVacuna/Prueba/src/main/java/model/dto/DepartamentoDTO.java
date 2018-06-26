package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DepartamentoDTO {

    public DepartamentoDTO(){
        //constructor base
    }
    
    public DepartamentoDTO(Long id){
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
    private PaisDTO pais;
    
    /**
    * @generated
    */
    private MunicipioDTO municipio;
    
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
	public PaisDTO getPais() {
	    return this.pais;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setPais(PaisDTO pais) {
	    this.pais = pais;
	}
	/**
	* @return
	* @generated
	*/
	public MunicipioDTO getMunicipio() {
	    return this.municipio;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setMunicipio(MunicipioDTO municipio) {
	    this.municipio = municipio;
	}
	
}
