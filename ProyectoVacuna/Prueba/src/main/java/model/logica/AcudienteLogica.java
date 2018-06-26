package model.logica;

import model.dto.*;
import model.persistencia.*;
import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
  *  @generated
  *  @author vacunas
  */
@Stateless
public class AcudienteLogica {
	
	@EJB
    private AcudienteDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* Retorna una lista con los Acudiente que se encuentran en la base de datos
	* @return retorna una lista de AcudienteDTO
	* @generated
	*/
	public List<AcudienteDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Acudiente dado su identificador. 	
	* @param id identificador del elemento Acudiente
	* @return Acudiente del id dado
	* @generated
	*/
	public AcudienteDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Acudiente
	 * @param dto Acudiente a guardar
	 * @return Acudiente con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public AcudienteDTO guardar(AcudienteDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Acudiente con el identificador dado
	 * @param id identificador del Acudiente
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Acudiente
	 * @param dto Acudiente a guardar
	 * @generated
	 */
	public void actualizar(AcudienteDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un AcudienteDTO en la entidad Acudiente.  
	* @param dto a convertir
	* @return entidad Acudiente
	* @generated
	*/
	public Acudiente convertirDTO(AcudienteDTO dto){
		if(dto==null)return null;
		Acudiente entidad=new Acudiente();
		entidad.setId(dto.getId());
			if(dto.getFechaNacimiento()!=null){
				try {
					entidad.setFechaNacimiento(fecha.parse(dto.getFechaNacimiento()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaNacimiento " + dto.getFechaNacimiento());
		        }
			}
			entidad.setNumeroIdentificacion(dto.getNumeroIdentificacion());
			entidad.setNombre(dto.getNombre());
			entidad.setApellido(dto.getApellido());
		
			if(dto.getPaciente()!=null){
				entidad.setPaciente(new Paciente());
				entidad.getPaciente().setId(dto.getPaciente().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  AcudienteDTO en una lista de Acudiente.  
	* @param dtos a convertir
	* @return entidades List<Acudiente>
	* @generated
	*/
	public List<Acudiente> convertirDTO(List<AcudienteDTO> dtos){
		List<Acudiente> entidades=new ArrayList<Acudiente>();
		for(AcudienteDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Acudiente en un DTO AcudienteDTO.  
	* @param entidad a convertir
	* @return dto AcudienteDTO
	* @generated
	*/
	public AcudienteDTO convertirEntidad(Acudiente entidad){
		AcudienteDTO dto=new AcudienteDTO();
		dto.setId(entidad.getId());
				if(entidad.getFechaNacimiento()!=null){
					dto.setFechaNacimiento(fecha.format(entidad.getFechaNacimiento()));
				}
				dto.setNumeroIdentificacion(entidad.getNumeroIdentificacion());
				dto.setNombre(entidad.getNombre());
				dto.setApellido(entidad.getApellido());
		
			if(entidad.getPaciente()!=null){
				dto.setPaciente(
					new PacienteDTO(
						entidad.getPaciente().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Acudiente en una lista de AcudienteDTO.  
	* @param entidades a convertir
	* @return dtos List<AcudienteDTO>
	* @generated
	*/
	public List<AcudienteDTO> convertirEntidad(List<Acudiente> entidades){
		List<AcudienteDTO> dtos=new ArrayList<AcudienteDTO>();
		for(Acudiente entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
