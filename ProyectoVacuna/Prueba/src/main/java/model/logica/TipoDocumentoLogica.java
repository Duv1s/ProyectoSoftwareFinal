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
public class TipoDocumentoLogica {
	
	@EJB
    private TipoDocumentoDAO persistencia;


	
	/**
	* Retorna una lista con los TipoDocumento que se encuentran en la base de datos
	* @return retorna una lista de TipoDocumentoDTO
	* @generated
	*/
	public List<TipoDocumentoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene TipoDocumento dado su identificador. 	
	* @param id identificador del elemento TipoDocumento
	* @return TipoDocumento del id dado
	* @generated
	*/
	public TipoDocumentoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de TipoDocumento
	 * @param dto TipoDocumento a guardar
	 * @return TipoDocumento con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public TipoDocumentoDTO guardar(TipoDocumentoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro TipoDocumento con el identificador dado
	 * @param id identificador del TipoDocumento
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de TipoDocumento
	 * @param dto TipoDocumento a guardar
	 * @generated
	 */
	public void actualizar(TipoDocumentoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un TipoDocumentoDTO en la entidad TipoDocumento.  
	* @param dto a convertir
	* @return entidad TipoDocumento
	* @generated
	*/
	public TipoDocumento convertirDTO(TipoDocumentoDTO dto){
		if(dto==null)return null;
		TipoDocumento entidad=new TipoDocumento();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
			if(dto.getPaciente()!=null){
				entidad.setPaciente(new Paciente());
				entidad.getPaciente().setId(dto.getPaciente().getId());
			}
			if(dto.getPersona()!=null){
				entidad.setPersona(new Vacunador());
				entidad.getPersona().setId(dto.getPersona().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  TipoDocumentoDTO en una lista de TipoDocumento.  
	* @param dtos a convertir
	* @return entidades List<TipoDocumento>
	* @generated
	*/
	public List<TipoDocumento> convertirDTO(List<TipoDocumentoDTO> dtos){
		List<TipoDocumento> entidades=new ArrayList<TipoDocumento>();
		for(TipoDocumentoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte TipoDocumento en un DTO TipoDocumentoDTO.  
	* @param entidad a convertir
	* @return dto TipoDocumentoDTO
	* @generated
	*/
	public TipoDocumentoDTO convertirEntidad(TipoDocumento entidad){
		TipoDocumentoDTO dto=new TipoDocumentoDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
			if(entidad.getPersona()!=null){
				dto.setPersona(
					new VacunadorDTO(
						entidad.getPersona().getId()));
			}
			if(entidad.getPaciente()!=null){
				dto.setPaciente(
					new PacienteDTO(
						entidad.getPaciente().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de TipoDocumento en una lista de TipoDocumentoDTO.  
	* @param entidades a convertir
	* @return dtos List<TipoDocumentoDTO>
	* @generated
	*/
	public List<TipoDocumentoDTO> convertirEntidad(List<TipoDocumento> entidades){
		List<TipoDocumentoDTO> dtos=new ArrayList<TipoDocumentoDTO>();
		for(TipoDocumento entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
