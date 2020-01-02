package Classmodifier;


 class Classone
{
	 Classone()
	 {
//	String name;
//	Scanner get = new Scanner(System.in);
//    name=get.nextLine();
//    int age=get.nextInt();
    System.out.println("one");
	}
}
	 public class Name extends Classone
	{
		Name()
		{
			System.out.println("hello");
		}
		public static void main(String argv[])
		{
			Name obj=new Name();
		}
}