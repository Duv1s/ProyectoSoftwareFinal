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
public class DosisDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Dosis que se encuentran en la base de datos.
	 * @return lista de Dosis
	 * @generated
	 */
	public List<Dosis> obtenerTodos(){
		return em.createNamedQuery("Dosis.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Dosis dado su identificador. 	
	 * @param id identificador del elemento Dosis
	 * @return Dosis del id dado
	 * @generated
	 */
	public Dosis obtener(Long id){
		return em.find(Dosis.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Dosis
	 * @param entidad Dosis a guardar
	 * @return Dosis con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Dosis guardar(Dosis entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Dosis con el identificador dado.
	 * @param id identificador del Dosis
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Dosis.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Dosis.
	 * @param entidad Dosis a actualizar
	 * @generated
	 */
	public void actualizar(Dosis entidad){
		em.merge(entidad);
	}
	
	
}
