package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="TipoDocumento")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="TipoDocumento.obtenerTodos", query="select e from TipoDocumento e")
})
public class TipoDocumento {

	/**
	 * Identificador de la tabla TipoDocumento. 	
	 */
	@Id
    //@Column(name = "TipoDocumento_id")
    @GeneratedValue(generator = "TipoDocumentoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "TipoDocumentoGen", sequenceName = "TipoDocumento_SEQ",allocationSize = 1)
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
    private Vacunador persona;
    
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
	
	/**
	* @generated
	*/
	public Vacunador getPersona() {
	    return this.persona;
	}
	
	/**
	* @generated
	*/
	public void setPersona(Vacunador persona) {
	    this.persona = persona;
	}
	
}
