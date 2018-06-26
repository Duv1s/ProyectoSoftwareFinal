package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;

/**
  * @generated
  *  @author vacunas
  */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BiologicoDTO {

    public BiologicoDTO(){
        //constructor base
    }
    
    public BiologicoDTO(Long id){
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
    private String lote;
    
    /**
    * @generated
    */
    private String loteJeringa;
    
    
    /**
    * @generated
    */
    private DosisDTO dosis;
    
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
    public String getLote() {
        return this.lote;
    }
    
    /**
    * @param
    * @generated
    */
    public void setLote(String lote) {
        this.lote = lote;
    }
    /**
    * @return
    * @generated
    */
    public String getLoteJeringa() {
        return this.loteJeringa;
    }
    
    /**
    * @param
    * @generated
    */
    public void setLoteJeringa(String loteJeringa) {
        this.loteJeringa = loteJeringa;
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
	
}
