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
@Path("/IPS")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class IPSServicio {
	
	@EJB
    private IPSLogica logica;

	/**
      * retorna una lista con los IPS que se encuentran en la base de datos
      * @return retorna una lista de IPSDTO
      * @generated
      */
    @GET
    public List<IPSDTO> obtenerTodosIPSs(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento IPS
      * @return IPS del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public IPSDTO obtenerIPS(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de IPS
      * @param dto IPS a guardar
      * @return IPS con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public IPSDTO guardarIPS(IPSDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro IPS con el identificador dado
     * @param id identificador del IPS
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarIPS(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
