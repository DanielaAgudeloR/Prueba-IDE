/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import javax.ejb.Local;
import modelo.Aprendiz;
import modelo.Coordinador;

/**
 *
 * @author Daniela Agudelo®
 */
@Local
public interface sessionLogicaLocal {
    public Aprendiz iniciarSesionAprendiz(Long documento, String clave) throws Exception;
    public Coordinador iniciarSesionCoordinador(Long documento, String clave) throws Exception;
}
