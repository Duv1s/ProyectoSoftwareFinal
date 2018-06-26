package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Municipio")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Municipio.obtenerTodos", query="select e from Municipio e")
})
public class Municipio {

	/**
	 * Identificador de la tabla Municipio. 	
	 */
	@Id
    //@Column(name = "Municipio_id")
    @GeneratedValue(generator = "MunicipioGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "MunicipioGen", sequenceName = "Municipio_SEQ",allocationSize = 1)
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
    * 1-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private IPS iPS;
    
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
	public IPS getIPS() {
	    return this.iPS;
	}
	
	/**
	* @generated
	*/
	public void setIPS(IPS iPS) {
	    this.iPS = iPS;
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
