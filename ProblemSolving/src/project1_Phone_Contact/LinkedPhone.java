package project1_Phone_Contact;

import java.util.*;

public class LinkedPhone 
{
	
	TreeMap<Long,LinkedList> contact=new TreeMap();
	int add_Data()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		Long num=in.nextLong();
		String check=num.toString();
		LinkedList details=new LinkedList();
		if(check.length()!=10)
		{
			System.out.println("Enter valid number");
			return 0;
		}
		if(!contact.containsKey(num))
		{
			
			Scanner in1=new Scanner(System.in);
			 System.out.println("Enter the email");
			 details.add(in1.nextLine());
			 System.out.println("Enter the name");
			 details.add(in1.nextLine());
			 System.out.println("Enter the adress");
			 details.add(in1.nextLine());
			 System.out.println("Enter the type");
			 details.add(in1.nextLine());
			 contact.put(num, details);
			
			 }
		else {
			System.out.println("Number already existed please enter a new one");
			return 0;}
		 System.out.println("Enter 1 to add more Contact and other keys to stop");
		 int stop=in.nextInt();
		 
		 int temp;
			if(stop==1)
				{
				return 0;}
			else
				return 1;
			

}
	void display() {
		 int count=0;
		System.out.print("No.");
       System.out.format("%6s"," ");
       System.out.format("%-20s", "Phone Number");
       System.out.format("%-20s", "Name");
       System.out.format("%-20s", "Email");
       System.out.format("%-20s", "Address");
       System.out.format("%-20s", "Type");
       System.out.println();
       //Map.Entry<K, V>
       for(Map.Entry m:contact.entrySet())
 	  {
    	   LinkedList list=(LinkedList) m.getValue();
    	   System.out.print(++count);
           System.out.format("%6s"," ");
           System.out.format("%-20s",m.getKey());
           
    	   for(int i=0;i<4;i++)
    	   {
    		   System.out.format("%-20s",list.get(i));
    	   }
           System.out.println();

 	  }
 	  }
	public static void main(String ar[])
	{
		LinkedPhone ad=new LinkedPhone();
		 int i=0;
		 do{i=ad.add_Data();}while(i==0);
	    	ad.display();
		
	}

}
