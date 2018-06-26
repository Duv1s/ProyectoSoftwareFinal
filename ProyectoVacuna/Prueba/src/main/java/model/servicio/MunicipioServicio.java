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
@Path("/Municipio")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class MunicipioServicio {
	
	@EJB
    private MunicipioLogica logica;

	/**
      * retorna una lista con los Municipio que se encuentran en la base de datos
      * @return retorna una lista de MunicipioDTO
      * @generated
      */
    @GET
    public List<MunicipioDTO> obtenerTodosMunicipios(){
	    return logica.obtenerTodos();
    }
    
    /**
      * @param id identificador del elemento Municipio
      * @return Municipio del id dado
      * @generated
      */
    @GET
    @Path("/{id}")
    public MunicipioDTO obtenerMunicipio(@PathParam("id") Long id){
	    return logica.obtener(id);
    }
    
    /**
      * almacena la informacion de Municipio
      * @param dto Municipio a guardar
      * @return Municipio con los cambios realizados por el proceso de guardar
      * @generated
      */
    @POST
    public MunicipioDTO guardarMunicipio(MunicipioDTO dto){
        if(dto.getId()!=null){
            logica.actualizar(dto);
            return dto;
        }else{
            return logica.guardar(dto);
        }
    }
	
	/**
     * elimina el registro Municipio con el identificador dado
     * @param id identificador del Municipio
     * @generated 
     */
    @DELETE
    @Path("/{id}")
    public void borrarMunicipio(@PathParam("id") Long id){
    	logica.borrar(id);
    }
	
}
