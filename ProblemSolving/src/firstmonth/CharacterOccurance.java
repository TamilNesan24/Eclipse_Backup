package firstmonth;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class CharacterOccurance {
	public static void main(String args[]) {
		String name;
		Scanner user = new Scanner(System.in);
		name = user.nextLine();// .toLowerCase();
		name = name.toLowerCase();
		char index[] = name.toCharArray();
		Arrays.sort(index);
		char temp = index[0];
		int count = 1;
		for (int i = 1; i < index.length; i++) {
			if (temp == index[i]) {
				count++;
			} else {
				System.out.println(temp + " Occurs " + count + " times");
				if (i == index.length - 1)
					break;
				else {
					temp = index[i];
					count = 1;
				}
			}
		}
		System.out.println(temp + " Occurs " + count + " times");
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
//}			
//	for(char i:index)
//	{
//		System.out.println(i);
//	}