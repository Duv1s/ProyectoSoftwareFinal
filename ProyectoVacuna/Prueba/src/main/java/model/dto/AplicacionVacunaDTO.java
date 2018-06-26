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
public class AplicacionVacunaDTO {

    public AplicacionVacunaDTO(){
        //constructor base
    }
    
    public AplicacionVacunaDTO(Long id){
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
    private String fecha;
    
    
    /**
    * @generated
    */
    private DosisDTO dosis;
    
    /**
    * @generated
    */
    private PacienteDTO paciente;
    
    
    
    /**
    * @generated
    */
    private List<VacunadorDTO> vacunador;
    
    public List<VacunadorDTO> getVacunador(){
    	if(this.vacunador==null){
    		vacunador=new ArrayList<VacunadorDTO>();
    	}
    	return vacunador;
    }
    
    public void setVacunador(List<VacunadorDTO> vacunador){
    	this.vacunador=vacunador;
    }
    
    /**
    * @generated
    */
    private IPSDTO iPS;
    
    /**
    * @return
    * @generated
    */
    public String getFecha() {
        return this.fecha;
    }
    
    /**
    * @param
    * @generated
    */
    public void setFecha(String fecha) {
        this.fecha = fecha;
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
	public DosisDTO getDosis() {
	    return this.dosis;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setDosis(DosisDTO dosis) {
	    this.dosis = dosis;
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
