
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import model.servicio.*;

/**
 * Esta clase registra la informacion de las clases que van a ser utilizadas como servicios REST
 * @author vacunas
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(model.servicio.AcudienteServicio.class);
resources.add(model.servicio.AplicacionVacunaServicio.class);
resources.add(model.servicio.AseguradoraServicio.class);
resources.add(model.servicio.BiologicoServicio.class);
resources.add(model.servicio.CargoServicio.class);
resources.add(model.servicio.DepartamentoServicio.class);
resources.add(model.servicio.DosisServicio.class);
resources.add(model.servicio.GeneroServicio.class);
resources.add(model.servicio.GrupoEtnicoServicio.class);
resources.add(model.servicio.IPSServicio.class);
resources.add(model.servicio.MunicipioServicio.class);
resources.add(model.servicio.PacienteServicio.class);
        resources.add(model.servicio.PaisServicio.class);
        resources.add(model.servicio.RegimenServicio.class);
        resources.add(model.servicio.TipoDocumentoServicio.class);
        resources.add(model.servicio.TipoResidenciaServicio.class);
        resources.add(model.servicio.VacunadorServicio.class);
    }
    
}

