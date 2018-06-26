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
public class PaisDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Pais que se encuentran en la base de datos.
	 * @return lista de Pais
	 * @generated
	 */
	public List<Pais> obtenerTodos(){
		return em.createNamedQuery("Pais.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Pais dado su identificador. 	
	 * @param id identificador del elemento Pais
	 * @return Pais del id dado
	 * @generated
	 */
	public Pais obtener(Long id){
		return em.find(Pais.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Pais
	 * @param entidad Pais a guardar
	 * @return Pais con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Pais guardar(Pais entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Pais con el identificador dado.
	 * @param id identificador del Pais
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Pais.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Pais.
	 * @param entidad Pais a actualizar
	 * @generated
	 */
	public void actualizar(Pais entidad){
		em.merge(entidad);
	}
	
	
}
