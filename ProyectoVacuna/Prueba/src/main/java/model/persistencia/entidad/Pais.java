package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Pais")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Pais.obtenerTodos", query="select e from Pais e")
})
public class Pais {

	/**
	 * Identificador de la tabla Pais. 	
	 */
	@Id
    //@Column(name = "Pais_id")
    @GeneratedValue(generator = "PaisGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PaisGen", sequenceName = "Pais_SEQ",allocationSize = 1)
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
    private Departamento departamento;
    
    
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
	public Departamento getDepartamento() {
	    return this.departamento;
	}
	
	/**
	* @generated
	*/
	public void setDepartamento(Departamento departamento) {
	    this.departamento = departamento;
	}
	
}
