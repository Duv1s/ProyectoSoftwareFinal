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
public class AplicacionVacunaDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los AplicacionVacuna que se encuentran en la base de datos.
	 * @return lista de AplicacionVacuna
	 * @generated
	 */
	public List<AplicacionVacuna> obtenerTodos(){
		return em.createNamedQuery("AplicacionVacuna.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene AplicacionVacuna dado su identificador. 	
	 * @param id identificador del elemento AplicacionVacuna
	 * @return AplicacionVacuna del id dado
	 * @generated
	 */
	public AplicacionVacuna obtener(Long id){
		return em.find(AplicacionVacuna.class, id);
	}
	
	
	/**
	 * Almacena la informacion de AplicacionVacuna
	 * @param entidad AplicacionVacuna a guardar
	 * @return AplicacionVacuna con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public AplicacionVacuna guardar(AplicacionVacuna entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro AplicacionVacuna con el identificador dado.
	 * @param id identificador del AplicacionVacuna
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(AplicacionVacuna.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de AplicacionVacuna.
	 * @param entidad AplicacionVacuna a actualizar
	 * @generated
	 */
	public void actualizar(AplicacionVacuna entidad){
		em.merge(entidad);
	}
	
	
}
