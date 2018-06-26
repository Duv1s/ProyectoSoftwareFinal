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
public class AplicacionVacunaLogica {
	
	@EJB
    private AplicacionVacunaDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* Retorna una lista con los AplicacionVacuna que se encuentran en la base de datos
	* @return retorna una lista de AplicacionVacunaDTO
	* @generated
	*/
	public List<AplicacionVacunaDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene AplicacionVacuna dado su identificador. 	
	* @param id identificador del elemento AplicacionVacuna
	* @return AplicacionVacuna del id dado
	* @generated
	*/
	public AplicacionVacunaDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de AplicacionVacuna
	 * @param dto AplicacionVacuna a guardar
	 * @return AplicacionVacuna con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public AplicacionVacunaDTO guardar(AplicacionVacunaDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro AplicacionVacuna con el identificador dado
	 * @param id identificador del AplicacionVacuna
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de AplicacionVacuna
	 * @param dto AplicacionVacuna a guardar
	 * @generated
	 */
	public void actualizar(AplicacionVacunaDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un AplicacionVacunaDTO en la entidad AplicacionVacuna.  
	* @param dto a convertir
	* @return entidad AplicacionVacuna
	* @generated
	*/
	public AplicacionVacuna convertirDTO(AplicacionVacunaDTO dto){
		if(dto==null)return null;
		AplicacionVacuna entidad=new AplicacionVacuna();
		entidad.setId(dto.getId());
			if(dto.getFecha()!=null){
				try {
					entidad.setFecha(fecha.parse(dto.getFecha()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha Fecha " + dto.getFecha());
		        }
			}
		
			if(dto.getIPS()!=null){
				entidad.setIPS(new IPS());
				entidad.getIPS().setId(dto.getIPS().getId());
			}
			if(dto.getDosis()!=null){
				entidad.setDosis(new Dosis());
				entidad.getDosis().setId(dto.getDosis().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  AplicacionVacunaDTO en una lista de AplicacionVacuna.  
	* @param dtos a convertir
	* @return entidades List<AplicacionVacuna>
	* @generated
	*/
	public List<AplicacionVacuna> convertirDTO(List<AplicacionVacunaDTO> dtos){
		List<AplicacionVacuna> entidades=new ArrayList<AplicacionVacuna>();
		for(AplicacionVacunaDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte AplicacionVacuna en un DTO AplicacionVacunaDTO.  
	* @param entidad a convertir
	* @return dto AplicacionVacunaDTO
	* @generated
	*/
	public AplicacionVacunaDTO convertirEntidad(AplicacionVacuna entidad){
		AplicacionVacunaDTO dto=new AplicacionVacunaDTO();
		dto.setId(entidad.getId());
				if(entidad.getFecha()!=null){
					dto.setFecha(fecha.format(entidad.getFecha()));
				}
		
			if(entidad.getDosis()!=null){
				dto.setDosis(
					new DosisDTO(
						entidad.getDosis().getId()));
			}
			if(entidad.getIPS()!=null){
				dto.setIPS(
					new IPSDTO(
						entidad.getIPS().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de AplicacionVacuna en una lista de AplicacionVacunaDTO.  
	* @param entidades a convertir
	* @return dtos List<AplicacionVacunaDTO>
	* @generated
	*/
	public List<AplicacionVacunaDTO> convertirEntidad(List<AplicacionVacuna> entidades){
		List<AplicacionVacunaDTO> dtos=new ArrayList<AplicacionVacunaDTO>();
		for(AplicacionVacuna entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
