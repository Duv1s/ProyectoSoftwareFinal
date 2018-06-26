package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Regimen")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Regimen.obtenerTodos", query="select e from Regimen e")
})
public class Regimen {

	/**
	 * Identificador de la tabla Regimen. 	
	 */
	@Id
    //@Column(name = "Regimen_id")
    @GeneratedValue(generator = "RegimenGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "RegimenGen", sequenceName = "Regimen_SEQ",allocationSize = 1)
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
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Aseguradora aseguradora;
    
    
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
	public Aseguradora getAseguradora() {
	    return this.aseguradora;
	}
	
	/**
	* @generated
	*/
	public void setAseguradora(Aseguradora aseguradora) {
	    this.aseguradora = aseguradora;
	}
	
}
