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
@Table(name="AplicacionVacuna")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="AplicacionVacuna.obtenerTodos", query="select e from AplicacionVacuna e")
})
public class AplicacionVacuna {

	/**
	 * Identificador de la tabla AplicacionVacuna. 	
	 */
	@Id
    //@Column(name = "AplicacionVacuna_id")
    @GeneratedValue(generator = "AplicacionVacunaGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "AplicacionVacunaGen", sequenceName = "AplicacionVacuna_SEQ",allocationSize = 1)
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
    //@Column(name = "fecha")
    private Date fecha;
    
    
    /**
    * @generated
    * 0--1-true 
    */
    @OneToMany(cascade={},fetch=javax.persistence.FetchType.LAZY)
    private List<Vacunador> vacunador;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Paciente paciente;
    
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
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Dosis dosis;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private IPS iPS;
    
    
    /**
    * @generated
    */
    public Date getFecha() {
        return this.fecha;
    }
    
    /**
    * @generated
    */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
	
	/**
	* @generated
	*/
	public Dosis getDosis() {
	    return this.dosis;
	}
	
	/**
	* @generated
	*/
	public void setDosis(Dosis dosis) {
	    this.dosis = dosis;
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
	
	public List<Vacunador> getVacunador(){
		if(vacunador!=null){
			vacunador=new ArrayList<Vacunador>(); 
		}
		return this.vacunador;
	}
	
	public void setVacunador(List<Vacunador> vacunador){
		this.vacunador=vacunador;
	}
	
}
