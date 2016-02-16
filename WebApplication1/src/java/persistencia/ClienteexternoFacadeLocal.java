/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Local;
import modelo.Clienteexterno;

/**
 *
 * @author Daniela Agudelo®
 */
@Local
public interface ClienteexternoFacadeLocal {

    void create(Clienteexterno clienteexterno);

    void edit(Clienteexterno clienteexterno);

    void remove(Clienteexterno clienteexterno);

    Clienteexterno find(Object id);

    List<Clienteexterno> findAll();

    List<Clienteexterno> findRange(int[] range);

    int count();
    
}
