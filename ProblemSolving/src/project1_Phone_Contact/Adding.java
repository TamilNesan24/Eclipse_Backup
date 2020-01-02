package project1_Phone_Contact;

import java.util.*;

public class Adding 
{
	HashMap<Long,Contact> mPhone =new HashMap<Long, Contact>();
	TreeMap<Name,HashMap> mSorted=new TreeMap();
	Contact contactref;
	Name nameref;
	
		

	int addData()
	{
	    Contact contact=new Contact();
	    Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		Long num=in.nextLong();
		String check=num.toString();
		
		if(check.length()!=10)
		{
			System.out.println("Enter valid number");
			return 0;
		}
		if(!mPhone.containsKey(num))
		{
			Scanner in1=new Scanner(System.in);
			 System.out.println("Enter the email");
			 contact.setEmail(in1.nextLine());
			 System.out.println("Enter the name");
			 contact.setName(in1.nextLine());
			 System.out.println("Enter the adress");
			 contact.setAddress(in1.nextLine());
			 System.out.println("Enter the type");
			 contact.setType(in1.nextLine());
			 mPhone.put(num, contact);
			 }
		else {
			System.out.println("Number already existed please enter a new one");
			return 0;}
		while(true) {
		 System.out.println("Enter 1 to add more Contact and other keys to stop");
		 String stop2=in.nextLine();
		 String stop=in.nextLine();
			if(stop.equals("1"))
				return 0;
			else 
				return 1;
			}}
void format()
{
	System.out.print("No.");
    System.out.format("%6s"," ");
    System.out.format("%-20s", "Name");
    System.out.format("%-20s", "Phone Number");
    System.out.format("%-20s", "Email");
    System.out.format("%-20s", "Address");
    System.out.format("%-20s", "Type");
    System.out.println();
    }
	 void display() {
		 int count=0;
		format();
		for(Map.Entry m:mPhone.entrySet())
  	  { 
//			ArrayList l=mPhone.keySet();
			contactref=(Contact) m.getValue();
        	System.out.print(++count);
            System.out.format("%6s"," ");
            System.out.format("%-20s", contactref.getName());
            System.out.format("%-20s",m.getKey());
            System.out.format("%-20s", contactref.getEmail());
            System.out.format("%-20s", contactref.getAddress());
            System.out.format("%-20s", contactref.getType());
            System.out.println();
        	}}

	 void remove()
	 {
		 Scanner in2=new Scanner(System.in);
		 System.out.println("Enter the number to remove");
			   Long remove=in2.nextLong();
			   String check=remove.toString();
		 
	   if(check.length()!=10)
		{
		   System.out.println("Enter valid number");
		  remove();
		}
		 if(mPhone.containsKey(remove))
		{
			remove1(remove);
			return;
			
		}
		 else 
		{
			Scanner in5=new Scanner(System.in);
			System.out.println("Data is not found");
			while(true) {
			System.out.println("Enter 1 to continue and 0 to Exit");
//			int loop=0;
		String call=in5.nextLine();
		if(call.equals("1"))
		remove();
		else if(call.equals("0"))
		return;
		else
			{System.out.println("Enter valid data");
		continue;
		}}
		}}
		
		
	 void remove1(Long remove)
		{
		 Contact detail=mPhone.get(remove);
		 mPhone.remove(remove, detail);
		 System.out.println("Contact is Removed");
			return;
		}
	 void replace()
	 {
		 Scanner in3=new Scanner(System.in);
		   System.out.println("Enter the number to replace");
		   Long replace=in3.nextLong();
		   String check=replace.toString();
			if(check.length()!=10)
			{
				System.out.println("Enter valid number");
				replace();
			}
			if(mPhone.containsKey(replace))
			{
				replace1(replace);
				return;
			}
			else
			{
				Scanner in8=new Scanner(System.in);
				System.out.println("Data is not found");
				System.out.println("Data is not found Press 1 to continue and 0 to exit");
				int i=in8.nextInt();
				if(i==1)
					replace();
				else if(i==1)
					return;
				
			}
		 
	 }
	 void replace1(Long replace)
	 {
		 Scanner in4=new Scanner(System.in);
		 Contact c=mPhone.get(replace);
		 int s;
		 while(true) {
				System.out.println("--------------------");
		 System.out.println("Enter 1 to change the name");
		 System.out.println("Enter 2 to change the mail");
		 System.out.println("Enter 3 to change the address");
		 System.out.println("Enter 4 to change the type");
		 System.out.println("Enter 5 to exit");
		 System.out.println("--------------------");
		 try{s=in4.nextInt();}
		 catch(Exception e)
		 {System.out.println(e.getMessage()+"Enter numbers only");
			 System.out.println("Enter numbers only");
			 continue;
		 }
		 switch(s)
		 {
		 case 1:
			 System.out.println("Old Name is     "+c.getName()+"  Enter the new name ");
			String s11=in4.nextLine();
			 c.setName(in4.nextLine());
			 mPhone.put(replace, c);
			
			break;
		 case 2:
			 System.out.println("Old Email is    "+c.getEmail()+"  Enter the email");
			 String s12=in4.nextLine();
		 c.setEmail(in4.nextLine());
		 mPhone.put(replace, c);
		 break;
		 
		 case 3:
			 System.out.println("Old Address is    "+c.getAddress()+"  Enter the address");
			 String s13=in4.nextLine();
		 c.setAddress(in4.nextLine());
		 mPhone.put(replace, c);
		 break;
		 
		 case 4:
			 System.out.println("Old Type is      "+c.getType()+"        Enter the type");
			 String s14=in4.nextLine();
		 c.setType(in4.nextLine());
		 
		 mPhone.put(replace, c);
		 break;
		 case 5:
			 return;
		 default:
			 
			 System.out.println("Enter a valid data");
			 replace1(replace);
		 }}}
	 
