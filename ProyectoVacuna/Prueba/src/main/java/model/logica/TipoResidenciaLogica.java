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
public class TipoResidenciaLogica {
	
	@EJB
    private TipoResidenciaDAO persistencia;


	
	/**
	* Retorna una lista con los TipoResidencia que se encuentran en la base de datos
	* @return retorna una lista de TipoResidenciaDTO
	* @generated
	*/
	public List<TipoResidenciaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene TipoResidencia dado su identificador. 	
	* @param id identificador del elemento TipoResidencia
	* @return TipoResidencia del id dado
	* @generated
	*/
	public TipoResidenciaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de TipoResidencia
	 * @param dto TipoResidencia a guardar
	 * @return TipoResidencia con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TipoResidenciaDTO guardar(TipoResidenciaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro TipoResidencia con el identificador dado
	 * @param id identificador del TipoResidencia
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de TipoResidencia
	 * @param dto TipoResidencia a guardar
	 * @generated
	 */
	public void actualizar(TipoResidenciaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un TipoResidenciaDTO en la entidad TipoResidencia.  
	* @param dto a convertir
	* @return entidad TipoResidencia
	* @generated
	*/
	public TipoResidencia convertirDTO(TipoResidenciaDTO dto){
		if(dto==null)return null;
		TipoResidencia entidad=new TipoResidencia();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
			if(dto.getPaciente()!=null){
				entidad.setPaciente(new Paciente());
				entidad.getPaciente().setId(dto.getPaciente().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  TipoResidenciaDTO en una lista de TipoResidencia.  
	* @param dtos a convertir
	* @return entidades List<TipoResidencia>
	* @generated
	*/
	public List<TipoResidencia> convertirDTO(List<TipoResidenciaDTO> dtos){
		List<TipoResidencia> entidades=new ArrayList<TipoResidencia>();
		for(TipoResidenciaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte TipoResidencia en un DTO TipoResidenciaDTO.  
	* @param entidad a convertir
	* @return dto TipoResidenciaDTO
	* @generated
	*/
	public TipoResidenciaDTO convertirEntidad(TipoResidencia entidad){
		TipoResidenciaDTO dto=new TipoResidenciaDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
			if(entidad.getPaciente()!=null){
				dto.setPaciente(
					new PacienteDTO(
						entidad.getPaciente().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de TipoResidencia en una lista de TipoResidenciaDTO.  
	* @param entidades a convertir
	* @return dtos List<TipoResidenciaDTO>
	* @generated
	*/
	public List<TipoResidenciaDTO> convertirEntidad(List<TipoResidencia> entidades){
		List<TipoResidenciaDTO> dtos=new ArrayList<TipoResidenciaDTO>();
		for(TipoResidencia entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
