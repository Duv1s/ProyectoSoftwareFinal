package model.persistencia.entity;


import java.util.Date;
import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Paciente")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Paciente.obtenerTodos", query="select e from Paciente e")
})
public class Paciente {

	/**
	 * Identificador de la tabla Paciente. 	
	 */
	@Id
    //@Column(name = "Paciente_id")
    @GeneratedValue(generator = "PacienteGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PacienteGen", sequenceName = "Paciente_SEQ",allocationSize = 1)
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
    
    //@Column(name = "desplazado")
    private Boolean desplazado;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "victimaConflicto")
    private Boolean victimaConflicto;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "discapacidad")
    private Boolean discapacidad;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "Gestante")
    private Boolean Gestante;
    
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
    * 1-1-false
    */
    
    //@Column(name = "correo")
    private String correo;
    
    /**
    * @generated
    * 1-1-false
    */
    
    //@Column(name = "telefono")
    private String telefono;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Municipio municipio;
    
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
    */
    public Boolean getDesplazado() {
        return this.desplazado;
    }
    
    /**
    * @generated
    */
    public void setDesplazado(Boolean desplazado) {
        this.desplazado = desplazado;
    }
    
    /**
    * @generated
    */
    public Boolean getVictimaConflicto() {
        return this.victimaConflicto;
    }
    
    /**
    * @generated
    */
    public void setVictimaConflicto(Boolean victimaConflicto) {
        this.victimaConflicto = victimaConflicto;
    }
    
    /**
    * @generated
    */
    public Boolean getDiscapacidad() {
        return this.discapacidad;
    }
    
    /**
    * @generated
    */
    public void setDiscapacidad(Boolean discapacidad) {
        this.discapacidad = discapacidad;
    }
    
    /**
    * @generated
    */
    public Boolean getGestante() {
        return this.Gestante;
    }
    
    /**
    * @generated
    */
    public void setGestante(Boolean Gestante) {
        this.Gestante = Gestante;
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
	
	/**
	* @generated
	*/
	public Municipio getMunicipio() {
	    return this.municipio;
	}
	
	/**
	* @generated
	*/
	public void setMunicipio(Municipio municipio) {
	    this.municipio = municipio;
	}
        
          @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Aseguradora aseguradora;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Acudiente acudiente;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private AplicacionVacuna aplicacionVacuna;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private TipoResidencia tipoResidencia;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private GrupoEtnico grupoEtnico;
    
    
    
    
    
	
	/**
	* @generated
	*/
	public GrupoEtnico getGrupoEtnico() {
	    return this.grupoEtnico;
	}
	
	/**
	* @generated
	*/
	public void setGrupoEtnico(GrupoEtnico grupoEtnico) {
	    this.grupoEtnico = grupoEtnico;
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
	
	/**
	* @generated
	*/
	public Acudiente getAcudiente() {
	    return this.acudiente;
	}
	
	/**
	* @generated
	*/
	public void setAcudiente(Acudiente acudiente) {
	    this.acudiente = acudiente;
	}
	
	/**
	* @generated
	*/
	public TipoResidencia getTipoResidencia() {
	    return this.tipoResidencia;
	}
	
	/**
	* @generated
	*/
	public void setTipoResidencia(TipoResidencia tipoResidencia) {
	    this.tipoResidencia = tipoResidencia;
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
