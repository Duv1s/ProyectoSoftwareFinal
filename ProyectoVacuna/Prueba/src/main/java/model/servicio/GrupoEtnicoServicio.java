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
@Path("/GrupoEtnico")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class GrupoEtnicoServicio {
	
	@EJB
    private GrupoEtnicoLogica logica;

	/**
      * retorna una lista con los GrupoEtnico que se encuentran en la base de datos
      * @return retorna una lista de GrupoEtnicoDTO
      * @generated
      */
    @GET
    public List<GrupoEtnicoDTO> obtenerTodosGrupoEtnicos(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento GrupoEtnico
      * @return GrupoEtnico del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public GrupoEtnicoDTO obtenerGrupoEtnico(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de GrupoEtnico
      * @param dto GrupoEtnico a guardar
      * @return GrupoEtnico con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public GrupoEtnicoDTO guardarGrupoEtnico(GrupoEtnicoDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro GrupoEtnico con el identificador dado
     * @param id identificador del GrupoEtnico
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarGrupoEtnico(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
