package me.chrispeng.ibatisresolvetypealias.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "me.chrispeng.ibatisresolvetypealias.dao.business", sqlSessionFactoryRef = "sqlSessionFactoryBean")
public class MybatisConfig {

    @Value("classpath:mybatis/mybatis-configuration.xml")
    private Resource mybatisConfig;

    @Value("classpath:mybatis/mapper/*.xml")
    private Resource[] mappers;

    @Bean
    @Primary
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setConfigLocation(mybatisConfig);
        factoryBean.setMapperLocations(mappers);
        return factoryBean;
    }
}
