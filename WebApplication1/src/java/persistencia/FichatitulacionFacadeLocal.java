/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Local;
import modelo.Fichatitulacion;

/**
 *
 * @author Daniela Agudelo®
 */
@Local
public interface FichatitulacionFacadeLocal {

    void create(Fichatitulacion fichatitulacion);

    void edit(Fichatitulacion fichatitulacion);

    void remove(Fichatitulacion fichatitulacion);

    Fichatitulacion find(Object id);

    List<Fichatitulacion> findAll();

    List<Fichatitulacion> findRange(int[] range);

    int count();
    
}
