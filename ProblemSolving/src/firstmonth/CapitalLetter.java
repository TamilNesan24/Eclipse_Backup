package firstmonth;

import java.util.Scanner;

public class CapitalLetter 
{
public static void main(String ars[])
{
	String sentence;
	Scanner in= new Scanner(System.in);
	System.out.println("Enter the Syring");
	sentence=in.nextLine();
	char save[]=sentence.toCharArray();
//	save[0]='t';
//	save[0]=Character.toUpperCase(save[0]);
	for(int index=0;index<save.length;index++)
	{
		if(index==0||index==(save.length-1)) {save[index]=Character.toUpperCase(save[index]);}
		else if(save[index+1]==' ') {save[index]=Character.toUpperCase(save[index]);}
		else if(save[index-1]==' ') {save[index]=Character.toUpperCase(save[index]);}
	}
	String sentence2=new String(save);
	System.out.println(sentence2);
}
}
