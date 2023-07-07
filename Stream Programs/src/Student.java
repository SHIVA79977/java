import java.util.Comparator;

public class Student implements Comparator<Student> {
	
	private Integer id;
	private String name;
	private Integer age;
	private String qual;
	private Double marks;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getQual() {
		return qual;
	}
	public void setQual(String qual) {
		this.qual = qual;
	}
	public Double getMarks() {
		return marks;
	}
	public void setMarks(Double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", qual=" + qual + ", marks=" + marks + "]";
	}
	public Student(Integer id, String name, Integer age, String qual, Double marks) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qual = qual;
		this.marks = marks;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((marks == null) ? 0 : marks.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qual == null) ? 0 : qual.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (marks == null) {
			if (other.marks != null)
				return false;
		} else if (!marks.equals(other.marks))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qual == null) {
			if (other.qual != null)
				return false;
		} else if (!qual.equals(other.qual))
			return false;
		return true;
	}
	
	
	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.getMarks().compareTo(o2.getMarks());
	}
	
		
	
	
}
