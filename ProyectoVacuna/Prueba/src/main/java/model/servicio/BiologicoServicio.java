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
@Path("/Biologico")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BiologicoServicio {
	
	@EJB
    private BiologicoLogica logica;

	/**
      * retorna una lista con los Biologico que se encuentran en la base de datos
      * @return retorna una lista de BiologicoDTO
      * @generated
      */
    @GET
    public List<BiologicoDTO> obtenerTodosBiologicos(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Biologico
      * @return Biologico del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public BiologicoDTO obtenerBiologico(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Biologico
      * @param dto Biologico a guardar
      * @return Biologico con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public BiologicoDTO guardarBiologico(BiologicoDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Biologico con el identificador dado
     * @param id identificador del Biologico
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarBiologico(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
