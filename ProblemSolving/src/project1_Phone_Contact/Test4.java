package project1_Phone_Contact;

import java.util.*;

public class Test4 
{
	TreeSet<Long> number=new TreeSet();
	HashMap <Long,Object>mail=new HashMap<Long,Object>(1,10);
	HashMap <Long,Object>address=new HashMap<Long,Object>();
	HashMap <Long,Object>name=new HashMap<Long,Object>();
	HashMap <Long,Object>type=new HashMap<Long,Object>();
	Scanner in=new Scanner(System.in);
	int adddata()
	{
		String s1=new String("");
	       System.out.println("Enter the number");
		  Long num=in.nextLong();
		  s1=num.toString();
		 if(s1.length()!=10) 
		 {
			 System.out.println("Enter a valid number");
		 return 0;
		 }
		 String i1=in.nextLine();
		number.add(num);
		System.out.println("Enter the EmailID");
		String i=in.nextLine();
		mail.put(num, i);
		System.out.println(mail.get(num));
		System.out.println("Enter the Name");
		name.put(num, in.nextLine());
		System.out.println("Enter the Adress");
		address.put(num, in.nextLine());
		System.out.println("Enter the Type");
		type.put(num, in.nextLine());
		return 1;
		
	}
	public static void main(String ar[])
	{
		Test4 run=new Test4();
		int i=0;
    	do{i=run.adddata();}while(i==0);
	}

}
