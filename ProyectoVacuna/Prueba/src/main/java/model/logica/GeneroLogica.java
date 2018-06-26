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
public class GeneroLogica {
	
	@EJB
    private GeneroDAO persistencia;


	
	/**
	* Retorna una lista con los Genero que se encuentran en la base de datos
	* @return retorna una lista de GeneroDTO
	* @generated
	*/
	public List<GeneroDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Genero dado su identificador. 	
	* @param id identificador del elemento Genero
	* @return Genero del id dado
	* @generated
	*/
	public GeneroDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Genero
	 * @param dto Genero a guardar
	 * @return Genero con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public GeneroDTO guardar(GeneroDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Genero con el identificador dado
	 * @param id identificador del Genero
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Genero
	 * @param dto Genero a guardar
	 * @generated
	 */
	public void actualizar(GeneroDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un GeneroDTO en la entidad Genero.  
	* @param dto a convertir
	* @return entidad Genero
	* @generated
	*/
	public Genero convertirDTO(GeneroDTO dto){
		if(dto==null)return null;
		Genero entidad=new Genero();
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
	* Convierte una lista de  GeneroDTO en una lista de Genero.  
	* @param dtos a convertir
	* @return entidades List<Genero>
	* @generated
	*/
	public List<Genero> convertirDTO(List<GeneroDTO> dtos){
		List<Genero> entidades=new ArrayList<Genero>();
		for(GeneroDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Genero en un DTO GeneroDTO.  
	* @param entidad a convertir
	* @return dto GeneroDTO
	* @generated
	*/
	public GeneroDTO convertirEntidad(Genero entidad){
		GeneroDTO dto=new GeneroDTO();
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
	* Convierte una lista de Genero en una lista de GeneroDTO.  
	* @param entidades a convertir
	* @return dtos List<GeneroDTO>
	* @generated
	*/
	public List<GeneroDTO> convertirEntidad(List<Genero> entidades){
		List<GeneroDTO> dtos=new ArrayList<GeneroDTO>();
		for(Genero entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
