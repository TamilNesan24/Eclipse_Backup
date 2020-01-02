package firstmonth;

import java.util.Scanner;

public class SentenceDuplicateCount 
{
	public static void main(String args[])
	{
		
		String name;
        String save[]=new String[10];

      
		int count[]=new int[10];
		int line=3,l=0;
		int count1[][]=new int[line][6];
		String[][] save1=new String[line][6];
		
		Scanner	in =new Scanner(System.in);
		
		for(int i=0;i<line;i++)
		{
			name=in.nextLine();
		    save=name.split("\\s+");
		    count[i]=save.length;
		    for(int j=0;j<save.length;j++)
	    {
	    	save1[i][j]=save[j];
	    	count1[i][j]=1;
	    for(int k=0;k<=i;k++)
	    {
	    	int ch=count[k];
	    	if(k==i)ch=j;
	   for(int temp=0;temp<ch;temp++)
	   {
		   if(save1[k][temp].equals(save[j]))
			   count1[i][j]+=1;
	   }}}}
		// Printing
	    for(int i=0;i<line;i++)
	    {l=i;
	    if(i!=0&&count[i-1]>count[i]) {l=i-1;}	
		 for(int j=0;j<count[l];j++)
		    {
		System.out.print(count1[i][j]);
		if(j==count[l]-1)
			System.out.println("");
		}}}}


//for(int k=0,temp=0;k<i&&temp<j;k++,temp++)
//{
//System.out.print(save1[k][temp]);
//if(save1[k][temp].equals(save[temp]))
//	
//	count1[k][temp]+=1;
//}