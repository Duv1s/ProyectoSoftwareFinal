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
public class TipoDocumentoDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los TipoDocumento que se encuentran en la base de datos.
	 * @return lista de TipoDocumento
	 * @generated
	 */
	public List<TipoDocumento> obtenerTodos(){
		return em.createNamedQuery("TipoDocumento.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene TipoDocumento dado su identificador. 	
	 * @param id identificador del elemento TipoDocumento
	 * @return TipoDocumento del id dado
	 * @generated
	 */
	public TipoDocumento obtener(Long id){
		return em.find(TipoDocumento.class, id);
	}
	
	
	/**
	 * Almacena la informacion de TipoDocumento
	 * @param entidad TipoDocumento a guardar
	 * @return TipoDocumento con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TipoDocumento guardar(TipoDocumento entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro TipoDocumento con el identificador dado.
	 * @param id identificador del TipoDocumento
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(TipoDocumento.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de TipoDocumento.
	 * @param entidad TipoDocumento a actualizar
	 * @generated
	 */
	public void actualizar(TipoDocumento entidad){
		em.merge(entidad);
	}
	
	
}
