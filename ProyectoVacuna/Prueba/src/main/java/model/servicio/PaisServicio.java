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
@Path("/Pais")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PaisServicio {
	
	@EJB
    private PaisLogica logica;

	/**
      * retorna una lista con los Pais que se encuentran en la base de datos
      * @return retorna una lista de PaisDTO
      * @generated
      */
    @GET
    public List<PaisDTO> obtenerTodosPaiss(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Pais
      * @return Pais del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public PaisDTO obtenerPais(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Pais
      * @param dto Pais a guardar
      * @return Pais con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public PaisDTO guardarPais(PaisDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Pais con el identificador dado
     * @param id identificador del Pais
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarPais(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
