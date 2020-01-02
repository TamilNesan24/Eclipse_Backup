package Classmodifier;


	interface Draw{  
		void drawable();  
		}  
		//Implementation: by second user  
		class Rectangle implements Draw{  
		public void drawable(){System.out.println("drawing rectangle");}  
		}  
		class Circle implements Draw{  
		public void drawable(){System.out.println("drawing circle");}  
		}  
		//Using interface: by third user  
		class TestInterface1{  
		public static void main(String args[]){  
		Draw d=new Circle();//In real scenario, object is provided by method e.g. getDrawable()  
		d.drawable();  
		}}  

