package Jdbctemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class NewDao2 {
	@Autowired
	 private JdbcTemplate template;
	
	public void save(int id,String name,int age,String qual) {
		template.update("insert into Person (id ,name,age,qual) values(?,?,?,?)",id,name,age,qual);
		
	}

}
