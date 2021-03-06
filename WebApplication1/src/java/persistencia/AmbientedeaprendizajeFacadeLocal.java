/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Local;
import modelo.Ambientedeaprendizaje;

/**
 *
 * @author Daniela Agudelo®
 */
@Local
public interface AmbientedeaprendizajeFacadeLocal {

    void create(Ambientedeaprendizaje ambientedeaprendizaje);

    void edit(Ambientedeaprendizaje ambientedeaprendizaje);

    void remove(Ambientedeaprendizaje ambientedeaprendizaje);

    Ambientedeaprendizaje find(Object id);

    List<Ambientedeaprendizaje> findAll();

    List<Ambientedeaprendizaje> findRange(int[] range);

    int count();
    
}
