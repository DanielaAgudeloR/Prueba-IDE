/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Local;
import modelo.Evaluaciondesempeno;

/**
 *
 * @author Daniela Agudelo®
 */
@Local
public interface EvaluaciondesempenoFacadeLocal {

    void create(Evaluaciondesempeno evaluaciondesempeno);

    void edit(Evaluaciondesempeno evaluaciondesempeno);

    void remove(Evaluaciondesempeno evaluaciondesempeno);

    Evaluaciondesempeno find(Object id);

    List<Evaluaciondesempeno> findAll();

    List<Evaluaciondesempeno> findRange(int[] range);

    int count();
    
}
