package project1_Phone_Contact;

import java.util.*;
//TreeMap<Name,Integer> test=new TreeMap();
public class PhoneContact 
{
	HashMap<Long,Contact> mPhone =new HashMap<Long, Contact>();
	HashSet<Long> mSave=new HashSet(); 
	TreeMap<Object,HashMap> mSorted=new TreeMap(new NameCompare());
	
	Long tNumber;
    String tAddress,tEmail,tName;
	Contact contactref;
	Name nameref;
	
	
	long phoneValidation()
	{
		
		while(true) {
			Scanner scan=new Scanner(System.in);
		tNumber=scan.nextLong();
		String check=tNumber.toString();
		
		if(check.length()==10)
			{
			
			return tNumber;
			}	
		else {
			System.out.println("Enter valid number");
			continue;
		}}}
int addData()
{
	Scanner scan2=new Scanner(System.in);
	System.out.println("Enter the number");
	Long lNumber=phoneValidation();
	HashMap<Long,Contact> lPhone =new HashMap<Long, Contact>();
	if(mSave.add(lNumber))
	{
		System.out.println("Enter the Name");
		 tName=scan2.nextLine();
		 System.out.println("Enter the Email");
		 tEmail=scan2.nextLine();
		 System.out.println("Enter the adress");
		tAddress=scan2.nextLine();
		lPhone.put(lNumber, new Contact(tEmail,tAddress));
		mSorted.put(new Name(tName),lPhone);
		}
	else
	
	{
		System.out.println("Number already existed please enter a new one");
		return 0;}
	while(true) {
	 System.out.println("Enter 1 to add more Contact and other keys to stop");
	 String stop=scan2.nextLine();
		if(stop.equals("1"))
			return 0;
		else 
			return 1;
		}
	}
void format()
{
	System.out.print("No.");
    System.out.format("%6s"," ");
    System.out.format("%-20s", "Name");
    System.out.format("%-20s", "Phone Number");
    System.out.format("%-20s", "Email");
    System.out.format("%-20s", "Address");
    System.out.println();
    }
	 
	 void remove()
	 {
		 Scanner scan3=new Scanner(System.in);
		 System.out.println("Enter the Number to Delete");
			Long lNumber=phoneValidation();
			if(mSave.contains(lNumber))
			{
				remove1(lNumber);
				return;
			}else 
				{
					Scanner in5=new Scanner(System.in);
					System.out.println("Data is not found");
					while(true) 
					{
				System.out.println("Enter 1 to continue and 0 to Exit");
				String call=in5.nextLine();
				if(call.equals("1"))
				remove();
				else if(call.equals("0"))
				return;
				else{
					System.out.println("Enter valid data");
				    continue;
				}}}}
	 void remove1(Long lNumber)
		{
			 for(Map.Entry itr:mSorted.entrySet())
	            {
				 nameref=(Name) itr.getKey();
				 mPhone=(HashMap<Long, Contact>) itr.getValue();
				 if(mPhone.containsKey(lNumber))
					 mPhone.remove(lNumber);
				 else
					 System.out.println("Didnt delete");
				 }}
	 
	 void search()
	 {
	  Scanner in=new Scanner(System.in);
	  System.out.println("Enter the number to search");
	  Long lNumber=phoneValidation();
		if(mSave.contains(lNumber))
		{
			search1(lNumber);
			return;
		}else 
			{
				Scanner scan5=new Scanner(System.in);
				System.out.println("Data is not found");
				while(true) 
				{
			System.out.println("Enter 1 to continue and 0 to Exit");
			String call=scan5.nextLine();
			if(call.equals("1"))
			search();
			else if(call.equals("0"))
			return;
			else{
				System.out.println("Enter valid data");
			    continue;
			}}}}
	 
		void search1(Long search)
		 {
			for(Map.Entry itr:mSorted.entrySet())
			{
				nameref=(Name) itr.getKey();
				mPhone=(HashMap<Long, Contact>) itr.getValue();
				if(mPhone.containsKey(search))
				{
					format();
			 System.out.print(1);
	         System.out.format("%6s"," ");
	         System.out.format("%-20s", nameref.getName());
	         System.out.format("%-20s", search);
	         System.out.format("%-20s", mPhone.get(search).getEmail());
	         System.out.format("%-20s", mPhone.get(search).getAddress());
	         System.out.format("%-20s", mPhone.get(search).getType());
	         System.out.println();
		 }}}
		void edit()
		{
			 Scanner in=new Scanner(System.in);
			  System.out.println("Enter the number to Edit");
			  Long lNumber=phoneValidation();
				if(mSave.contains(lNumber))
				{
					edit1(lNumber);
					return;
				}else 
					{
						Scanner scan5=new Scanner(System.in);
						System.out.println("Data is not found");
						while(true) 
						{
					System.out.println("Enter 1 to continue and 0 to Exit");
					String call=scan5.nextLine();
					if(call.equals("1"))
					search();
					else if(call.equals("0"))
					return;
					else{
						System.out.println("Enter valid data");
					    continue;
					}}}}
		
