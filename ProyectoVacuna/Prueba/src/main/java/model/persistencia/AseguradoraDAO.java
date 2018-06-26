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
public class AseguradoraDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Aseguradora que se encuentran en la base de datos.
	 * @return lista de Aseguradora
	 * @generated
	 */
	public List<Aseguradora> obtenerTodos(){
		return em.createNamedQuery("Aseguradora.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Aseguradora dado su identificador. 	
	 * @param id identificador del elemento Aseguradora
	 * @return Aseguradora del id dado
	 * @generated
	 */
	public Aseguradora obtener(Long id){
		return em.find(Aseguradora.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Aseguradora
	 * @param entidad Aseguradora a guardar
	 * @return Aseguradora con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Aseguradora guardar(Aseguradora entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Aseguradora con el identificador dado.
	 * @param id identificador del Aseguradora
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Aseguradora.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Aseguradora.
	 * @param entidad Aseguradora a actualizar
	 * @generated
	 */
	public void actualizar(Aseguradora entidad){
		em.merge(entidad);
	}
	
	
}
