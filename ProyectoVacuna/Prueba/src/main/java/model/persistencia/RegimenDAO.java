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
public class RegimenDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Regimen que se encuentran en la base de datos.
	 * @return lista de Regimen
	 * @generated
	 */
	public List<Regimen> obtenerTodos(){
		return em.createNamedQuery("Regimen.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Regimen dado su identificador. 	
	 * @param id identificador del elemento Regimen
	 * @return Regimen del id dado
	 * @generated
	 */
	public Regimen obtener(Long id){
		return em.find(Regimen.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Regimen
	 * @param entidad Regimen a guardar
	 * @return Regimen con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Regimen guardar(Regimen entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Regimen con el identificador dado.
	 * @param id identificador del Regimen
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Regimen.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Regimen.
	 * @param entidad Regimen a actualizar
	 * @generated
	 */
	public void actualizar(Regimen entidad){
		em.merge(entidad);
	}
	
	
}
