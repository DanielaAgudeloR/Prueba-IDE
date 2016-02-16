/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Local;
import modelo.Idioma;

/**
 *
 * @author Daniela Agudelo®
 */
@Local
public interface IdiomaFacadeLocal {

    void create(Idioma idioma);

    void edit(Idioma idioma);

    void remove(Idioma idioma);

    Idioma find(Object id);

    List<Idioma> findAll();

    List<Idioma> findRange(int[] range);

    int count();
    
}
