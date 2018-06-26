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
@Path("/Acudiente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AcudienteServicio {
	
	@EJB
    private AcudienteLogica logica;

	/**
      * retorna una lista con los Acudiente que se encuentran en la base de datos
      * @return retorna una lista de AcudienteDTO
      * @generated
      */
    @GET
    public List<AcudienteDTO> obtenerTodosAcudientes(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Acudiente
      * @return Acudiente del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public AcudienteDTO obtenerAcudiente(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Acudiente
      * @param dto Acudiente a guardar
      * @return Acudiente con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public AcudienteDTO guardarAcudiente(AcudienteDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Acudiente con el identificador dado
     * @param id identificador del Acudiente
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarAcudiente(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
