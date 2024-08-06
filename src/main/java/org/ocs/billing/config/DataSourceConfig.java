package org.ocs.billing.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableJpaRepositories(basePackages="org.ocs.billing.repository")
public class DataSourceConfig {
    private final String PACKAGE_SCAN = "org.ocs.billing.entity";

    @Primary
    @Bean(name = "billingDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari")
    public DataSource sdpDataSource()
    {
        return DataSourceBuilder.create().type(HikariDataSource.class).build();
    }

    @Primary
    @Bean(name="billingEntityManagerFactory")
    public LocalContainerEntityManagerFactoryBean pushbcEntityManagerFactory() {
        LocalContainerEntityManagerFactoryBean em
                = new LocalContainerEntityManagerFactoryBean();
        em.setDataSource(sdpDataSource());
        em.setPackagesToScan(PACKAGE_SCAN);
        HibernateJpaVendorAdapter vendorAdapter
                = new HibernateJpaVendorAdapter();
        em.setJpaVendorAdapter(vendorAdapter);
        em.setJpaProperties(hibernateProperties());
        return em;
    }

    @Primary
    @Bean(name = "billingTransactionManager")
    public PlatformTransactionManager pushbcTransactionManager() {
        JpaTransactionManager transactionManager
                = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(
                pushbcEntityManagerFactory().getObject());
        return transactionManager;
    }


    private Properties hibernateProperties()
    {
        Properties properties = new Properties();
        properties.put("hibernate.show_sql", false);
        properties.put("hibernate.format_sql", true);
        //properties.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        properties.put("hibernate.id.new_generator_mappings", false);
        properties.put("hibernate.jdbc.lob.non_contextual_creation", true);
        return properties;
    }
}
