import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class sample {
	
	private int id;
	private String name;
	private int age;
	private String qual;
	
	
	
	 @Override public String toString() { return "sample [id=" + id + ", name=" +
	 name + ", age=" + age + ", qual=" + qual + "]"; }
	 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public static void main(String[] args) {
		
		try {
			
			Class c=Class.forName("com.mysql.cj.jdbc.Driver");
			
		Connection con	=DriverManager.getConnection("jdbc:mysql://localhost:3306/spring", "root", "root");
		PreparedStatement p	=con.prepareStatement(" select * from spring.sample1 ");
		
		ResultSet r=	p.executeQuery();
		
			for(boolean b=r.next();b!=false;b=r.next()) {
				sample s= new sample();
				
				s.setId(r.getInt("id"));	
				s.setName(r.getString("name"));
				s.setAge(r.getInt("age"));
				s.setQual(r.getString("qual"));
				System.out.println(s);
			}	
		} catch (Exception e) {
			System.out.println(e);
		}
			
		
	}
	

}
