package com.mdagis.sampleeclipselink.dao;

import com.mdagis.sampleeclipselink.NameCreator;
import com.mdagis.sampleeclipselink.model.Person;
import java.util.List;
import javax.persistence.EntityManager;
import org.kohsuke.randname.RandomNameGenerator;

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
    
        Person person = new Person(NameCreator.createRandomName(), NameCreator.createRandomName());
        em.persist(person);
    }

    public List<Person> findAllPersons() {

        return em.createQuery("SELECT p FROM Person p", Person.class).getResultList();

    }

}
