package Classmodifier;

public class Oddoreven 
{
	void a();
public static void main(String args[])
{
	int arr[]= {1,2,3,7,5,6,7,8};
	int i;
	for(i=1;i<arr.length;i=i+2) 
	{
		if(arr[i]%2==0)
			System.out.println(arr[i] +" is even");
		else {
			System.out.println(arr[i]+ " is odd");
		}
			
	
	}
	
}
}
