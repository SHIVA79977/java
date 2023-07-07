package BEAN;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class NewDao1 {
	@Autowired
	private DataSource source;
	

public void savedata(int id,String name,int age,String qual) {
	
	
	try {
		Connection con=source.getConnection();
		PreparedStatement p=con.prepareStatement(" insert into Person (id,name,age,qual) values(?,?,?,?)");
		p.setInt(1, id);
		p.setString(2, name);
		p.setInt(3, age);
		p.setString(4, qual);
		p.executeUpdate();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
	
	
	

}
