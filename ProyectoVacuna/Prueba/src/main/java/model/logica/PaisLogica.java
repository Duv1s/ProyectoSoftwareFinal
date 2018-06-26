package model.logica;

import model.dto.*;
import model.persistencia.*;
import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
  *  @generated
  *  @author vacunas
  */
@Stateless
public class PaisLogica {
	
	@EJB
    private PaisDAO persistencia;


	
	/**
	* Retorna una lista con los Pais que se encuentran en la base de datos
	* @return retorna una lista de PaisDTO
	* @generated
	*/
	public List<PaisDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Pais dado su identificador. 	
	* @param id identificador del elemento Pais
	* @return Pais del id dado
	* @generated
	*/
	public PaisDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Pais
	 * @param dto Pais a guardar
	 * @return Pais con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public PaisDTO guardar(PaisDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Pais con el identificador dado
	 * @param id identificador del Pais
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Pais
	 * @param dto Pais a guardar
	 * @generated
	 */
	public void actualizar(PaisDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un PaisDTO en la entidad Pais.  
	* @param dto a convertir
	* @return entidad Pais
	* @generated
	*/
	public Pais convertirDTO(PaisDTO dto){
		if(dto==null)return null;
		Pais entidad=new Pais();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
			if(dto.getDepartamento()!=null){
				entidad.setDepartamento(new Departamento());
				entidad.getDepartamento().setId(dto.getDepartamento().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  PaisDTO en una lista de Pais.  
	* @param dtos a convertir
	* @return entidades List<Pais>
	* @generated
	*/
	public List<Pais> convertirDTO(List<PaisDTO> dtos){
		List<Pais> entidades=new ArrayList<Pais>();
		for(PaisDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Pais en un DTO PaisDTO.  
	* @param entidad a convertir
	* @return dto PaisDTO
	* @generated
	*/
	public PaisDTO convertirEntidad(Pais entidad){
		PaisDTO dto=new PaisDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
			if(entidad.getDepartamento()!=null){
				dto.setDepartamento(
					new DepartamentoDTO(
						entidad.getDepartamento().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Pais en una lista de PaisDTO.  
	* @param entidades a convertir
	* @return dtos List<PaisDTO>
	* @generated
	*/
	public List<PaisDTO> convertirEntidad(List<Pais> entidades){
		List<PaisDTO> dtos=new ArrayList<PaisDTO>();
		for(Pais entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
