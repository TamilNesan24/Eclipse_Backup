package firstmonth;

import java.util.Scanner;

public class CountCheck {
	
	
	public static void main(String args[])
	{
		String s="absaba gfdsffg jhghghujol ";
		char c[]=s.toCharArray();
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value to be checked:");
		char ch=sc.next().charAt(0);
	for(int i=0;i<c.length;i++)
	{
		char index='a';
		if(c[i]==ch)
		{
			count ++;
		}
		index++;

	}
	System.out.println(count);
	}


}
