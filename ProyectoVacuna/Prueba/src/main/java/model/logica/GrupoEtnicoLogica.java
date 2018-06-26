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
public class GrupoEtnicoLogica {
	
	@EJB
    private GrupoEtnicoDAO persistencia;


	
	/**
	* Retorna una lista con los GrupoEtnico que se encuentran en la base de datos
	* @return retorna una lista de GrupoEtnicoDTO
	* @generated
	*/
	public List<GrupoEtnicoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene GrupoEtnico dado su identificador. 	
	* @param id identificador del elemento GrupoEtnico
	* @return GrupoEtnico del id dado
	* @generated
	*/
	public GrupoEtnicoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de GrupoEtnico
	 * @param dto GrupoEtnico a guardar
	 * @return GrupoEtnico con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public GrupoEtnicoDTO guardar(GrupoEtnicoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro GrupoEtnico con el identificador dado
	 * @param id identificador del GrupoEtnico
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de GrupoEtnico
	 * @param dto GrupoEtnico a guardar
	 * @generated
	 */
	public void actualizar(GrupoEtnicoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un GrupoEtnicoDTO en la entidad GrupoEtnico.  
	* @param dto a convertir
	* @return entidad GrupoEtnico
	* @generated
	*/
	public GrupoEtnico convertirDTO(GrupoEtnicoDTO dto){
		if(dto==null)return null;
		GrupoEtnico entidad=new GrupoEtnico();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
			if(dto.getPaciente()!=null){
				entidad.setPaciente(new Paciente());
				entidad.getPaciente().setId(dto.getPaciente().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  GrupoEtnicoDTO en una lista de GrupoEtnico.  
	* @param dtos a convertir
	* @return entidades List<GrupoEtnico>
	* @generated
	*/
	public List<GrupoEtnico> convertirDTO(List<GrupoEtnicoDTO> dtos){
		List<GrupoEtnico> entidades=new ArrayList<GrupoEtnico>();
		for(GrupoEtnicoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte GrupoEtnico en un DTO GrupoEtnicoDTO.  
	* @param entidad a convertir
	* @return dto GrupoEtnicoDTO
	* @generated
	*/
	public GrupoEtnicoDTO convertirEntidad(GrupoEtnico entidad){
		GrupoEtnicoDTO dto=new GrupoEtnicoDTO();
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
	* Convierte una lista de GrupoEtnico en una lista de GrupoEtnicoDTO.  
	* @param entidades a convertir
	* @return dtos List<GrupoEtnicoDTO>
	* @generated
	*/
	public List<GrupoEtnicoDTO> convertirEntidad(List<GrupoEtnico> entidades){
		List<GrupoEtnicoDTO> dtos=new ArrayList<GrupoEtnicoDTO>();
		for(GrupoEtnico entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
