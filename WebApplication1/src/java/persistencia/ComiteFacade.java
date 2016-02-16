/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Comite;

/**
 *
 * @author Daniela Agudelo®
 */
@Stateless
public class ComiteFacade extends AbstractFacade<Comite> implements ComiteFacadeLocal {

    @PersistenceContext(unitName = "IDEPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ComiteFacade() {
        super(Comite.class);
    }
    
}
