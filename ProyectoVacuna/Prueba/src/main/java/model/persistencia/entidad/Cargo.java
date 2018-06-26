package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Cargo")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Cargo.obtenerTodos", query="select e from Cargo e")
})
public class Cargo {

	/**
	 * Identificador de la tabla Cargo. 	
	 */
	@Id
    //@Column(name = "Cargo_id")
    @GeneratedValue(generator = "CargoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "CargoGen", sequenceName = "Cargo_SEQ",allocationSize = 1)
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
    private Vacunador vacunador;
    
    
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
	public Vacunador getVacunador() {
	    return this.vacunador;
	}
	
	/**
	* @generated
	*/
	public void setVacunador(Vacunador vacunador) {
	    this.vacunador = vacunador;
	}
	
}
