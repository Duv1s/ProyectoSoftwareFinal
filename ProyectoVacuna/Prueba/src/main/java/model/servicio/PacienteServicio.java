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
@Path("/Paciente")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PacienteServicio {
	
	@EJB
    private PacienteLogica logica;

	/**
      * retorna una lista con los Paciente que se encuentran en la base de datos
      * @return retorna una lista de PacienteDTO
      * @generated
      */
    @GET
    public List<PacienteDTO> obtenerTodosPacientes(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Paciente
      * @return Paciente del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public PacienteDTO obtenerPaciente(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Paciente
      * @param dto Paciente a guardar
      * @return Paciente con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public PacienteDTO guardarPaciente(PacienteDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Paciente con el identificador dado
     * @param id identificador del Paciente
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarPaciente(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
