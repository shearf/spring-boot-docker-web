package com.shearf.demo.docker.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.bind.RelaxedPropertyResolver;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * Created by xiahaihu2009@gmail on 2017/4/5.
 */
@Configuration
@PropertySource("classpath:database.properties")
public class DatasourceConfiguration implements EnvironmentAware {

    private RelaxedPropertyResolver resolver;

    @Override
    public void setEnvironment(Environment environment) {
        resolver = new RelaxedPropertyResolver(environment, "database.");
    }

    @Bean
    public DataSource dataSource() throws SQLException {

        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(resolver.getProperty("driverClassName"));
        dataSource.setUrl(resolver.getProperty("url"));
        dataSource.setUsername(resolver.getProperty("username"));
        dataSource.setPassword(resolver.getProperty("password"));
        dataSource.setName(resolver.getProperty("name"));

        dataSource.setFilters(resolver.getProperty("filters"));
        dataSource.setMaxActive(Integer.parseInt(resolver.getProperty("maxActive")));
        dataSource.setInitialSize(Integer.parseInt(resolver.getProperty("initialSize")));
        dataSource.setMaxWait(Long.parseLong(resolver.getProperty("maxWait")));
        dataSource.setMinIdle(Integer.parseInt(resolver.getProperty("minIdle")));
        dataSource.setTimeBetweenEvictionRunsMillis(
                Long.parseLong(resolver.getProperty("timeBetweenEvictionRunsMillis")));
        dataSource.setMinEvictableIdleTimeMillis(
                Long.parseLong(resolver.getProperty("minEvictableIdleTimeMillis")));
        dataSource.setValidationQuery(resolver.getProperty("validationQuery"));
        dataSource.setTestOnBorrow(Boolean.parseBoolean(resolver.getProperty("testOnBorrow")));
        dataSource.setTestWhileIdle(Boolean.parseBoolean(resolver.getProperty("testWhileIdle")));
        dataSource.setTestOnReturn(Boolean.parseBoolean(resolver.getProperty("testOnReturn")));
        dataSource.setPoolPreparedStatements(
                Boolean.parseBoolean(resolver.getProperty("poolPreparedStatements")));
        dataSource.setMaxOpenPreparedStatements(
                Integer.parseInt(resolver.getProperty("maxOpenPreparedStatements")));


        return dataSource;
    }
}
