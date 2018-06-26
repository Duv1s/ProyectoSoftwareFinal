package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AseguradoraDTO {

    public AseguradoraDTO(){
        //constructor base
    }
    
    public AseguradoraDTO(Long id){
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
    private String nomre;
    
    
    /**
    * @generated
    */
    private RegimenDTO regimen;
    
    /**
    * @generated
    */
    private PacienteDTO paciente;
    
    /**
    * @return
    * @generated
    */
    public String getNomre() {
        return this.nomre;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNomre(String nomre) {
        this.nomre = nomre;
    }
    
	/**
	* @return
	* @generated
	*/
	public PacienteDTO getPaciente() {
	    return this.paciente;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setPaciente(PacienteDTO paciente) {
	    this.paciente = paciente;
	}
	/**
	* @return
	* @generated
	*/
	public RegimenDTO getRegimen() {
	    return this.regimen;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setRegimen(RegimenDTO regimen) {
	    this.regimen = regimen;
	}
	
}
