package com.kip.sampleunittest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(
        basePackages = "com.kip.sampleunittest",
        entityManagerFactoryRef = "defaultEntityManager",
        transactionManagerRef = "defaultTransactionManager"
)
public class DatabaseConfig {

    @Autowired
    private Environment env;

}