		void edit1(Long edit)
		{
			Scanner scan4=new Scanner(System.in);
		
			for(Map.Entry itr:mSorted.entrySet())
			{
				nameref=(Name) itr.getKey();
				mPhone=(HashMap<Long, Contact>) itr.getValue();

				int search;
				if(mPhone.containsKey(edit))
				{
					while(true) {
						System.out.println("--------------------");
			    System.out.println("Enter 1 to change the name");
				 System.out.println("Enter 2 to change the mail");
				 System.out.println("Enter 3 to change the address");
				 System.out.println("Enter 4 to exit");
				 System.out.println("--------------------");
				 try{search=scan4.nextInt();}
				 catch(Exception e)
				 {System.out.println(e.getMessage()+"Enter numbers only");
					 System.out.println("Enter numbers only");
					 continue;
				 }
				 switch(search)
				 {
				 case 1:
					 System.out.println("Old Name is     "+nameref.getName()+"  Enter the new name ");
					 String s1=scan4.nextLine();
					 tName=scan4.nextLine();
					 nameref.setName(tName);
					 break;
				 case 2:
					 System.out.println("Old Email is    "+mPhone.get(edit).getEmail()+"    Enter the email");
				    String s2=scan4.nextLine();
					 tEmail=scan4.nextLine();
					 contactref=mPhone.get(edit);
					 contactref.setEmail(tEmail);
					 mPhone.put(edit, contactref);
					 break;
				 
				 case 3:
					 System.out.println("Old Address is    "+mPhone.get(edit).getAddress()+"  Enter the address");
					 String s3=scan4.nextLine();
					 tAddress=scan4.nextLine();
					 contactref=mPhone.get(edit);
					 contactref.setAddress(tAddress);
					 mPhone.put(edit, contactref);
				 break;
				 case 4:
					 return;
				 default:
					 
					 System.out.println("Enter a valid data");
					 edit1(edit);
				 }
				 }
					}}}

void call()
{
	int i=0;
do{ try {
	 i=addData();}
catch(Exception e)
{
	 System.out.println("Enter number only");
	 
	 continue;
}
}while(i==0);
	}
void display() {
	 int count=0;
	format();
	if(!mSorted.isEmpty())
	{for(Map.Entry m:mSorted.entrySet())
 	  { 
		nameref =(Name) m.getKey();
		 mPhone=(HashMap<Long, Contact>) m.getValue();
		if(!mPhone.isEmpty())
		{
		System.out.print(++count);
       System.out.format("%6s"," ");
       System.out.format("%-20s", nameref.getName());
       for(Map.Entry itr:mPhone.entrySet())
       {
       	contactref=(Contact) itr.getValue();
       System.out.format("%-20s",itr.getKey());
       System.out.format("%-20s", contactref.getEmail());
       System.out.format("%-20s",contactref.getAddress());
       System.out.println();
       
       }
       }else
    	   {System.out.format("%-20s","None");}
		System.out.println("--------------------");       System.out.println();
}
	}
	else
 	   System.out.format("%-20s","None");       System.out.println();}
		

public static void main(String ar[])
{
	PhoneContact call=new PhoneContact();
	int stop=0;
	do {
		Scanner scan5=new Scanner(System.in);
		  System.out.println("--------------MENU---------------");
System.out.println("Press 1 To add new contact "); 
System.out.println("Press 2 To See all the Contact");
System.out.println("Press 3 To Edit ");
System.out.println("Press 4 To Remove");
System.out.println("Press 5 To Search");
System.out.println("Press 6 To Exit ");
int input;
try
{
	input=scan5.nextInt();
	}
catch(Exception e)
{
	 System.out.println("Enter numbers only");
	 continue;
}

switch(input) 
{
case 1:call.call();
break;
case 2:
	call.display();
break;
case 3:
	call.edit();
break;
case 4:
	call.remove();
break;
case 5:
call.search();
break;
case 6:System.exit(0);
break;
default:
	System.out.println("Enter valid number");
	stop=0;
}

	}while(stop==0);
	
}}


















//void test()
//{
//	
//	String name= new String("B");
//	String name1= new String("A");
//	String name2= new String("A");
////	test.put(new Name("Tamil").toString(), 12345);
////	test.put(new Name("Sriram").toString(), 123456);
////	test.put(new Name("Raj").toString(), 123457);
////	test.put(new Name("Arjun").toString(), 123458);
////	test.put(new Name("Arjun").toString(), 123899999);
////	System.out.println(test.size());
//	
//test.put(new Name("Tamil"), 12345);
//test.put(new Name("Sriram"), 123456);
//test.put(new Name("Raj"), 123457);
//test.put(new Name("Arjun"), 123458);
//test.put(new Name("Arjun"), 123899999);
//System.out.println(test);
//
//	}

