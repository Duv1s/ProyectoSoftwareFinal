package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class DosisDTO {

    public DosisDTO(){
        //constructor base
    }
    
    public DosisDTO(Long id){
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
    private Integer edadMin;
    
    /**
    * @generated
    */
    private Integer edadMax;
    
    /**
    * @generated
    */
    private Boolean embarazo;
    
    
    /**
    * @generated
    */
    private AplicacionVacunaDTO aplicacionVacuna;
    
    /**
    * @generated
    */
    private BiologicoDTO biologico;
    
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
    public Integer getEdadMin() {
        return this.edadMin;
    }
    
    /**
    * @param
    * @generated
    */
    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }
    /**
    * @return
    * @generated
    */
    public Integer getEdadMax() {
        return this.edadMax;
    }
    
    /**
    * @param
    * @generated
    */
    public void setEdadMax(Integer edadMax) {
        this.edadMax = edadMax;
    }
    /**
    * @return
    * @generated
    */
    public Boolean getEmbarazo() {
        return this.embarazo;
    }
    
    /**
    * @param
    * @generated
    */
    public void setEmbarazo(Boolean embarazo) {
        this.embarazo = embarazo;
    }
    
	/**
	* @return
	* @generated
	*/
	public BiologicoDTO getBiologico() {
	    return this.biologico;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setBiologico(BiologicoDTO biologico) {
	    this.biologico = biologico;
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
	
}
