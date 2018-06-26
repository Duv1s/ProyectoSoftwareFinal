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
public class BiologicoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Biologico que se encuentran en la base de datos.
	 * @return lista de Biologico
	 * @generated
	 */
	public List<Biologico> obtenerTodos(){
		return em.createNamedQuery("Biologico.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Biologico dado su identificador. 	
	 * @param id identificador del elemento Biologico
	 * @return Biologico del id dado
	 * @generated
	 */
	public Biologico obtener(Long id){
		return em.find(Biologico.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Biologico
	 * @param entidad Biologico a guardar
	 * @return Biologico con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Biologico guardar(Biologico entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Biologico con el identificador dado.
	 * @param id identificador del Biologico
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Biologico.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Biologico.
	 * @param entidad Biologico a actualizar
	 * @generated
	 */
	public void actualizar(Biologico entidad){
		em.merge(entidad);
	}
	
	
}
