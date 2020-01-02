package firstmonth;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class TotalName 
{
	static int count;
	String name1;
	void add(String name1)
	{
		Vector<String> v = new Vector<String>();
		v.add(name1);
		count++;
		
Iterator<String> value = v.iterator();
System.out.println("numbers are:");
while (value.hasNext()) 
{ 
	System.out.println(value.next()); 
}
	}
	
	public static void main(String args[])
	{
		int test=0;
		Scanner intg = new Scanner(System.in);
		TotalName obj =new TotalName();
		while(test==0) 
		{
		System.out.println("Enter the name input");
		String name=intg.nextLine();
		
		obj.add(name);
		test=intg.nextInt();
	}
		System.out.println(count);

		
	}

}
