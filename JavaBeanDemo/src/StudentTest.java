import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentTest {

	public static void main(String[] args) {
		Student s=new Student();

		try{
		ObjectInputStream in=new ObjectInputStream(                              
                      new FileInputStream("test.dat"));
		s=(Student)in.readObject();
		in.close();}
		catch(Exception e){}
		
		System.out.println("Initial Student Details");
		System.out.println("=======================");
		System.out.println("FirstName: "+s.getFirstName());
		System.out.println("LastName:   "+s.getLastName());
		System.out.println("Age:        "+s.getAge());
		System.out.println();
		
		System.out.println("Enter new details");
		String first=Console.readLine("Enter First Name:");
		s.setFirstName(first);
		String last=Console.readLine("Enter Last Name:");
		s.setLastName(last);
		int age=Console.readInt("Enter Age:");
		s.setAge(age);
		
		System.out.println("Updated Student Details");
		System.out.println("=======================");
		System.out.println("FirstName: "+s.getFirstName());
		System.out.println("LastName:   "+s.getLastName());
		System.out.println("Age:        "+s.getAge());
		System.out.println();
		
		try{
			ObjectOutputStream out=new ObjectOutputStream(
					  new FileOutputStream("test.dat"));
			out.writeObject(s);
		    	out.close();}
			catch(Exception e){}
	}




}
