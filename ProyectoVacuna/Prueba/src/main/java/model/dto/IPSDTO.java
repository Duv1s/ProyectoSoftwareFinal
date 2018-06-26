package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class IPSDTO {

    public IPSDTO(){
        //constructor base
    }
    
    public IPSDTO(Long id){
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
    private String direccion;
    
    
    /**
    * @generated
    */
    private VacunadorDTO vacunador;
    
    /**
    * @generated
    */
    private MunicipioDTO municipio;
    
    /**
    * @generated
    */
    private AplicacionVacunaDTO aplicacionVacuna;
    
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
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
    * @param
    * @generated
    */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
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
	/**
	* @return
	* @generated
	*/
	public AplicacionVacunaDTO getAplicacionVacuna() {
	    return this.aplicacionVacuna;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setAplicacionVacuna(AplicacionVacunaDTO aplicacionVacuna) {
	    this.aplicacionVacuna = aplicacionVacuna;
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
