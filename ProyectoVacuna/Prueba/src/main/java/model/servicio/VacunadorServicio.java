package model.servicio;

import model.dto.*;
import model.logica.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.*;
import javax.ws.rs.core.*;

/**
 *  @author vacunas
 *  @generated
 */
@Stateless
@Path("/Vacunador")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class VacunadorServicio {
	
	@EJB
    private VacunadorLogica logica;

	/**
      * retorna una lista con los Vacunador que se encuentran en la base de datos
      * @return retorna una lista de VacunadorDTO
      * @generated
      */
    @GET
    public List<VacunadorDTO> obtenerTodosVacunadors(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Vacunador
      * @return Vacunador del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public VacunadorDTO obtenerVacunador(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Vacunador
      * @param dto Vacunador a guardar
      * @return Vacunador con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public VacunadorDTO guardarVacunador(VacunadorDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Vacunador con el identificador dado
     * @param id identificador del Vacunador
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarVacunador(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
