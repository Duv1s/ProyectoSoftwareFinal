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
public class TipoResidenciaDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los TipoResidencia que se encuentran en la base de datos.
	 * @return lista de TipoResidencia
	 * @generated
	 */
	public List<TipoResidencia> obtenerTodos(){
		return em.createNamedQuery("TipoResidencia.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene TipoResidencia dado su identificador. 	
	 * @param id identificador del elemento TipoResidencia
	 * @return TipoResidencia del id dado
	 * @generated
	 */
	public TipoResidencia obtener(Long id){
		return em.find(TipoResidencia.class, id);
	}
	
	
	/**
	 * Almacena la informacion de TipoResidencia
	 * @param entidad TipoResidencia a guardar
	 * @return TipoResidencia con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TipoResidencia guardar(TipoResidencia entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro TipoResidencia con el identificador dado.
	 * @param id identificador del TipoResidencia
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(TipoResidencia.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de TipoResidencia.
	 * @param entidad TipoResidencia a actualizar
	 * @generated
	 */
	public void actualizar(TipoResidencia entidad){
		em.merge(entidad);
	}
	
	
}
