
package logica;

import javax.ejb.Stateless;
import modelo.Aprendiz;
import modelo.Coordinador;

@Stateless
public class sessionLogica implements sessionLogicaLocal {

    @Override
    public Aprendiz iniciarSesionAprendiz(Long documento, String clave) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Coordinador iniciarSesionCoordinador(Long documento, String clave) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
