package challengequestions;

import java.util.Objects;

public class JavaSort {

    public static void main(String[] args) {
        
    }

}

class Student {
    private Integer id;
    private String name;
	private Float cgpa;
	
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
	public Float getCgpa() {
		return cgpa;
	}
	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}
	public Student(Integer id, String name, Float cgpa) {
		super();
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}
	@Override
	public int hashCode() {
		return Objects.hash(cgpa, id, name);
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
		return Objects.equals(cgpa, other.cgpa) && Objects.equals(id, other.id) && Objects.equals(name, other.name);
	}
	
	
    
    
}
