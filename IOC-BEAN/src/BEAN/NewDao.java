package BEAN;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class NewDao {
	@Autowired
	private DataSource ds;
	
	public String getbyname(Integer id) {
		String s= null;
		
		try {
			Connection con=ds.getConnection();
			PreparedStatement p=con.prepareStatement(" select pname from Person where pid=? ");
			p.setInt(id, 1);
			ResultSet r=p.executeQuery();
		while(r.next()) {
			s=r.getString("pname");
			
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return s;
		
	}
	

}
