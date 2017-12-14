package br.com.cassandra.repository;

import java.util.List;

import br.com.cassandra.model.Person;
import br.com.cassandra.model.PersonKey;
import org.springframework.data.cassandra.repository.CassandraRepository;

/**
 * @author dhakamada
 * @version $Revision: $<br/>
 * $Id: $
 * @since 12/14/17 7:56 PM
 */
public interface PersonRepository extends CassandraRepository<Person, PersonKey> {

    List<Person> findByKeyFirstName(final String firstName);
}