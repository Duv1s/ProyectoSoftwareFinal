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
public class DosisLogica {
	
	@EJB
    private DosisDAO persistencia;


	
	/**
	* Retorna una lista con los Dosis que se encuentran en la base de datos
	* @return retorna una lista de DosisDTO
	* @generated
	*/
	public List<DosisDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Dosis dado su identificador. 	
	* @param id identificador del elemento Dosis
	* @return Dosis del id dado
	* @generated
	*/
	public DosisDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Dosis
	 * @param dto Dosis a guardar
	 * @return Dosis con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public DosisDTO guardar(DosisDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Dosis con el identificador dado
	 * @param id identificador del Dosis
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Dosis
	 * @param dto Dosis a guardar
	 * @generated
	 */
	public void actualizar(DosisDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un DosisDTO en la entidad Dosis.  
	* @param dto a convertir
	* @return entidad Dosis
	* @generated
	*/
	public Dosis convertirDTO(DosisDTO dto){
		if(dto==null)return null;
		Dosis entidad=new Dosis();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setEdadMin(dto.getEdadMin());
			entidad.setEdadMax(dto.getEdadMax());
			entidad.setEmbarazo(dto.getEmbarazo());
		
			if(dto.getAplicacionVacuna()!=null){
				entidad.setAplicacionVacuna(new AplicacionVacuna());
				entidad.getAplicacionVacuna().setId(dto.getAplicacionVacuna().getId());
			}
			if(dto.getBiologico()!=null){
				entidad.setBiologico(new Biologico());
				entidad.getBiologico().setId(dto.getBiologico().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  DosisDTO en una lista de Dosis.  
	* @param dtos a convertir
	* @return entidades List<Dosis>
	* @generated
	*/
	public List<Dosis> convertirDTO(List<DosisDTO> dtos){
		List<Dosis> entidades=new ArrayList<Dosis>();
		for(DosisDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Dosis en un DTO DosisDTO.  
	* @param entidad a convertir
	* @return dto DosisDTO
	* @generated
	*/
	public DosisDTO convertirEntidad(Dosis entidad){
		DosisDTO dto=new DosisDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
				dto.setEdadMin(entidad.getEdadMin());
				dto.setEdadMax(entidad.getEdadMax());
				dto.setEmbarazo(entidad.getEmbarazo());
		
			if(entidad.getBiologico()!=null){
				dto.setBiologico(
					new BiologicoDTO(
						entidad.getBiologico().getId()));
			}
			if(entidad.getAplicacionVacuna()!=null){
				dto.setAplicacionVacuna(
					new AplicacionVacunaDTO(
						entidad.getAplicacionVacuna().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Dosis en una lista de DosisDTO.  
	* @param entidades a convertir
	* @return dtos List<DosisDTO>
	* @generated
	*/
	public List<DosisDTO> convertirEntidad(List<Dosis> entidades){
		List<DosisDTO> dtos=new ArrayList<DosisDTO>();
		for(Dosis entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
