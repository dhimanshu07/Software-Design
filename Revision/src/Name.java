
public class Name {
	
	public String first;
	public String surname;
	
	public String s = "HimanshuDeswal";
	
	
	public Name(String f,String s)
	{
		this.first = f;
		this.surname = s;
	}
	
	public void updateSurname(String s)
	{
		surname = s;
	}
	
	
	public void updateFirst(String f)
	{
		first = f;
	}
	
	
	
	
	public void printFullName()
	{
		System.out.println("Name = "+first+" "+surname);
	}

	public String readFirst() {
		
		return first;
	}

	public String readSurname() {
	
		return surname;
	}
	
	public void UpdateFullName(String s1)
	{
	   int 	index = s1.indexOf(' ');
	   first  = s1.substring(0, index);
	   surname = s1.substring(index+1);
	   
		
	}

	
	

}
