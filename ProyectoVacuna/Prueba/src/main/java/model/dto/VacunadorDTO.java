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
public class VacunadorDTO {

    public VacunadorDTO(){
        //constructor base
    }
    
    public VacunadorDTO(Long id){
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
    private String apellido;
    
    /**
    * @generated
    */
    private String nombre;
    
    /**
    * @generated
    */
    private String numeroIdentificacion;
    
    /**
    * @generated
    */
    private String fechaNacimiento;
    
    /**
    * @generated
    */
    private String direccion;
    
    /**
    * @generated
    */
    private String telefono;
    
    /**
    * @generated
    */
    private String correo;
    
    
    /**
    * @generated
    */
    private CargoDTO cargo;
    
    /**
    * @generated
    */
    private TipoDocumentoDTO tipoDocumento;
    
    
    
    /**
    * @generated
    */
    private List<MunicipioDTO> municipio;
    
    public List<MunicipioDTO> getMunicipio(){
    	if(this.municipio==null){
    		municipio=new ArrayList<MunicipioDTO>();
    	}
    	return municipio;
    }
    
    public void setMunicipio(List<MunicipioDTO> municipio){
    	this.municipio=municipio;
    }
    
    /**
    * @generated
    */
    private GeneroDTO genero;
    
    /**
    * @generated
    */
    private AplicacionVacunaDTO aplicacionVacuna;
    
    /**
    * @generated
    */
    private IPSDTO iPS;
    
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
    public String getTelefono() {
        return this.telefono;
    }
    
    /**
    * @param
    * @generated
    */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    /**
    * @return
    * @generated
    */
    public String getCorreo() {
        return this.correo;
    }
    
    /**
    * @param
    * @generated
    */
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
	/**
	* @return
	* @generated
	*/
	public CargoDTO getCargo() {
	    return this.cargo;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setCargo(CargoDTO cargo) {
	    this.cargo = cargo;
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
	public TipoDocumentoDTO getTipoDocumento() {
	    return this.tipoDocumento;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
	    this.tipoDocumento = tipoDocumento;
	}
	/**
	* @return
	* @generated
	*/
	public GeneroDTO getGenero() {
	    return this.genero;
	}
	
	/**
	* @param
	* @generated
	*/
	public void setGenero(GeneroDTO genero) {
	    this.genero = genero;
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
