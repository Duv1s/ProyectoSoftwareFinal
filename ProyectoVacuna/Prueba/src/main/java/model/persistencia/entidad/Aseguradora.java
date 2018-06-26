package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Aseguradora")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Aseguradora.obtenerTodos", query="select e from Aseguradora e")
})
public class Aseguradora {

	/**
	 * Identificador de la tabla Aseguradora. 	
	 */
	@Id
    //@Column(name = "Aseguradora_id")
    @GeneratedValue(generator = "AseguradoraGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "AseguradoraGen", sequenceName = "Aseguradora_SEQ",allocationSize = 1)
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
    
    //@Column(name = "nomre")
    private String nomre;
    
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Paciente paciente;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Regimen regimen;
    
    
    /**
    * @generated
    */
    public String getNomre() {
        return this.nomre;
    }
    
    /**
    * @generated
    */
    public void setNomre(String nomre) {
        this.nomre = nomre;
    }
    
	
	/**
	* @generated
	*/
	public Regimen getRegimen() {
	    return this.regimen;
	}
	
	/**
	* @generated
	*/
	public void setRegimen(Regimen regimen) {
	    this.regimen = regimen;
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
