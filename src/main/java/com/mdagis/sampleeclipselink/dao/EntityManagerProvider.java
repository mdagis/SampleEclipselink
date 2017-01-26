package com.mdagis.sampleeclipselink.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author agis
 */
public class EntityManagerProvider {

    private static EntityManager em;

    private EntityManagerProvider() {
    }

    public static EntityManager getInstance() {
        if (em == null) {
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("myPU");
            em = factory.createEntityManager();
        }
        return em;
    }

}
