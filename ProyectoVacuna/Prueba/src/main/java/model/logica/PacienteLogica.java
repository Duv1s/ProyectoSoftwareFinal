package model.logica;

import model.dto.*;
import model.persistencia.*;
import model.persistencia.entity.*;
import java.util.List;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @generated @author vacunas
 */
@Stateless
public class PacienteLogica {

    @EJB
    private PacienteDAO persistencia;

    private final SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Retorna una lista con los Paciente que se encuentran en la base de datos
     *
     * @return retorna una lista de PacienteDTO
     * @generated
     */
    public List<PacienteDTO> obtenerTodos() {
        return convertirEntidad(persistencia.obtenerTodos());
    }

    /**
     * Obtiene Paciente dado su identificador.
     *
     * @param id identificador del elemento Paciente
     * @return Paciente del id dado
     * @generated
     */
    public PacienteDTO obtener(Long id) {
        return convertirEntidad(persistencia.obtener(id));
    }

    /**
     * Almacena la informacion de Paciente
     *
     * @param dto Paciente a guardar
     * @return Paciente con los cambios realizados por el proceso de guardar
     * @generated
     */
    public PacienteDTO guardar(PacienteDTO dto) {
        return convertirEntidad(persistencia.guardar(convertirDTO(dto)));
    }

    /**
     * Elimina el registro Paciente con el identificador dado
     *
     * @param id identificador del Paciente
     * @generated
     */
    public void borrar(Long id) {
        persistencia.borrar(id);
    }

    /**
     * Actualiza la informacion de Paciente
     *
     * @param dto Paciente a guardar
     * @generated
     */
    public void actualizar(PacienteDTO dto) {
        persistencia.actualizar(convertirDTO(dto));
    }

    /**
     * Convierte un PacienteDTO en la entidad Paciente.
     *
     * @param dto a convertir
     * @return entidad Paciente
     * @generated
     */
    public Paciente convertirDTO(PacienteDTO dto) {
        if (dto == null) {
            return null;
        }
        Paciente entidad = new Paciente();
        entidad.setId(dto.getId());
        entidad.setDesplazado(dto.getDesplazado());
        entidad.setVictimaConflicto(dto.getVictimaConflicto());
        entidad.setDiscapacidad(dto.getDiscapacidad());
        entidad.setGestante(dto.getGestante());
        if (dto.getFechaNacimiento() != null) {
            try {
                entidad.setFechaNacimiento(fecha.parse(dto.getFechaNacimiento()));
            } catch (ParseException ex) {
                throw new RuntimeException("Error al convertir la fecha FechaNacimiento " + dto.getFechaNacimiento());
            }
        }
        entidad.setNumeroIdentificacion(dto.getNumeroIdentificacion());
        entidad.setNombre(dto.getNombre());
        entidad.setApellido(dto.getApellido());
        entidad.setCorreo(dto.getCorreo());
        entidad.setTelefono(dto.getTelefono());

        if (dto.getTipoResidencia() != null) {
            entidad.setTipoResidencia(new TipoResidencia());
            entidad.getTipoResidencia().setId(dto.getTipoResidencia().getId());
        }
//                        entidad.setTipoResidencia(dto.getTipoResidencia());
//                        entidad.setAplicacionVacuna(dto.getAplicacionVacuna());

        if (dto.getTipoDocumento() != null) {
            entidad.setTipoDocumento(new TipoDocumento());
            entidad.getTipoDocumento().setId(dto.getTipoDocumento().getId());
        }
        if (dto.getGenero() != null) {
            entidad.setGenero(new Genero());
            entidad.getGenero().setId(dto.getGenero().getId());
        }
        if (dto.getMunicipio() != null) {
            entidad.setMunicipio(new Municipio());
            entidad.getMunicipio().setId(dto.getMunicipio().getId());
        }

        return entidad;
    }

    /**
     * Convierte una lista de PacienteDTO en una lista de Paciente.
     *
     * @param dtos a convertir
     * @return entidades List<Paciente>
     * @generated
     */
    public List<Paciente> convertirDTO(List<PacienteDTO> dtos) {
        List<Paciente> entidades = new ArrayList<Paciente>();
        for (PacienteDTO dto : dtos) {
            entidades.add(convertirDTO(dto));
        }
        return entidades;
    }

    /**
     * Convierte Paciente en un DTO PacienteDTO.
     *
     * @param entidad a convertir
     * @return dto PacienteDTO
     * @generated
     */
    public PacienteDTO convertirEntidad(Paciente entidad) {
        PacienteDTO dto = new PacienteDTO();
        dto.setId(entidad.getId());
        dto.setDesplazado(entidad.getDesplazado());
        dto.setVictimaConflicto(entidad.getVictimaConflicto());
        dto.setDiscapacidad(entidad.getDiscapacidad());
        dto.setGestante(entidad.getGestante());
        if (entidad.getFechaNacimiento() != null) {
            dto.setFechaNacimiento(fecha.format(entidad.getFechaNacimiento()));
        }
        dto.setNumeroIdentificacion(entidad.getNumeroIdentificacion());
        dto.setNombre(entidad.getNombre());
        dto.setApellido(entidad.getApellido());
        dto.setCorreo(entidad.getCorreo());
        dto.setTelefono(entidad.getTelefono());

        if (entidad.getMunicipio() != null) {
            dto.setMunicipio(
                    new MunicipioDTO(
                            entidad.getMunicipio().getId()));
        }
        if (entidad.getGenero() != null) {
            dto.setGenero(
                    new GeneroDTO(
                            entidad.getGenero().getId()));
        }
        if (entidad.getTipoDocumento() != null) {
            dto.setTipoDocumento(
                    new TipoDocumentoDTO(
                            entidad.getTipoDocumento().getId()));
        }
        
          if (entidad.getTipoResidencia()!= null) {
            dto.setTipoResidencia(
                    new TipoResidenciaDTO(
                            entidad.getTipoResidencia().getId()));
        }

        return dto;
    }

    /**
     * Convierte una lista de Paciente en una lista de PacienteDTO.
     *
     * @param entidades a convertir
     * @return dtos List<PacienteDTO>
     * @generated
     */
    public List<PacienteDTO> convertirEntidad(List<Paciente> entidades) {
        List<PacienteDTO> dtos = new ArrayList<PacienteDTO>();
        for (Paciente entidad : entidades) {
            dtos.add(convertirEntidad(entidad));
        }
        return dtos;
    }

}
