package firstmonth;

import java.util.Scanner;

public class Staircase1 
{
	public static void main(String args[])
	{
		String str="#";
		String nul="";
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int temp=n;
		int count=2;
		int now=1;
		for(int i=0;i<n;i++)
		{
			int k=0;
			while(k<(temp-count))
			{
				System.out.print(nul);
				k++;
			}			
			int print=0;
			while(print<now) 
			{
				System.out.print(str);
			}
			now++;
		}
	}

}
