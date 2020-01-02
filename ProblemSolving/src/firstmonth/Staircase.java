package firstmonth;

import java.util.Scanner;

public class Staircase 
{
	void print(int add,int newone,String arr2[][]) 
	{
		System.out.println();
		
	}
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int i =in.nextInt();
		String arr[][]=new String[i][i];
		int index2=0;
		for(int index=i-1;index!=0;index--)
		{
			int temp=index2;
			for(;temp<i;temp++)
			{
				arr[index][temp]="#";
				
			}
			new Staircase().print(i,temp,arr);
			System.out.println();
			index2++;
			
			
		}		
		
		
		
		
		
		
		
		
		
//		for(int index=i-1;index!=0;index--)
//		{
//			int temp=index2;
//			for(;temp<i;temp++)
//			{
//				
//				System.out.println(arr[index][temp]);
//				
//			}
//			
			index2++;
			
			
		}		
	}

//}



//print 2v2 arrray using enhanced for loop


//for(String print[]:arr)
//	{
//		for(String j:print)
//		{
//		System.out.println(print);
//	}
//	}	

//
//for (int[] x : array)
//{
//   for (int y : x)
//   {
//        System.out.print(y + " ");
//   }
//   System.out.println();
////}