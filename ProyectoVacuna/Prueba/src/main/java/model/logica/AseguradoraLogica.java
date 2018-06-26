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
public class AseguradoraLogica {
	
	@EJB
    private AseguradoraDAO persistencia;


	
	/**
	* Retorna una lista con los Aseguradora que se encuentran en la base de datos
	* @return retorna una lista de AseguradoraDTO
	* @generated
	*/
	public List<AseguradoraDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Aseguradora dado su identificador. 	
	* @param id identificador del elemento Aseguradora
	* @return Aseguradora del id dado
	* @generated
	*/
	public AseguradoraDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Aseguradora
	 * @param dto Aseguradora a guardar
	 * @return Aseguradora con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public AseguradoraDTO guardar(AseguradoraDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Aseguradora con el identificador dado
	 * @param id identificador del Aseguradora
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Aseguradora
	 * @param dto Aseguradora a guardar
	 * @generated
	 */
	public void actualizar(AseguradoraDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un AseguradoraDTO en la entidad Aseguradora.  
	* @param dto a convertir
	* @return entidad Aseguradora
	* @generated
	*/
	public Aseguradora convertirDTO(AseguradoraDTO dto){
		if(dto==null)return null;
		Aseguradora entidad=new Aseguradora();
		entidad.setId(dto.getId());
			entidad.setNomre(dto.getNomre());
		
			if(dto.getPaciente()!=null){
				entidad.setPaciente(new Paciente());
				entidad.getPaciente().setId(dto.getPaciente().getId());
			}
			if(dto.getRegimen()!=null){
				entidad.setRegimen(new Regimen());
				entidad.getRegimen().setId(dto.getRegimen().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  AseguradoraDTO en una lista de Aseguradora.  
	* @param dtos a convertir
	* @return entidades List<Aseguradora>
	* @generated
	*/
	public List<Aseguradora> convertirDTO(List<AseguradoraDTO> dtos){
		List<Aseguradora> entidades=new ArrayList<Aseguradora>();
		for(AseguradoraDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Aseguradora en un DTO AseguradoraDTO.  
	* @param entidad a convertir
	* @return dto AseguradoraDTO
	* @generated
	*/
	public AseguradoraDTO convertirEntidad(Aseguradora entidad){
		AseguradoraDTO dto=new AseguradoraDTO();
		dto.setId(entidad.getId());
				dto.setNomre(entidad.getNomre());
		
			if(entidad.getRegimen()!=null){
				dto.setRegimen(
					new RegimenDTO(
						entidad.getRegimen().getId()));
			}
			if(entidad.getPaciente()!=null){
				dto.setPaciente(
					new PacienteDTO(
						entidad.getPaciente().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Aseguradora en una lista de AseguradoraDTO.  
	* @param entidades a convertir
	* @return dtos List<AseguradoraDTO>
	* @generated
	*/
	public List<AseguradoraDTO> convertirEntidad(List<Aseguradora> entidades){
		List<AseguradoraDTO> dtos=new ArrayList<AseguradoraDTO>();
		for(Aseguradora entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