	 void search()
	 {
		 Scanner in=new Scanner(System.in);
		   System.out.println("Enter the number to search");
		   Long search=in.nextLong();
		   String check=search.toString();
			if(check.length()!=10)
			{
				System.out.println("Enter valid number");
				search();
			}
			if(mPhone.containsKey(search))
			{
				search1(search);
				return;
			}
			else
			{
				System.out.println("Data is not found Press 1 to continue and 0 to exit");
				int i=in.nextInt();
				if(i==1)
				search();
				else if(i==1)
					return;
					}}
	 void search1(Long search)
	 {
		 format();
		 System.out.print(1);
         System.out.format("%6s"," ");
         System.out.format("%-20s", mPhone.get(search).getName());
         System.out.format("%-20s", search);
         System.out.format("%-20s", mPhone.get(search).getEmail());
         System.out.format("%-20s", mPhone.get(search).getAddress());
         System.out.format("%-20s", mPhone.get(search).getType());
         System.out.println();
	 }
	 
	public static void main(String arg[])
	{
		Adding ad=new Adding();
		 int i=0;
		 int stop=0;
		 call:
			
		 do{ try {
			 i=ad.addData();}
		 catch(Exception e)
		 {
			 System.out.println("Enter number only");
			 
			 continue;
		 }
		 }while(i==0);
	    	ad.display();
	    	
	    	do {
	    		 Scanner in6=new Scanner(System.in);
	    		 System.out.println("--------------MENU---------------");
	    System.out.println("Press 1 To add new contact "); 
	    System.out.println("Press 2 To See all the Contact");
        System.out.println("Press 3 To Edit ");
        System.out.println("Press 4 To Remove");
        System.out.println("Press 5 To Search");
	    System.out.println("Press 6 To Exit ");
	    try{switch(in6.nextInt()) 
	{
	    case 1:ad.addData();
	    break;
	    case 2:
		ad.display();
		System.out.println("--------------------");
		break;
	case 3:
		ad.replace();
		break;
	case 4:
		ad.remove();
		break;
	case 5:ad.search();
	break;
	case 6:System.exit(0);
		default:
			System.out.println("Enter valid number");
			stop=0;
		}}
		 catch(Exception e)
		 {
			 System.out.println("Enter numbers only");
			 continue;
		 }
	    	}while(stop==0);
	    	
	}
}


//Long numberValidation(Long remove)
//{   
//	 Scanner scan=new Scanner(System.in);
//	   remove = scan.nextLong();
//	 invalid:
//	 while(true) {
//	 
//   if(remove<1000000000||remove>9999999999)
//	{
//	   System.out.println("Enter valid number");
//	   
//	   continue;
//	}
//   break;
//	 }
//	 return remove;
//}}

