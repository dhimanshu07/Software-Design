import java.io.Serializable;

public class Student implements Serializable {
	
	
	public String FirstName;
	public String LastName;
	public int Age;
	
	public Student() {}
	
	

	public String getFirstName() {
		
		return FirstName;
	}

	public String getLastName() {
	
		return LastName;
	}

	public int getAge() {
		
		return Age;
	}


	
	
	public void setFirstName(String first) {
		
		 FirstName = first;
		
		 
		
	}

	public void setLastName(String last) {
		
		LastName = last;
		
		
	}

	public void setAge(int age) {
		
		Age = age;
		
		
	}

}
