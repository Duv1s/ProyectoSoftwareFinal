package model.persistencia.entity;


import java.util.Date;
import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Acudiente")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Acudiente.obtenerTodos", query="select e from Acudiente e")
})
public class Acudiente {

	/**
	 * Identificador de la tabla Acudiente. 	
	 */
	@Id
    //@Column(name = "Acudiente_id")
    @GeneratedValue(generator = "AcudienteGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "AcudienteGen", sequenceName = "Acudiente_SEQ",allocationSize = 1)
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
    @Temporal(TemporalType.DATE)
    //@Column(name = "fechaNacimiento")
    private Date fechaNacimiento;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "numeroIdentificacion")
    private String numeroIdentificacion;
    
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
    
    //@Column(name = "apellido")
    private String apellido;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Paciente paciente;
    
    
    /**
    * @generated
    */
    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    
    /**
    * @generated
    */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    /**
    * @generated
    */
    public String getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }
    
    /**
    * @generated
    */
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
    
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
    public String getApellido() {
        return this.apellido;
    }
    
    /**
    * @generated
    */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
