package Classmodifier;
 class Final extends A {
	 static int age=8;
	 static{
		 System.out.println("yes1");
	 }
	 static int name() {
		 System.out.println("yes2");
		 return 0;
	 }
	 public static void main(String args[])
	 {
		 Final f= new Final(); 
		 System.out.println("yes3"+A.num);
		 name();
	 }

}
class A 
{
static int num=7;

}