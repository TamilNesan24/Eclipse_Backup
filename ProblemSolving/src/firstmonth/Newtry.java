package firstmonth;

import java.util.Scanner;

public class Newtry {

		public static void main(String args[])
		{
			String name;
			System.out.println("Enter");
			Scanner user = new Scanner(System.in);
			name=user.nextLine();
			char index[]=name.toCharArray();
			//System.out.println(index.length);
			 //int i=0;
			for(char r:index)
			{
				int i=0;
		    int count=0;
		    System.out.println(r);
		    //System.out.println(index[i]);
		    
			
		   while(i<index.length)
		   {
			   if(r==index[i])
					{count++;}
					i++;
		   }
		   System.out.println(r +" : " +count);
			}
		   //System.out.println(+r +" : " +count);
		    
//			while(i<index.length)
//			{
//			if(r==index[i])
//			count++;
//			i++;
//			}
			//System.out.println(+r+" : "+count);
		    
			}	
}














//for(int indexvalue=0;indexvalue<index.length;indexvalue++)
//{
//	int count=0;
//	if(index[indexvalue]!='\0')
//	{
//	for(int indexvalue1=0;indexvalue1<index.length;indexvalue1++)
//	{
//		 if(index[indexvalue]==0&&index[indexvalue1]==0)
//		{
//			count=1;
//		}
//		else if(index[indexvalue]==index[indexvalue1])
//		{
//		count++;
//		if(count>1)
//		index[indexvalue1]='\0';
//		}
//		}
//	System.out.println(index[indexvalue] +" occurs" +count);
//}
//
