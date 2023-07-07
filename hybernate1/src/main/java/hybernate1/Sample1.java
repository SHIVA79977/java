package hybernate1;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import jdk.nashorn.internal.ir.annotations.Immutable;
@Immutable
@Entity
public class Sample1 {
@Id
@GeneratedValue
private int id;
private String name;
private int age;
private String qual;

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
	Configuration configuration= new AnnotationConfiguration().configure();
	configuration.addAnnotatedClass(Sample1.class);
	configuration.configure("hibernate.cfg.xml");
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();
	Sample1 sample1= new Sample1();
	//sample1.setId(1);
	sample1.setName("sagar");
	sample1.setAge(24);
	sample1.setQual("bsc");
	session.save(sample1);
	Transaction transaction=session.beginTransaction();
	transaction.commit();
	session.close();
}
}
