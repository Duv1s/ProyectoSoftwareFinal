package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TipoResidenciaDTO {

    public TipoResidenciaDTO(){
        //constructor base
    }
    
    public TipoResidenciaDTO(Long id){
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
    private PacienteDTO paciente;
    
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
	
}
