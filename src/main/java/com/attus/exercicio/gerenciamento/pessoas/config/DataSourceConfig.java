package com.attus.exercicio.gerenciamento.pessoas.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

@Configuration
public class DataSourceConfig {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource dataSource() {
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	public JdbcTemplate jt(
			@Qualifier("dataSource") final DataSource ds) {
		return new JdbcTemplate(ds);
	}
	
	@Bean
	public NamedParameterJdbcTemplate npjt(
			@Qualifier("dataSource") final DataSource ds) {
		return new NamedParameterJdbcTemplate(ds);
	}
}
