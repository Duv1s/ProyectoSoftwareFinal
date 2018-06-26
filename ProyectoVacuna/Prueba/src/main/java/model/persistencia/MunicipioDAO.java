package model.persistencia;

import model.persistencia.entity.*;
import java.util.List;
import javax.persistence.*;
import javax.ejb.Stateless;

/**
 *  @generated
 *  @author vacunas
 */
@Stateless
public class MunicipioDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Municipio que se encuentran en la base de datos.
	 * @return lista de Municipio
	 * @generated
	 */
	public List<Municipio> obtenerTodos(){
		return em.createNamedQuery("Municipio.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Municipio dado su identificador. 	
	 * @param id identificador del elemento Municipio
	 * @return Municipio del id dado
	 * @generated
	 */
	public Municipio obtener(Long id){
		return em.find(Municipio.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Municipio
	 * @param entidad Municipio a guardar
	 * @return Municipio con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Municipio guardar(Municipio entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Municipio con el identificador dado.
	 * @param id identificador del Municipio
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Municipio.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Municipio.
	 * @param entidad Municipio a actualizar
	 * @generated
	 */
	public void actualizar(Municipio entidad){
		em.merge(entidad);
	}
	
	
}
