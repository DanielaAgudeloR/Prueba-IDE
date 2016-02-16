/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Local;
import modelo.Controlvehicular;

/**
 *
 * @author Daniela Agudelo®
 */
@Local
public interface ControlvehicularFacadeLocal {

    void create(Controlvehicular controlvehicular);

    void edit(Controlvehicular controlvehicular);

    void remove(Controlvehicular controlvehicular);

    Controlvehicular find(Object id);

    List<Controlvehicular> findAll();

    List<Controlvehicular> findRange(int[] range);

    int count();
    
}
