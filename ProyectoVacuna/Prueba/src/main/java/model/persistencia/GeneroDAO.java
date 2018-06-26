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
public class GeneroDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Genero que se encuentran en la base de datos.
	 * @return lista de Genero
	 * @generated
	 */
	public List<Genero> obtenerTodos(){
		return em.createNamedQuery("Genero.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Genero dado su identificador. 	
	 * @param id identificador del elemento Genero
	 * @return Genero del id dado
	 * @generated
	 */
	public Genero obtener(Long id){
		return em.find(Genero.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Genero
	 * @param entidad Genero a guardar
	 * @return Genero con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Genero guardar(Genero entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Genero con el identificador dado.
	 * @param id identificador del Genero
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Genero.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Genero.
	 * @param entidad Genero a actualizar
	 * @generated
	 */
	public void actualizar(Genero entidad){
		em.merge(entidad);
	}
	
	
}
