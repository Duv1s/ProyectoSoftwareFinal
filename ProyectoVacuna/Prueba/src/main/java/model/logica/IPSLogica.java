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
public class IPSLogica {
	
	@EJB
    private IPSDAO persistencia;


	
	/**
	* Retorna una lista con los IPS que se encuentran en la base de datos
	* @return retorna una lista de IPSDTO
	* @generated
	*/
	public List<IPSDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene IPS dado su identificador. 	
	* @param id identificador del elemento IPS
	* @return IPS del id dado
	* @generated
	*/
	public IPSDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de IPS
	 * @param dto IPS a guardar
	 * @return IPS con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public IPSDTO guardar(IPSDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro IPS con el identificador dado
	 * @param id identificador del IPS
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de IPS
	 * @param dto IPS a guardar
	 * @generated
	 */
	public void actualizar(IPSDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un IPSDTO en la entidad IPS.  
	* @param dto a convertir
	* @return entidad IPS
	* @generated
	*/
	public IPS convertirDTO(IPSDTO dto){
		if(dto==null)return null;
		IPS entidad=new IPS();
		entidad.setId(dto.getId());
			entidad.setNombre(dto.getNombre());
			entidad.setDireccion(dto.getDireccion());
		
			if(dto.getAplicacionVacuna()!=null){
				entidad.setAplicacionVacuna(new AplicacionVacuna());
				entidad.getAplicacionVacuna().setId(dto.getAplicacionVacuna().getId());
			}
			if(dto.getMunicipio()!=null){
				entidad.setMunicipio(new Municipio());
				entidad.getMunicipio().setId(dto.getMunicipio().getId());
			}
			if(dto.getVacunador()!=null){
				entidad.setVacunador(new Vacunador());
				entidad.getVacunador().setId(dto.getVacunador().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  IPSDTO en una lista de IPS.  
	* @param dtos a convertir
	* @return entidades List<IPS>
	* @generated
	*/
	public List<IPS> convertirDTO(List<IPSDTO> dtos){
		List<IPS> entidades=new ArrayList<IPS>();
		for(IPSDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte IPS en un DTO IPSDTO.  
	* @param entidad a convertir
	* @return dto IPSDTO
	* @generated
	*/
	public IPSDTO convertirEntidad(IPS entidad){
		IPSDTO dto=new IPSDTO();
		dto.setId(entidad.getId());
				dto.setNombre(entidad.getNombre());
				dto.setDireccion(entidad.getDireccion());
		
			if(entidad.getMunicipio()!=null){
				dto.setMunicipio(
					new MunicipioDTO(
						entidad.getMunicipio().getId()));
			}
			if(entidad.getVacunador()!=null){
				dto.setVacunador(
					new VacunadorDTO(
						entidad.getVacunador().getId()));
			}
			if(entidad.getAplicacionVacuna()!=null){
				dto.setAplicacionVacuna(
					new AplicacionVacunaDTO(
						entidad.getAplicacionVacuna().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de IPS en una lista de IPSDTO.  
	* @param entidades a convertir
	* @return dtos List<IPSDTO>
	* @generated
	*/
	public List<IPSDTO> convertirEntidad(List<IPS> entidades){
		List<IPSDTO> dtos=new ArrayList<IPSDTO>();
		for(IPS entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
