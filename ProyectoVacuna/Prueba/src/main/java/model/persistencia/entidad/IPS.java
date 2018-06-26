package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="IPS")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="IPS.obtenerTodos", query="select e from IPS e")
})
public class IPS {

	/**
	 * Identificador de la tabla IPS. 	
	 */
	@Id
    //@Column(name = "IPS_id")
    @GeneratedValue(generator = "IPSGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "IPSGen", sequenceName = "IPS_SEQ",allocationSize = 1)
	private Long id;

	public Long getId(){
		return this.id;
	}

	public void setId(Long id){
		this.id=id;
	}
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "nombre")
    private String nombre;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "direccion")
    private String direccion;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private AplicacionVacuna aplicacionVacuna;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Vacunador vacunador;
    
    /**
    * @generated
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Municipio municipio;
    
    
    /**
    * @generated
    */
    public String getNombre() {
        return this.nombre;
    }
    
    /**
    * @generated
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
    * @generated
    */
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
    * @generated
    */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
	
	/**
	* @generated
	*/
	public Vacunador getVacunador() {
	    return this.vacunador;
	}
	
	/**
	* @generated
	*/
	public void setVacunador(Vacunador vacunador) {
	    this.vacunador = vacunador;
	}
	
	/**
	* @generated
	*/
	public AplicacionVacuna getAplicacionVacuna() {
	    return this.aplicacionVacuna;
	}
	
	/**
	* @generated
	*/
	public void setAplicacionVacuna(AplicacionVacuna aplicacionVacuna) {
	    this.aplicacionVacuna = aplicacionVacuna;
	}
	
	/**
	* @generated
	*/
	public Municipio getMunicipio() {
	    return this.municipio;
	}
	
	/**
	* @generated
	*/
	public void setMunicipio(Municipio municipio) {
	    this.municipio = municipio;
	}
	
}
