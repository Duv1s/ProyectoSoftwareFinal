package model.persistencia.entity;


import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Vacunador")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Vacunador.obtenerTodos", query="select e from Vacunador e")
})
public class Vacunador {

	/**
	 * Identificador de la tabla Vacunador. 	
	 */
	@Id
    //@Column(name = "Vacunador_id")
    @GeneratedValue(generator = "VacunadorGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "VacunadorGen", sequenceName = "Vacunador_SEQ",allocationSize = 1)
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
    
    //@Column(name = "apellido")
    private String apellido;
    
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
    
    //@Column(name = "numeroIdentificacion")
    private String numeroIdentificacion;
    
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
    
    //@Column(name = "direccion")
    private String direccion;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "telefono")
    private String telefono;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "correo")
    private String correo;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Cargo cargo;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private TipoDocumento tipoDocumento;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Genero genero;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private AplicacionVacuna aplicacionVacuna;
    
    /**
    * @generated
    * 0--1-true 
    */
    @OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    private List<Municipio> municipio;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private IPS iPS;
    
    
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
    public String getDireccion() {
        return this.direccion;
    }
    
    /**
    * @generated
    */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    /**
    * @generated
    */
    public String getTelefono() {
        return this.telefono;
    }
    
    /**
    * @generated
    */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    /**
    * @generated
    */
    public String getCorreo() {
        return this.correo;
    }
    
    /**
    * @generated
    */
    public void setCorreo(String correo) {
        this.correo = correo;
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
	public Cargo getCargo() {
	    return this.cargo;
	}
	
	/**
	* @generated
	*/
	public void setCargo(Cargo cargo) {
	    this.cargo = cargo;
	}
	
	/**
	* @generated
	*/
	public TipoDocumento getTipoDocumento() {
	    return this.tipoDocumento;
	}
	
	/**
	* @generated
	*/
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
	    this.tipoDocumento = tipoDocumento;
	}
	
	/**
	* @generated
	*/
	public Genero getGenero() {
	    return this.genero;
	}
	
	/**
	* @generated
	*/
	public void setGenero(Genero genero) {
	    this.genero = genero;
	}
	
	public List<Municipio> getMunicipio(){
		if(municipio!=null){
			municipio=new ArrayList<Municipio>(); 
		}
		return this.municipio;
	}
	
	public void setMunicipio(List<Municipio> municipio){
		this.municipio=municipio;
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
