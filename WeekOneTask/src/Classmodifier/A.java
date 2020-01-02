package Classmodifier;
 class C
{
	C()
	{
		
	System.out.println("Class c");
	}
	

}
 class B 
{
	B()
	{
		System.out.println("Class b");
	}

}
public class A extends B 
{
	A()
	{
		int name;
		System.out.println("Class a ");
	}
	public static void main(String args[])
	{
	A call=new A();	
	}

}
