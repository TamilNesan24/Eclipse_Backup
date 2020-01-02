package project1_Phone_Contact;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class Test3 
{
	    LinkedHashSet number=new LinkedHashSet();
		ArrayList email=new ArrayList();
		ArrayList name=new ArrayList();
		ArrayList address=new ArrayList();
		ArrayList type=new ArrayList();
		Scanner in=new Scanner(System.in);

	int add1() 
	{

	   Scanner in2=new Scanner(System.in);
	   String s1=new String("");
       System.out.println("Enter the number");
	   s1=in2.nextLine();
	 if(s1.length()!=10) 
	 {System.out.println("Enter a valid number");
	 return 0;}
	 if(number.add(s1))
		{
		 System.out.println("Enter the email");
		email.add(in2.nextLine());
		System.out.println("Enter the name");
		name.add(in2.nextLine());
		System.out.println("Enter the adress");
		address.add(in2.nextLine());
		System.out.println("Enter the type");
		type.add(in2.nextLine());
		}
else {
			System.out.println("Number already existed please enter a new one");
			return 0;}
		
	 System.out.println("Enter 1 to add more and other keys to stop");
	 int stop=in2.nextInt();
	 int temp;
		if(stop==1)
			{
			return 0;}
		else
			return 1;
		}		
		
	
	 void display() {
		 int count=0;
		ListIterator<String> itr=name.listIterator();
		Object[]itr1=number.toArray();
		System.out.print("No.");
        System.out.format("%6s"," ");
        System.out.format("%-20s", "Name");
        System.out.format("%-20s", "Phone Number");
        System.out.format("%-20s", "Email");
        System.out.format("%-20s", "Address");
        System.out.format("%-20s", "Type");
        System.out.println();
		while(itr.hasNext())
		{
			count++;
			int i=itr.nextIndex();
			System.out.print(count);
			System.out.format("%6s"," ");
			System.out.format("%-22s",itr.next());
			System.out.format("%-22s",itr1[i]);
			System.out.format("%-22s",email.get(i));
			System.out.format("%-20s",address.get(i));
			System.out.format("%-12s",type.get(i));
			System.out.println();
			}
		}
	 void replace()
	 {
		 Scanner in =new Scanner(System.in);
//		 ListIterator<String> itr=name.listIterator();
	     ArrayList search=new ArrayList(number); 
		 System.out.println("Enter the number of the Contact to replace");
		 String replacename=new String();
		 replacename=in.nextLine();
		 if(search.contains(replacename))
		 {int index=search.indexOf(replacename);
		 replace1(index);}
		 else
			 {
			 System.out.println("Data no found  Enter a Valid number");
			 replace();
			 
			 }
			 }
			 
	 
		void replace1(int index) {
			Scanner in3=new Scanner(System.in);
			while(true) {
				System.out.println("--------------------");
		 System.out.println("Enter 1 to change the name");
		 System.out.println("Enter 2 to change the mail");
		 System.out.println("Enter 3 to change the address");
		 System.out.println("Enter 4 to change the type");
		 System.out.println("Enter 5 to exit");
		 System.out.println("--------------------");
		 switch(in.nextInt())
		 {
		 case 1:
			 System.out.println("Enter the name");
			 name.set(index, in3.nextLine());
		 break;
		 case 2:System.out.println("Enter the email");
			 email.set(index, in3.nextLine());
		 break;
		 case 3:System.out.println("Enter the address");
			 address.set(index, in3.nextLine());
		 break;
		 case 4:System.out.println("Enter the type");
			 type.set(index, in3.nextLine()); 
		 break;
		 case 5:return;
		 default:
			 System.out.println("Enter a valid data");
			 replace1(index);
		 }}}
void add() {
	int i=0;
do{i=add1();}while(i==0);
}
	public static void main(String arg[])throws InterruptedException
	{
		Test3 s=new Test3();
		System.out.println("                         CONTACTS                        " );
		System.out.println();
		System.out.println("Add The First contact");
		System.out.println();
	    int i=0;
	    int stop=0;
	    	do{i=s.add1();}while(i==0);
	    	do {
	    		 Scanner in2=new Scanner(System.in);
	    		 System.out.println("--------------------");
	    System.out.println("To add new contact      press 1"); 
	    System.out.println("To See all the Contact  press 2");
        System.out.println("To Edit                 press 3");
	    System.out.println("To Exit                 press 4");
	    switch(in2.nextInt()) 
	{
	    case 1:s.add();
	    break;
	    case 2:
		s.display();
		System.out.println("--------------------");
		break;
	case 3:
		s.replace();
		break;
	case 4:System.exit(0);
		default:
			stop=0;
		}
	    	}while(stop==0);
	}
	}
	
	

