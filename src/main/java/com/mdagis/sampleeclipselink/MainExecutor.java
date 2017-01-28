package com.mdagis.sampleeclipselink;

import com.mdagis.sampleeclipselink.dao.EntityManagerProvider;
import com.mdagis.sampleeclipselink.dao.PersonDataService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author agis
 */
public class MainExecutor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        EntityManager manager = EntityManagerProvider.getInstance();
        EntityTransaction tx = manager.getTransaction();
        PersonDataService pds = new PersonDataService(manager);
        
        tx.begin();
        pds.createPerson();
        tx.commit();

        pds.findAllPersons().stream().forEach(System.out::println);        
    }
    
}
