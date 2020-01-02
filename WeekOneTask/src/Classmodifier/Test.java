package Classmodifier;
interface Ak
{
	void methods();
	default void nam() {
		System.out.println("Fu");
		
	}
}
class Test2 implements Ak{
	public void methods()
	{
	
	System.out.println("Fu");
}
	public void nam() {
		System.out.println("Fuc");
		
	}
}
public class Test{
		public static void main(String args[])
	{
		
	System.out.println("F");
	Test2 obj=new Test2();
	obj.methods();
	obj.nam();
	
	}
	}

