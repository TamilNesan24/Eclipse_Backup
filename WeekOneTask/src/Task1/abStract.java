package Task1;

abstract class abStract {
	abstract (); 
	} 
	class Derived extends abStract { 
		void fun() { System.out.println("Derived fun() called"); } 
	} 
	class Main { 
		public static void main(String args[]) { 
		
			
		abStract b = new Derived(); 
			b.fun(); 
		} 
}
