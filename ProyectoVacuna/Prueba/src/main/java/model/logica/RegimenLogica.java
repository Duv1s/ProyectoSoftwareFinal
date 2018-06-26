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
public class RegimenLogica {
	
	@EJB
    private RegimenDAO persistencia;


	
	/**
	* Retorna una lista con los Regimen que se encuentran en la base de datos
	* @return retorna una lista de RegimenDTO
	* @generated
	*/
	public List<RegimenDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Regimen dado su identificador. 	
	* @param id identificador del elemento Regimen
	* @return Regimen del id dado
	* @generated
	*/
	public RegimenDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Regimen
	 * @param dto Regimen a guardar
	 * @return Regimen con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public RegimenDTO guardar(RegimenDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Regimen con el identificador dado
	 * @param id identificador del Regimen
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Regimen
	 * @param dto Regimen a guardar
	 * @generated
	 */
	public void actualizar(RegimenDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un RegimenDTO en la entidad Regimen.  
	* @param dto a convertir
	* @return entidad Regimen
	* @generated
	*/
	public Regimen convertirDTO(RegimenDTO dto){
		if(dto==null)return null;
		Regimen entidad=new Regimen();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
			if(dto.getAseguradora()!=null){
				entidad.setAseguradora(new Aseguradora());
				entidad.getAseguradora().setId(dto.getAseguradora().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  RegimenDTO en una lista de Regimen.  
	* @param dtos a convertir
	* @return entidades List<Regimen>
	* @generated
	*/
	public List<Regimen> convertirDTO(List<RegimenDTO> dtos){
		List<Regimen> entidades=new ArrayList<Regimen>();
		for(RegimenDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Regimen en un DTO RegimenDTO.  
	* @param entidad a convertir
	* @return dto RegimenDTO
	* @generated
	*/
	public RegimenDTO convertirEntidad(Regimen entidad){
		RegimenDTO dto=new RegimenDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
			if(entidad.getAseguradora()!=null){
				dto.setAseguradora(
					new AseguradoraDTO(
						entidad.getAseguradora().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Regimen en una lista de RegimenDTO.  
	* @param entidades a convertir
	* @return dtos List<RegimenDTO>
	* @generated
	*/
	public List<RegimenDTO> convertirEntidad(List<Regimen> entidades){
		List<RegimenDTO> dtos=new ArrayList<RegimenDTO>();
		for(Regimen entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
