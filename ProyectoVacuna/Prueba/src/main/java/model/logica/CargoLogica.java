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
public class CargoLogica {
	
	@EJB
    private CargoDAO persistencia;


	
	/**
	* Retorna una lista con los Cargo que se encuentran en la base de datos
	* @return retorna una lista de CargoDTO
	* @generated
	*/
	public List<CargoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Cargo dado su identificador. 	
	* @param id identificador del elemento Cargo
	* @return Cargo del id dado
	* @generated
	*/
	public CargoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Cargo
	 * @param dto Cargo a guardar
	 * @return Cargo con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public CargoDTO guardar(CargoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Cargo con el identificador dado
	 * @param id identificador del Cargo
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Cargo
	 * @param dto Cargo a guardar
	 * @generated
	 */
	public void actualizar(CargoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un CargoDTO en la entidad Cargo.  
	* @param dto a convertir
	* @return entidad Cargo
	* @generated
	*/
	public Cargo convertirDTO(CargoDTO dto){
		if(dto==null)return null;
		Cargo entidad=new Cargo();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
		
			if(dto.getVacunador()!=null){
				entidad.setVacunador(new Vacunador());
				entidad.getVacunador().setId(dto.getVacunador().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  CargoDTO en una lista de Cargo.  
	* @param dtos a convertir
	* @return entidades List<Cargo>
	* @generated
	*/
	public List<Cargo> convertirDTO(List<CargoDTO> dtos){
		List<Cargo> entidades=new ArrayList<Cargo>();
		for(CargoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Cargo en un DTO CargoDTO.  
	* @param entidad a convertir
	* @return dto CargoDTO
	* @generated
	*/
	public CargoDTO convertirEntidad(Cargo entidad){
		CargoDTO dto=new CargoDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
		
			if(entidad.getVacunador()!=null){
				dto.setVacunador(
					new VacunadorDTO(
						entidad.getVacunador().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Cargo en una lista de CargoDTO.  
	* @param entidades a convertir
	* @return dtos List<CargoDTO>
	* @generated
	*/
	public List<CargoDTO> convertirEntidad(List<Cargo> entidades){
		List<CargoDTO> dtos=new ArrayList<CargoDTO>();
		for(Cargo entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
