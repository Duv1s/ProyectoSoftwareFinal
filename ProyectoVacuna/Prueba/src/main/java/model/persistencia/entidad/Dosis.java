package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Dosis")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Dosis.obtenerTodos", query="select e from Dosis e")
})
public class Dosis {

	/**
	 * Identificador de la tabla Dosis. 	
	 */
	@Id
    //@Column(name = "Dosis_id")
    @GeneratedValue(generator = "DosisGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "DosisGen", sequenceName = "Dosis_SEQ",allocationSize = 1)
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
    
    //@Column(name = "edadMin")
    private Integer edadMin;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "edadMax")
    private Integer edadMax;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "embarazo")
    private Boolean embarazo;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Biologico biologico;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private AplicacionVacuna aplicacionVacuna;
    
    
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
    public Integer getEdadMin() {
        return this.edadMin;
    }
    
    /**
    * @generated
    */
    public void setEdadMin(Integer edadMin) {
        this.edadMin = edadMin;
    }
    
    /**
    * @generated
    */
    public Integer getEdadMax() {
        return this.edadMax;
    }
    
    /**
    * @generated
    */
    public void setEdadMax(Integer edadMax) {
        this.edadMax = edadMax;
    }
    
    /**
    * @generated
    */
    public Boolean getEmbarazo() {
        return this.embarazo;
    }
    
    /**
    * @generated
    */
    public void setEmbarazo(Boolean embarazo) {
        this.embarazo = embarazo;
    }
    
	
	/**
	* @generated
	*/
	public Biologico getBiologico() {
	    return this.biologico;
	}
	
	/**
	* @generated
	*/
	public void setBiologico(Biologico biologico) {
	    this.biologico = biologico;
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
	
}
