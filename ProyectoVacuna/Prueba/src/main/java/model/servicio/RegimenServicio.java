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
@Path("/Regimen")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegimenServicio {
	
	@EJB
    private RegimenLogica logica;

	/**
      * retorna una lista con los Regimen que se encuentran en la base de datos
      * @return retorna una lista de RegimenDTO
      * @generated
      */
    @GET
    public List<RegimenDTO> obtenerTodosRegimens(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Regimen
      * @return Regimen del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public RegimenDTO obtenerRegimen(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Regimen
      * @param dto Regimen a guardar
      * @return Regimen con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public RegimenDTO guardarRegimen(RegimenDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Regimen con el identificador dado
     * @param id identificador del Regimen
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarRegimen(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
