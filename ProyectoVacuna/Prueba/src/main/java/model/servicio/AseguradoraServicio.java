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
@Path("/Aseguradora")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AseguradoraServicio {
	
	@EJB
    private AseguradoraLogica logica;

	/**
      * retorna una lista con los Aseguradora que se encuentran en la base de datos
      * @return retorna una lista de AseguradoraDTO
      * @generated
      */
    @GET
    public List<AseguradoraDTO> obtenerTodosAseguradoras(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Aseguradora
      * @return Aseguradora del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public AseguradoraDTO obtenerAseguradora(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Aseguradora
      * @param dto Aseguradora a guardar
      * @return Aseguradora con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public AseguradoraDTO guardarAseguradora(AseguradoraDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Aseguradora con el identificador dado
     * @param id identificador del Aseguradora
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarAseguradora(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
