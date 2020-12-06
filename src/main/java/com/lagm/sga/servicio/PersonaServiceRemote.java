package com.lagm.sga.servicio;

import com.lagm.sga.domain.Persona;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface PersonaServiceRemote {
    // @Remote: para que podamos acceder a esta infertaz de manera remota

    public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);
}
