package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AcudienteDTO {

    public AcudienteDTO(){
        //constructor base
    }
    
    public AcudienteDTO(Long id){
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
    private String fechaNacimiento;
    
    /**
    * @generated
    */
    private String numeroIdentificacion;
    
    /**
    * @generated
    */
    private String nombre;
    
    /**
    * @generated
    */
    private String apellido;
    
    
    /**
    * @generated
    */
    private PacienteDTO paciente;
    
    /**
    * @return
    * @generated
    */
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    /**
    * @param
    * @generated
    */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
    * @return
    * @generated
    */
    public String getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }
    
    /**
    * @param
    * @generated
    */
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
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
    public String getApellido() {
        return this.apellido;
    }
    
    /**
    * @param
    * @generated
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
