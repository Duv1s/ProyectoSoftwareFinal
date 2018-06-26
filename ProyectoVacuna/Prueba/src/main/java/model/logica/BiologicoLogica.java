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
public class BiologicoLogica {
	
	@EJB
    private BiologicoDAO persistencia;


	
	/**
	* Retorna una lista con los Biologico que se encuentran en la base de datos
	* @return retorna una lista de BiologicoDTO
	* @generated
	*/
	public List<BiologicoDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Biologico dado su identificador. 	
	* @param id identificador del elemento Biologico
	* @return Biologico del id dado
	* @generated
	*/
	public BiologicoDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Biologico
	 * @param dto Biologico a guardar
	 * @return Biologico con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public BiologicoDTO guardar(BiologicoDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Biologico con el identificador dado
	 * @param id identificador del Biologico
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Biologico
	 * @param dto Biologico a guardar
	 * @generated
	 */
	public void actualizar(BiologicoDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un BiologicoDTO en la entidad Biologico.  
	* @param dto a convertir
	* @return entidad Biologico
	* @generated
	*/
	public Biologico convertirDTO(BiologicoDTO dto){
		if(dto==null)return null;
		Biologico entidad=new Biologico();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setLote(dto.getLote());
			entidad.setLoteJeringa(dto.getLoteJeringa());
		
			if(dto.getDosis()!=null){
				entidad.setDosis(new Dosis());
				entidad.getDosis().setId(dto.getDosis().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  BiologicoDTO en una lista de Biologico.  
	* @param dtos a convertir
	* @return entidades List<Biologico>
	* @generated
	*/
	public List<Biologico> convertirDTO(List<BiologicoDTO> dtos){
		List<Biologico> entidades=new ArrayList<Biologico>();
		for(BiologicoDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Biologico en un DTO BiologicoDTO.  
	* @param entidad a convertir
	* @return dto BiologicoDTO
	* @generated
	*/
	public BiologicoDTO convertirEntidad(Biologico entidad){
		BiologicoDTO dto=new BiologicoDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
				dto.setLote(entidad.getLote());
				dto.setLoteJeringa(entidad.getLoteJeringa());
		
			if(entidad.getDosis()!=null){
				dto.setDosis(
					new DosisDTO(
						entidad.getDosis().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Biologico en una lista de BiologicoDTO.  
	* @param entidades a convertir
	* @return dtos List<BiologicoDTO>
	* @generated
	*/
	public List<BiologicoDTO> convertirEntidad(List<Biologico> entidades){
		List<BiologicoDTO> dtos=new ArrayList<BiologicoDTO>();
		for(Biologico entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
