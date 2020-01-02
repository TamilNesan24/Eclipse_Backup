package firstmonth;

public class stringSpace 
{
	public static void main(String args[])
	{
		String name="the   tehh etteh etr  e";
		int count=0;
		
		for(int i=0;i<name.length();i++)
		if(name.charAt(i)==' ')
				count++;
		System.out.println(count);
	}}
