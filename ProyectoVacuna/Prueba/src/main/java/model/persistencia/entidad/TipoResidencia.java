package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="TipoResidencia")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="TipoResidencia.obtenerTodos", query="select e from TipoResidencia e")
})
public class TipoResidencia {

	/**
	 * Identificador de la tabla TipoResidencia. 	
	 */
	@Id
    //@Column(name = "TipoResidencia_id")
    @GeneratedValue(generator = "TipoResidenciaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TipoResidenciaGen", sequenceName = "TipoResidencia_SEQ",allocationSize = 1)
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
