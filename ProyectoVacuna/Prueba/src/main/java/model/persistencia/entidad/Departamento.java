package model.persistencia.entity;


import javax.persistence.*;

/**
  *  
  *  @author vacunas
  *  @generated	  
*/
@Entity
@Table(name="Departamento")//, schema="${schema}")
@NamedQueries({
	@NamedQuery(name="Departamento.obtenerTodos", query="select e from Departamento e")
})
public class Departamento {

	/**
	 * Identificador de la tabla Departamento. 	
	 */
	@Id
    //@Column(name = "Departamento_id")
    @GeneratedValue(generator = "DepartamentoGen", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "DepartamentoGen", sequenceName = "Departamento_SEQ",allocationSize = 1)
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
    private Municipio municipio;
    
    /**
    * @generated
    * 0-1-false
    */
    @ManyToOne(cascade={},fetch=FetchType.EAGER)
    private Pais pais;
    
    
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
	public Pais getPais() {
	    return this.pais;
	}
	
	/**
	* @generated
	*/
	public void setPais(Pais pais) {
	    this.pais = pais;
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
	
}
