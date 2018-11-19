import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream;

public class TownTest {

	public static void main(String[] args) {
		Town t=new Town();

		try{
		ObjectInputStream in=new ObjectInputStream(                              
                      new FileInputStream("test1.dat"));
		t=(Town)in.readObject();
		in.close();}
		catch(Exception e){}
		
		System.out.println("Initial Town Details");
		System.out.println("=======================");
		System.out.println("Name:      "+t.getName());
		System.out.println("Population:"+t.getPopulation());
		System.out.println();
		
		System.out.println("Enter new details");
		String first=Console.readLine("Enter Name:");
		t.setName(first);
		int pop=Console.readInt("Enter Population:");
		t.setPopulation(pop);
		
		System.out.println("Updated Town Details");
		System.out.println("=======================");
		System.out.println("Name:      "+t.getName());
		System.out.println("Population:"+t.getPopulation());
		System.out.println();
		
		try{
			ObjectOutputStream out=new ObjectOutputStream(
					  new FileOutputStream("test1.dat"));
			out.writeObject(t);
		    	out.close();}
			catch(Exception e){}
	}




}
