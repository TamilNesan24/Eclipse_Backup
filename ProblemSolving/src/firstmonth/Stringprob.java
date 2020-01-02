package firstmonth;

import java.util.Scanner;

public class Stringprob 
{
	public static void main(String args[])
	{

	String test1;
	String test2;
	String sentence;
	int index,index2;
	int temp,temp2;
	int prove=1;
    int count=0,sum1=0,sum2=0;
    
	Scanner in =new Scanner(System.in);
	System.out.println("First string");
	test1=in.nextLine();
	char save1[]=test1.toCharArray();
	System.out.println("Second string");
	test2=in.nextLine();
	char save2[]=test2.toCharArray();
	System.out.println("Sentence");
	sentence=in.nextLine();
	char save[]=sentence.toCharArray();
	in.close();
	
	// To check the whether the string contains only the First string  
	
   if(sentence.length()==test1.length()&&test1.contentEquals(sentence))
	   System.out.println(test1 +"occurs once");
   else
     {
	   for(index=0;index<=(sentence.length()-test1.length());index++)
     {
    	 count=0;
	for(index2=0,temp=index,temp2=index;index2<test1.length();index2++,temp++)
    	 {
		// To check whether the has the First string in the last to avoid the "Arrayindexbound" error
		if((temp==((save.length)-1)))
	    {
		// To check whether the First string is in first and if it is this for loop should not run
			if(temp2!=0&&count==test1.length()-1&&(save[temp2-1]==' '))
		     sum1+=prove;                                                                               //	incase to check::use   System.out.println("yes i was there " +save[temp] +temp);
	   		 }
		// Check equals
		else if((save[temp]==save1[index2]))
		{
			count++;                                                                                    //	incase to check::use		System.out.println(save[temp]);
		//// To check whether the First string last element has occured to check some condition 
			if((index2==test1.length()-1))
			{
				// To check whether the First string is in first and if it is this for loop should not run
				if(temp2==0&&sentence.length()>test1.length())
					sum1+=prove;
				// condition 2:If the sentence does not start with the First string 
				else if(temp2!=0&&(save[temp+1]==' ')&&count==test1.length()&&(save[temp2-1]==' '))
					sum1+=prove;
			}
   	 }}}
	   System.out.println(test1+" Occurs " +sum1 +" times ");}
   
   // Logic same as Firstone for the second one
   
   if(sentence.length()==test2.length()&&test2.contentEquals(sentence))
	   System.out.println(test2 +"occurs once");
   else
     {
	   for(index=0;index<=(sentence.length()-test2.length());index++)
     {
    	 count=0;
	for(index2=0,temp=index,temp2=index;index2<test2.length();index2++,temp++)
    	 {
		if((temp==((save.length)-1)))
	    {
			if(temp2!=0&&count==test2.length()-1&&(save[temp2-1]==' '))
		     sum2+=prove;
	   		 }
		else if((save[temp]==save2[index2]))
		{
			count++;
			if((index2==test2.length()-1))
			{
				if(temp2==0&&sentence.length()>test2.length())
					sum2+=prove;
				else if(temp2!=0&&(save[temp+1]==' ')&&count==test2.length()&&(save[temp2-1]==' '))
					sum2+=prove;
			}}}}
	   System.out.println(test2+" Occurs " +sum2 +" times ");	   }
   
   
   if(sum1==sum2)
	   System.out.println("Yes");
   else
	   System.out.println("No");
	   
	}
}
     
     
 














//if(save[temp]==save1[index2])
//{
//	 count++;
//	 System.out.println(save[temp]);
//	 }
//	 
//	    else
//if((index2==test1.length()-1))
//	 {
//	 if((save[temp+1]==' ')||count==test1.length())
//   sum1+=prove;
//	 }