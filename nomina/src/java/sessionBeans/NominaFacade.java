/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import modelo.Nomina;

/**
 *
 * @author Dell
 */
@Stateless
public class NominaFacade extends AbstractFacade<Nomina> {
    @PersistenceContext(unitName = "nominaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NominaFacade() {
        super(Nomina.class);
    }
    
}
