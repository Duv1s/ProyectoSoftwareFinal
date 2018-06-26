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
public class IPSDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los IPS que se encuentran en la base de datos.
	 * @return lista de IPS
	 * @generated
	 */
	public List<IPS> obtenerTodos(){
		return em.createNamedQuery("IPS.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene IPS dado su identificador. 	
	 * @param id identificador del elemento IPS
	 * @return IPS del id dado
	 * @generated
	 */
	public IPS obtener(Long id){
		return em.find(IPS.class, id);
	}
	
	
	/**
	 * Almacena la informacion de IPS
	 * @param entidad IPS a guardar
	 * @return IPS con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public IPS guardar(IPS entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro IPS con el identificador dado.
	 * @param id identificador del IPS
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(IPS.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de IPS.
	 * @param entidad IPS a actualizar
	 * @generated
	 */
	public void actualizar(IPS entidad){
		em.merge(entidad);
	}
	
	
}
