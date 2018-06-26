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
public class AcudienteDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Acudiente que se encuentran en la base de datos.
	 * @return lista de Acudiente
	 * @generated
	 */
	public List<Acudiente> obtenerTodos(){
		return em.createNamedQuery("Acudiente.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Acudiente dado su identificador. 	
	 * @param id identificador del elemento Acudiente
	 * @return Acudiente del id dado
	 * @generated
	 */
	public Acudiente obtener(Long id){
		return em.find(Acudiente.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Acudiente
	 * @param entidad Acudiente a guardar
	 * @return Acudiente con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Acudiente guardar(Acudiente entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Acudiente con el identificador dado.
	 * @param id identificador del Acudiente
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Acudiente.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Acudiente.
	 * @param entidad Acudiente a actualizar
	 * @generated
	 */
	public void actualizar(Acudiente entidad){
		em.merge(entidad);
	}
	
	
}
