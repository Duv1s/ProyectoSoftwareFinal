package model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

/**
 * @generated @author vacunas
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PacienteDTO {

    public PacienteDTO() {
        //constructor base
    }

    public PacienteDTO(Long id) {
        this.id = id;
    }

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @generated
     */
    private Boolean desplazado;

    /**
     * @generated
     */
    private Boolean victimaConflicto;

    /**
     * @generated
     */
    private Boolean discapacidad;

    /**
     * @generated
     */
    private Boolean Gestante;

    /**
     * @generated
     */
    private String fechaNacimiento;

    /**
     * @generated
     */
    private String numeroIdentificacion;

    /**
     * @generated
     */
    private String nombre;

    /**
     * @generated
     */
    private String apellido;

    /**
     * @generated
     */
    private String correo;

    /**
     * @generated
     */
    private String telefono;

    /**
     * @generated
     */
    private MunicipioDTO municipio;

    /**
     * @generated
     */
    private TipoDocumentoDTO tipoDocumento;

    /**
     * @generated
     */
    private GeneroDTO genero;

    /**
     * @return @generated
     */
    public Boolean getDesplazado() {
        return this.desplazado;
    }

    /**
     * @generated
     */
    /**
     * @generated
     */
    private AcudienteDTO acudiente;

    /**
     * @generated
     */
    private AseguradoraDTO aseguradora;

    /**
     * @generated
     */
    private TipoResidenciaDTO tipoResidencia;

    public AcudienteDTO getAcudiente() {
        return acudiente;
    }

    public void setAcudiente(AcudienteDTO acudiente) {
        this.acudiente = acudiente;
    }

    public AseguradoraDTO getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(AseguradoraDTO aseguradora) {
        this.aseguradora = aseguradora;
    }

    public TipoResidenciaDTO getTipoResidencia() {
        return tipoResidencia;
    }
    
  
    
    

    public void setTipoResidencia(TipoResidenciaDTO tipoResidencia) {
        this.tipoResidencia = tipoResidencia;
    }

    public GrupoEtnicoDTO getGrupoEtnico() {
        return grupoEtnico;
    }

    public void setGrupoEtnico(GrupoEtnicoDTO grupoEtnico) {
        this.grupoEtnico = grupoEtnico;
    }

    public AplicacionVacunaDTO getAplicacionVacuna() {
        return aplicacionVacuna;
    }

    public void setAplicacionVacuna(AplicacionVacunaDTO aplicacionVacuna) {
        this.aplicacionVacuna = aplicacionVacuna;
    }

    /**
     * @generated
     */
    private GrupoEtnicoDTO grupoEtnico;

    /**
     * @generated
     */
    private AplicacionVacunaDTO aplicacionVacuna;

    /**
     * @param @generated
     */
    public void setDesplazado(Boolean desplazado) {
        this.desplazado = desplazado;
    }

    /**
     * @return @generated
     */
    public Boolean getVictimaConflicto() {
        return this.victimaConflicto;
    }

    /**
     * @param @generated
     */
    public void setVictimaConflicto(Boolean victimaConflicto) {
        this.victimaConflicto = victimaConflicto;
    }

    /**
     * @return @generated
     */
    public Boolean getDiscapacidad() {
        return this.discapacidad;
    }

    /**
     * @param @generated
     */
    public void setDiscapacidad(Boolean discapacidad) {
        this.discapacidad = discapacidad;
    }

    /**
     * @return @generated
     */
    public Boolean getGestante() {
        return this.Gestante;
    }

    /**
     * @param @generated
     */
    public void setGestante(Boolean Gestante) {
        this.Gestante = Gestante;
    }

    /**
     * @return @generated
     */
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    /**
     * @param @generated
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return @generated
     */
    public String getNumeroIdentificacion() {
        return this.numeroIdentificacion;
    }

    /**
     * @param @generated
     */
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    /**
     * @return @generated
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * @param @generated
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return @generated
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * @param @generated
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return @generated
     */
    public String getCorreo() {
        return this.correo;
    }

    /**
     * @param @generated
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return @generated
     */
    public String getTelefono() {
        return this.telefono;
    }

    /**
     * @param @generated
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return @generated
     */
    public TipoDocumentoDTO getTipoDocumento() {
        return this.tipoDocumento;
    }

    /**
     * @param @generated
     */
    public void setTipoDocumento(TipoDocumentoDTO tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    /**
     * @return @generated
     */
    public GeneroDTO getGenero() {
        return this.genero;
    }

    /**
     * @param @generated
     */
    public void setGenero(GeneroDTO genero) {
        this.genero = genero;
    }

    /**
     * @return @generated
     */
    public MunicipioDTO getMunicipio() {
        return this.municipio;
    }

    /**
     * @param @generated
     */
    public void setMunicipio(MunicipioDTO municipio) {
        this.municipio = municipio;
    }
}
