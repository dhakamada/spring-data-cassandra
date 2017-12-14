package br.com.cassandra.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

/**
 * @author dhakamada
 * @version $Revision: $<br/>
 * $Id: $
 * @since 12/14/17 7:55 PM
 */
@Configuration
@EnableCassandraRepositories
public class KeyspaceACassandraConfig extends CassandraConfig {

    @Value("${cassandra.keyspace.a}")
    private String keyspace;

    @Override
    public String getKeyspaceName() {
        return keyspace;
    }
}
