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
@Path("/AplicacionVacuna")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AplicacionVacunaServicio {
	
	@EJB
    private AplicacionVacunaLogica logica;

	/**
      * retorna una lista con los AplicacionVacuna que se encuentran en la base de datos
      * @return retorna una lista de AplicacionVacunaDTO
      * @generated
      */
    @GET
    public List<AplicacionVacunaDTO> obtenerTodosAplicacionVacunas(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento AplicacionVacuna
      * @return AplicacionVacuna del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public AplicacionVacunaDTO obtenerAplicacionVacuna(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de AplicacionVacuna
      * @param dto AplicacionVacuna a guardar
      * @return AplicacionVacuna con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public AplicacionVacunaDTO guardarAplicacionVacuna(AplicacionVacunaDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro AplicacionVacuna con el identificador dado
     * @param id identificador del AplicacionVacuna
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarAplicacionVacuna(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
