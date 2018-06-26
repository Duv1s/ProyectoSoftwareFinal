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
public class PacienteDAO {
	
	@PersistenceContext
    private EntityManager em;

	
	/**
	 * Retorna una lista con los Paciente que se encuentran en la base de datos.
	 * @return lista de Paciente
	 * @generated
	 */
	public List<Paciente> obtenerTodos(){
		return em.createNamedQuery("Paciente.obtenerTodos").getResultList();
	}
	
	/**
	 * Obtiene Paciente dado su identificador. 	
	 * @param id identificador del elemento Paciente
	 * @return Paciente del id dado
	 * @generated
	 */
	public Paciente obtener(Long id){
		return em.find(Paciente.class, id);
	}
	
	
	/**
	 * Almacena la informacion de Paciente
	 * @param entidad Paciente a guardar
	 * @return Paciente con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public Paciente guardar(Paciente entidad){
		em.persist(entidad);
		return entidad;
	}
	
	
	/**
	 * Elimina el registro Paciente con el identificador dado.
	 * @param id identificador del Paciente
	 * @generated 
	 */
	public void borrar(Long id){
		em.remove(em.find(Paciente.class, id));
	}
	
	
	/**
	 * Actualiza la informacion de Paciente.
	 * @param entidad Paciente a actualizar
	 * @generated
	 */
	public void actualizar(Paciente entidad){
		em.merge(entidad);
	}
	
	
}
