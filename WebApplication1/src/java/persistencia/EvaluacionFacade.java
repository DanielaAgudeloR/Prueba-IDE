/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Evaluacion;

/**
 *
 * @author Daniela Agudelo®
 */
@Stateless
public class EvaluacionFacade extends AbstractFacade<Evaluacion> implements EvaluacionFacadeLocal {

    @PersistenceContext(unitName = "IDEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EvaluacionFacade() {
        super(Evaluacion.class);
    }
    
}
