package com.mdagis.sampleeclipselink.dao;

import com.mdagis.sampleeclipselink.model.Person;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author agis
 */
public class PersonDataService {

    private final EntityManager em;

    public PersonDataService(EntityManager em) {
        this.em = em;
    }

    public void createPerson() {
    
        Person person = new Person("Donald", "Duck");
        em.persist(person);
    }

    public List<Person> findAllPersons() {

        return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();

    }

}
