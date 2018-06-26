package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Biologico")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Biologico.obtenerTodos", query="select e from Biologico e")
})
public class Biologico {

	/**
	 * Identificador de la tabla Biologico. 	
	 */
	@Id
    //@Column(name = "Biologico_id")
    @GeneratedValue(generator = "BiologicoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "BiologicoGen", sequenceName = "Biologico_SEQ",allocationSize = 1)
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
    
    //@Column(name = "lote")
    private String lote;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "loteJeringa")
    private String loteJeringa;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Dosis dosis;
    
    
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
    public String getLote() {
        return this.lote;
    }
    
    /**
    * @generated
    */
    public void setLote(String lote) {
        this.lote = lote;
    }
    
    /**
    * @generated
    */
    public String getLoteJeringa() {
        return this.loteJeringa;
    }
    
    /**
    * @generated
    */
    public void setLoteJeringa(String loteJeringa) {
        this.loteJeringa = loteJeringa;
    }
    
	
	/**
	* @generated
	*/
	public Dosis getDosis() {
	    return this.dosis;
	}
	
	/**
	* @generated
	*/
	public void setDosis(Dosis dosis) {
	    this.dosis = dosis;
	}
	
}
