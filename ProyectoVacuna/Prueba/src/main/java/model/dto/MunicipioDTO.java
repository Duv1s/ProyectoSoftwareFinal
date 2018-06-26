package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MunicipioDTO {

    public MunicipioDTO(){
        //constructor base
    }
    
    public MunicipioDTO(Long id){
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
    * @generated
    */
    private VacunadorDTO persona;
    
    /**
    * @generated
    */
    private PacienteDTO paciente;
    
    /**
    * @generated
    */
    private IPSDTO iPS;
    
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
	/**
	* @return
	* @generated
	*/
	public IPSDTO getIPS() {
	    return this.iPS;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setIPS(IPSDTO iPS) {
	    this.iPS = iPS;
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
	public VacunadorDTO getPersona() {
	    return this.persona;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setPersona(VacunadorDTO persona) {
	    this.persona = persona;
	}
	
}
