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
public class MunicipioLogica {
	
	@EJB
    private MunicipioDAO persistencia;


	
	/**
	* Retorna una lista con los Municipio que se encuentran en la base de datos
	* @return retorna una lista de MunicipioDTO
	* @generated
	*/
	public List<MunicipioDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Municipio dado su identificador. 	
	* @param id identificador del elemento Municipio
	* @return Municipio del id dado
	* @generated
	*/
	public MunicipioDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Municipio
	 * @param dto Municipio a guardar
	 * @return Municipio con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public MunicipioDTO guardar(MunicipioDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Municipio con el identificador dado
	 * @param id identificador del Municipio
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Municipio
	 * @param dto Municipio a guardar
	 * @generated
	 */
	public void actualizar(MunicipioDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un MunicipioDTO en la entidad Municipio.  
	* @param dto a convertir
	* @return entidad Municipio
	* @generated
	*/
	public Municipio convertirDTO(MunicipioDTO dto){
		if(dto==null)return null;
		Municipio entidad=new Municipio();
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
			if(dto.getDepartamento()!=null){
				entidad.setDepartamento(new Departamento());
				entidad.getDepartamento().setId(dto.getDepartamento().getId());
			}
			if(dto.getIPS()!=null){
				entidad.setIPS(new IPS());
				entidad.getIPS().setId(dto.getIPS().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  MunicipioDTO en una lista de Municipio.  
	* @param dtos a convertir
	* @return entidades List<Municipio>
	* @generated
	*/
	public List<Municipio> convertirDTO(List<MunicipioDTO> dtos){
		List<Municipio> entidades=new ArrayList<Municipio>();
		for(MunicipioDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Municipio en un DTO MunicipioDTO.  
	* @param entidad a convertir
	* @return dto MunicipioDTO
	* @generated
	*/
	public MunicipioDTO convertirEntidad(Municipio entidad){
		MunicipioDTO dto=new MunicipioDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
			if(entidad.getPersona()!=null){
				dto.setPersona(
					new VacunadorDTO(
						entidad.getPersona().getId()));
			}
			if(entidad.getIPS()!=null){
				dto.setIPS(
					new IPSDTO(
						entidad.getIPS().getId()));
			}
			if(entidad.getPaciente()!=null){
				dto.setPaciente(
					new PacienteDTO(
						entidad.getPaciente().getId()));
			}
			if(entidad.getDepartamento()!=null){
				dto.setDepartamento(
					new DepartamentoDTO(
						entidad.getDepartamento().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Municipio en una lista de MunicipioDTO.  
	* @param entidades a convertir
	* @return dtos List<MunicipioDTO>
	* @generated
	*/
	public List<MunicipioDTO> convertirEntidad(List<Municipio> entidades){
		List<MunicipioDTO> dtos=new ArrayList<MunicipioDTO>();
		for(Municipio entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
