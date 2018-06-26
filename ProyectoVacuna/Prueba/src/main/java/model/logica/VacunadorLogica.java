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
public class VacunadorLogica {
	
	@EJB
    private VacunadorDAO persistencia;

	private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

	
	/**
	* Retorna una lista con los Vacunador que se encuentran en la base de datos
	* @return retorna una lista de VacunadorDTO
	* @generated
	*/
	public List<VacunadorDTO> obtenerTodos(){
		return convertirEntidad(persistencia.obtenerTodos());
	}
	
	/**
	* Obtiene Vacunador dado su identificador. 	
	* @param id identificador del elemento Vacunador
	* @return Vacunador del id dado
	* @generated
	*/
	public VacunadorDTO obtener(Long id){
		return convertirEntidad(persistencia.obtener(id));
	}
	
	
	/**
	 * Almacena la informacion de Vacunador
	 * @param dto Vacunador a guardar
	 * @return Vacunador con los cambios realizados por el proceso de guardar
	 * @generated
	 */
	public VacunadorDTO guardar(VacunadorDTO dto){
		return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
	}
	
	
	/**
	 * Elimina el registro Vacunador con el identificador dado
	 * @param id identificador del Vacunador
	 * @generated 
	 */
	public void borrar(Long id){
		persistencia.borrar(id);
	}
	
	
	/**
	 * Actualiza la informacion de Vacunador
	 * @param dto Vacunador a guardar
	 * @generated
	 */
	public void actualizar(VacunadorDTO dto){
		persistencia.actualizar(convertirDTO(dto));
	}
	
	
	/**
	* Convierte un VacunadorDTO en la entidad Vacunador.  
	* @param dto a convertir
	* @return entidad Vacunador
	* @generated
	*/
	public Vacunador convertirDTO(VacunadorDTO dto){
		if(dto==null)return null;
		Vacunador entidad=new Vacunador();
		entidad.setId(dto.getId());
			entidad.setApellido(dto.getApellido());
			entidad.setNombre(dto.getNombre());
			entidad.setNumeroIdentificacion(dto.getNumeroIdentificacion());
			if(dto.getFechaNacimiento()!=null){
				try {
					entidad.setFechaNacimiento(fecha.parse(dto.getFechaNacimiento()));
				} catch (ParseException ex) {
		            throw new RuntimeException("Error al convertir la fecha FechaNacimiento " + dto.getFechaNacimiento());
		        }
			}
			entidad.setDireccion(dto.getDireccion());
			entidad.setTelefono(dto.getTelefono());
			entidad.setCorreo(dto.getCorreo());
		
			if(dto.getAplicacionVacuna()!=null){
				entidad.setAplicacionVacuna(new AplicacionVacuna());
				entidad.getAplicacionVacuna().setId(dto.getAplicacionVacuna().getId());
			}
			if(dto.getTipoDocumento()!=null){
				entidad.setTipoDocumento(new TipoDocumento());
				entidad.getTipoDocumento().setId(dto.getTipoDocumento().getId());
			}
			if(dto.getGenero()!=null){
				entidad.setGenero(new Genero());
				entidad.getGenero().setId(dto.getGenero().getId());
			}
			if(dto.getCargo()!=null){
				entidad.setCargo(new Cargo());
				entidad.getCargo().setId(dto.getCargo().getId());
			}
			if(dto.getIPS()!=null){
				entidad.setIPS(new IPS());
				entidad.getIPS().setId(dto.getIPS().getId());
			}
		
		return entidad;
	}
	
	
	/**
	* Convierte una lista de  VacunadorDTO en una lista de Vacunador.  
	* @param dtos a convertir
	* @return entidades List<Vacunador>
	* @generated
	*/
	public List<Vacunador> convertirDTO(List<VacunadorDTO> dtos){
		List<Vacunador> entidades=new ArrayList<Vacunador>();
		for(VacunadorDTO dto:dtos){
			entidades.add(convertirDTO(dto));
		}
		return entidades;
	}
	
	
	/**
	* Convierte Vacunador en un DTO VacunadorDTO.  
	* @param entidad a convertir
	* @return dto VacunadorDTO
	* @generated
	*/
	public VacunadorDTO convertirEntidad(Vacunador entidad){
		VacunadorDTO dto=new VacunadorDTO();
		dto.setId(entidad.getId());
				dto.setApellido(entidad.getApellido());
				dto.setNombre(entidad.getNombre());
				dto.setNumeroIdentificacion(entidad.getNumeroIdentificacion());
				if(entidad.getFechaNacimiento()!=null){
					dto.setFechaNacimiento(fecha.format(entidad.getFechaNacimiento()));
				}
				dto.setDireccion(entidad.getDireccion());
				dto.setTelefono(entidad.getTelefono());
				dto.setCorreo(entidad.getCorreo());
		
			if(entidad.getIPS()!=null){
				dto.setIPS(
					new IPSDTO(
						entidad.getIPS().getId()));
			}
			if(entidad.getCargo()!=null){
				dto.setCargo(
					new CargoDTO(
						entidad.getCargo().getId()));
			}
			if(entidad.getGenero()!=null){
				dto.setGenero(
					new GeneroDTO(
						entidad.getGenero().getId()));
			}
			if(entidad.getTipoDocumento()!=null){
				dto.setTipoDocumento(
					new TipoDocumentoDTO(
						entidad.getTipoDocumento().getId()));
			}
			if(entidad.getAplicacionVacuna()!=null){
				dto.setAplicacionVacuna(
					new AplicacionVacunaDTO(
						entidad.getAplicacionVacuna().getId()));
			}
		
		return dto;
	}
	
	
	/**
	* Convierte una lista de Vacunador en una lista de VacunadorDTO.  
	* @param entidades a convertir
	* @return dtos List<VacunadorDTO>
	* @generated
	*/
	public List<VacunadorDTO> convertirEntidad(List<Vacunador> entidades){
		List<VacunadorDTO> dtos=new ArrayList<VacunadorDTO>();
		for(Vacunador entidad:entidades){
			dtos.add(convertirEntidad(entidad));
		}
		return dtos;
	}
	
	
}
