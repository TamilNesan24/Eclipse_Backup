package firstmonth;

import java.util.Scanner;

public class FirstDuplicate 
{
	public static void main(String args[])
	{

			String sentence;
			String temp1="";
			int index,sum=0,index2,i=0;
			
			Scanner in=new Scanner(System.in);
		
			System.out.println("Enter the sentence");
			try{sentence=in.nextLine();}
			catch(Exception e) 
			{
				System.out.println("Enter a String not  a  " +e.getMessage() +" Re Enter");
				sentence=in.nextLine();
				}
			
			char save[]=sentence.toCharArray();
			String temp[]=new String[sentence.length()];

			in.close();
			
			for(index=0;index<sentence.length();index++)
			{ 
				if(index!=(sentence.length()-1)&&save[(index+1)]!=' ')
					{temp1+=save[index];}
				if(index==sentence.length()-1||save[index+1]==' ') 
					{
						temp1+=save[index];
						temp[i]=temp1;
						temp1="";
						index=index+1;
						sum+=1;
						i++;}}
			int check[]=new int[sum];
//			for(k=0;k<sum;k++)System.out.println(k +" is "+temp[k]);
			for(index2=0;index2<sum;index2++)
			{
//				System.out.println(temp[index2]);
				for(int index3=index2+1;index3<sum;index3++)
				{
					if(temp[index2].equals(temp[index3])) {
					check[index3]=1;}
//					System.out.println(temp[index3]);
				}
			}
			Loop:
			for(int result=0;result<sum;result++)
			{
				if(check[result]==1) {System.out.println(temp[result]); break Loop;}
			}
				
			
			}}
			





















//for(int k=0;k<sentence.length();k++)System.out.println(temp3[0] +count[0]);
//}
//if(temp.equals(test1)) {count++;}
//if(temp.equals(test2)) {count1++;}
//if(index!=(sentence.length()-1)&&save[(index+1)]==' ') {index+=1;}
//temp="";
//
//if(index==sentence.length()||save[index+1]==' ') 
//{
//	temp[i]+=save[index];
//	for(index2=index+2;index2<sentence.length();index2++) 
//	{ 
//		if(index2!=(sentence.length()-1)&&save[(index2+1)]!=' ')
//			{temp1+=save[index2];}
//	if(index2==sentence.length()||save[index2+1]==' ') 
//	{
//		temp1+=save[index2];
//		if(temp[i]==temp1) {count[]}
//		}
//	{}