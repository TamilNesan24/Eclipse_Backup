package Classmodifier;
import java.util.*;

public class abstracT {
	public static void main(String argv[])
	{
		
	Vector<Integer>v = new Vector<Integer>();
	System.out.println("enter the numbers \n");
	Scanner in = new Scanner(System.in);
	int a=in.nextInt();
	int b=in.nextInt();
	int res =a;
	int count=0;
	int i;
	boolean num=true;
	if((b!=1)&&(b>0&&a>=0)&&(a!=b)) {
		//a=++a;
		for(;num;a++)
	{
		count=0;
		for(i=1;i<=a;i++) 
		{
			if(a%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			v.add(a);
		}
		//a==(b-1);
		if(a>=b)
			num=false;
		}
	}
	
	else {
		System.out.println("Invalid input");
		System.exit(0);
	}
	
	 if(v.size()==0)
		System.out.println("No prime number");
	else {
    System.out.println("The Total number of Prime numbers between "+res +" & " +b +" are: "+v.size()); 
	Iterator<Integer> value = v.iterator();
	System.out.println("The Prime numbers are:");
    while (value.hasNext()) { 
    	System.out.println(value.next()); 
}
	}
}
	
}