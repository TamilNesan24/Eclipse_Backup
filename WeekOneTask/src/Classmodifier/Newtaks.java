package Classmodifier;
import java.util.Scanner;

public class Newtaks {
	public static void main(String argv[])
	{
	System.out.println("enter the numbers \n");
	Scanner in = new Scanner(System.in);
	int a=in.nextInt();
	int res=a;
	int b=in.nextInt();
	int i;
	int count=0,temp=0;
	boolean num=true;
	if((b!=1)&&(b>0&&a>=0)&&(a!=b)) {
	
		System.out.println("Prime numbers are:");
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
			System.out.println(a);
			temp++;
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
	if(temp==0)
		System.out.println("No prime number");
	else
    System.out.println("The Total number of Prime numbers between " +res  +" and " +b +" are " +temp); 
  
}
}
