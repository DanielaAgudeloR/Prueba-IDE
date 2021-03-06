/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.util.List;
import javax.ejb.Local;
import modelo.Funcionario;

/**
 *
 * @author Daniela Agudelo®
 */
@Local
public interface FuncionarioFacadeLocal {

    void create(Funcionario funcionario);

    void edit(Funcionario funcionario);

    void remove(Funcionario funcionario);

    Funcionario find(Object id);

    List<Funcionario> findAll();

    List<Funcionario> findRange(int[] range);

    int count();
    
}
