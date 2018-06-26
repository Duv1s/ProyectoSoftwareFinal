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
@Path("/TipoResidencia")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TipoResidenciaServicio {
	
	@EJB
    private TipoResidenciaLogica logica;

	/**
      * retorna una lista con los TipoResidencia que se encuentran en la base de datos
      * @return retorna una lista de TipoResidenciaDTO
      * @generated
      */
    @GET
    public List<TipoResidenciaDTO> obtenerTodosTipoResidencias(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento TipoResidencia
      * @return TipoResidencia del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public TipoResidenciaDTO obtenerTipoResidencia(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de TipoResidencia
      * @param dto TipoResidencia a guardar
      * @return TipoResidencia con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public TipoResidenciaDTO guardarTipoResidencia(TipoResidenciaDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro TipoResidencia con el identificador dado
     * @param id identificador del TipoResidencia
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarTipoResidencia(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
