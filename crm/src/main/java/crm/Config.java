package crm;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan("crm")
public class Config {
	
	@Bean
	public DataSource dataSource() {
		BasicDataSource b= new BasicDataSource();
		b.setUrl("jdbc:mysql://localhost:3306/springdata");
		b.setUsername("root");
		b.setPassword("root");
		b.setDriverClassName("com.mysql.cj.jdbc.Driver");
		return b;	
	}
@Bean
public JdbcTemplate jdbcTemplate() {
	JdbcTemplate n= new JdbcTemplate(dataSource());
	return n;
}
}

