package project1_Phone_Contact;

import java.util.Comparator;

public class NameCompare implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Name name1=(Name) obj1;
		Name name2=(Name) obj2;
		
		int num=name1.getName().compareTo(name2.getName());
		if(num==0)
			return 1;
		return num;
				}

}
