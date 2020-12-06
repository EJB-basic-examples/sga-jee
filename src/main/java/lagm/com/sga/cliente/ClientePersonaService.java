package lagm.com.sga.cliente;

import com.lagm.sga.domain.Persona;
import com.lagm.sga.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientePersonaService {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");
        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote)jndi.lookup("java:global/sga-jee/PersonaServiceImpl!com.lagm.sga.servicio.PersonaServiceRemote");
            List<Persona> personas = personaService.listarPersonas();
            
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            
            System.out.println("\nFin de la llamada al EJB desde el cliente");
            
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
        
    }
}
