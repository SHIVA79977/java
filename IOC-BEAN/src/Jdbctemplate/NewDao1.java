package Jdbctemplate;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class NewDao1 {
	@Autowired
	private JdbcTemplate template;
	
	public String getbyid(int id) {
		
		return template.queryForObject("select name from Person where id=?",String.class,id );
		
	}
	
	public int getcount() {
		
		return template.queryForInt("select count(*) from Person ");
	}

	public Person getperson( int id) {
		Person p= null;
		return p=template.queryForObject("select * from Person where id=?", new BeanPropertyRowMapper<Person>(Person.class),id);
	}
	/*
	 * public ArrayList<Person> getperson( ) { ArrayList<Person> p= null;
	 * p=template.queryForObject("select * from Person ", new
	 * BeanPropertyRowMapper<Person>(Person.class)); return p; }
	 */
}
