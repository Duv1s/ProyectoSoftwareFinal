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
public class GrupoEtnicoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los GrupoEtnico que se encuentran en la base de datos.
	 * @return lista de GrupoEtnico
	 * @generated
	 */
	public List<GrupoEtnico> obtenerTodos(){
		return em.createNamedQuery("GrupoEtnico.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene GrupoEtnico dado su identificador. 	
	 * @param id identificador del elemento GrupoEtnico
	 * @return GrupoEtnico del id dado
	 * @generated
	 */
	public GrupoEtnico obtener(Long id){
		return em.find(GrupoEtnico.class, id);
	}
	
	
	/**
	 * Almacena la informacion de GrupoEtnico
	 * @param entidad GrupoEtnico a guardar
	 * @return GrupoEtnico con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public GrupoEtnico guardar(GrupoEtnico entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro GrupoEtnico con el identificador dado.
	 * @param id identificador del GrupoEtnico
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(GrupoEtnico.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de GrupoEtnico.
	 * @param entidad GrupoEtnico a actualizar
	 * @generated
	 */
	public void actualizar(GrupoEtnico entidad){
		em.merge(entidad);
	}
	
	
}
