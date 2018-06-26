package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="GrupoEtnico")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="GrupoEtnico.obtenerTodos", query="select e from GrupoEtnico e")
})
public class GrupoEtnico {

	/**
	 * Identificador de la tabla GrupoEtnico. 	
	 */
	@Id
    //@Column(name = "GrupoEtnico_id")
    @GeneratedValue(generator = "GrupoEtnicoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "GrupoEtnicoGen", sequenceName = "GrupoEtnico_SEQ",allocationSize = 1)
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
    private Paciente paciente;
    
    
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
	public Paciente getPaciente() {
	    return this.paciente;
	}
	
	/**
	* @generated
	*/
	public void setPaciente(Paciente paciente) {
	    this.paciente = paciente;
	}
	
}
