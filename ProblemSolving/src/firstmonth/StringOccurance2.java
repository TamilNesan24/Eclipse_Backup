package firstmonth;

import java.util.Scanner;

public class StringOccurance2 
{
		public static void main(String args[])
	{

			String sentence;
			String temp="";
			String test1;
			String test2;
			int count=0,count1=0;
			int index;
			Scanner in=new Scanner(System.in);
			
			System.out.println("Enter the sentence");
			sentence=in.nextLine();
			char save[]=sentence.toCharArray();
			System.out.println("Enter the First name");
			test1=in.nextLine();
			System.out.println("Enter the Second name");
			test2=in.nextLine();
			in.close();
			
			for(index=0;index<sentence.length();index++)
			{
				if(index!=(sentence.length()-1)&&save[(index+1)]!=' ')
					{temp+=save[index];}
				if(index==(sentence.length()-1)||save[(index+1)]==' ')
				{
					temp+=save[index];
					if(temp.equals(test1)) {count++;}
					if(temp.equals(test2)) {count1++;}
					if(index!=(sentence.length()-1)&&save[(index+1)]==' ') {index+=1;}
					temp="";
				}
			}
			System.out.println(count+"   " +count1);
			if(count==count1) {System.out.println("Yes Both occurs same time");}
}
}


















//String name;
//String name1;
//static int count,count1;
//{
//	Scanner in =new Scanner(System.in);
//	System.out.println("First string");
//    name=in.nextLine();
//	System.out.println("Second string");
//	name1=in.nextLine();	
//}
//
//void string1(String tes)
//{
//	if (name==tes) 
//	{
//		count++;
//	}
//		
//}
//void string2(String tes2)
//{
//	if (name1==tes2) 
//	{
//		count1++;
//	}
//		
//}
