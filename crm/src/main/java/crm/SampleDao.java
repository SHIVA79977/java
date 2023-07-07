package crm;

import org.springframework.beans.factory
.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SampleDao {
	
	@Autowired
private JdbcTemplate template;
	protected void save() {
		
		
		System.out.println("=====================");
		//template.update("insert into Person (id,name,age,qual)values(?,?,?,?)",8,"ram",26,"9th");
	}
	
	
	
}
