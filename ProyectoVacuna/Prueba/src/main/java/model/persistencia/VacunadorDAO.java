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
public class VacunadorDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Vacunador que se encuentran en la base de datos.
	 * @return lista de Vacunador
	 * @generated
	 */
	public List<Vacunador> obtenerTodos(){
		return em.createNamedQuery("Vacunador.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Vacunador dado su identificador. 	
	 * @param id identificador del elemento Vacunador
	 * @return Vacunador del id dado
	 * @generated
	 */
	public Vacunador obtener(Long id){
		return em.find(Vacunador.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Vacunador
	 * @param entidad Vacunador a guardar
	 * @return Vacunador con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Vacunador guardar(Vacunador entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Vacunador con el identificador dado.
	 * @param id identificador del Vacunador
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Vacunador.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Vacunador.
	 * @param entidad Vacunador a actualizar
	 * @generated
	 */
	public void actualizar(Vacunador entidad){
		em.merge(entidad);
	}
	
	
}
