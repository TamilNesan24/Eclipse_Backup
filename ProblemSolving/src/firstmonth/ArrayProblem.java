package firstmonth;

import java.util.Scanner;

public class ArrayProblem 

{
	ArrayProblem obj=new ArrayProblem();
	int arr[]=new int[8];
	public static void main(String args[])
	{
//		int arr[]={1,2,3,4};
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int arr[]=new int[n];
		for(int add=0;add<n;add++)
		{
			System.out.println("Enter the ecah element");
			arr[add]=in.nextInt();
		}
		
		
		int arr2[]=new int[arr.length*2];  
		int index;
		for(index=0;index<arr2.length;index++)
		{
			arr2[index]=(index==arr2.length-1)?(arr[arr.length-1]):0;     //int b=arr[arr.length-1]; we can also use variable instead of it
			System.out.println(" Index " +index +" " +arr2[index]);
			}
	}
	
	
	
	
	

	//	alternate
	
//	for(index=0;index<arr2.length;index++)
//	{
//		arr[index]=0;
//	}
//		arr2[index]=arr[arr.length-1];
//		int count=0;
//		for(int print:arr2)
//		{ 
//			//int count=0;
//			System.out.println(" Index " +count +" " +print);
//			count++;
//		}
	
}
