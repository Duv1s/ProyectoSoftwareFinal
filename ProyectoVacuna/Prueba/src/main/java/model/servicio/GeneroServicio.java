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
@Path("/Genero")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GeneroServicio {
	
	@EJB
    private GeneroLogica logica;

	/**
      * retorna una lista con los Genero que se encuentran en la base de datos
      * @return retorna una lista de GeneroDTO
      * @generated
      */
    @GET
    public List<GeneroDTO> obtenerTodosGeneros(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Genero
      * @return Genero del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public GeneroDTO obtenerGenero(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Genero
      * @param dto Genero a guardar
      * @return Genero con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public GeneroDTO guardarGenero(GeneroDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Genero con el identificador dado
     * @param id identificador del Genero
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarGenero(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
