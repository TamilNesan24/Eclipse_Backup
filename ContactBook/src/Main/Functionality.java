package Main;

import java.util.*;
import java.util.Map.Entry;
import Helper.Contact;
import Helper.Name;
import Util.MyCompare;


public class Functionality {
	HashMap<Long, Contact> contactMap = new HashMap();

	void addData() {
		Contact data = new Contact();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Enter the number");
		Long localNumber = phoneValidation();
		if (!contactMap.containsKey(localNumber)) {
			System.out.println("Enter the Name");
			data.setName(scan2.nextLine());
			System.out.println("Enter the Email");
			data.setEmail(scan2.nextLine());
			System.out.println("Enter the adress");
			data.setAddress(scan2.nextLine());
			contactMap.put(localNumber, data);
		} else {
			System.out.println("Number already existed please enter a new one");

		}
		System.out.println("Enter 1 to add more Contact and other keys to stop");
		String stop = scan2.nextLine();
		if (stop.equals("1"))
			addData();
		else {
			return;
		}

	}

	long phoneValidation() {
		Long tNumber = 0l;
		while (true) {
			Scanner scan = new Scanner(System.in);
			try {
				tNumber = scan.nextLong();
			} catch (Exception e) {
				System.out.println("Enter number only");
				System.out.println("Re Enter the number");

				phoneValidation();
			}
			String check = tNumber.toString();

			if (check.length() == 10) {

				return tNumber;
			} else {
				System.out.println("Enter valid number");
				continue;
			}
		}
	}

	void format() {
		System.out.print("No.");
		System.out.format("%6s", " ");
		System.out.format("%-20s", "Name");
		System.out.format("%-20s", "Phone Number");
		System.out.format("%-20s", "Email");
		System.out.format("%-20s", "Address");
		System.out.println();
	}

	void display() {
		int count = 0;
		format();
		List<Map.Entry<Long, Contact>> list = new ArrayList(contactMap.entrySet());
		Collections.sort(list, new MyCompare());
		HashMap<Long, Contact> display = new LinkedHashMap<Long, Contact>();
		for (Map.Entry<Long, Contact> aa : list) {

			display.put(aa.getKey(), (Contact) aa.getValue());
		}

		if (!contactMap.isEmpty()) {
			for (Map.Entry itr : display.entrySet()) {
				Contact contact = (Contact) itr.getValue();
				System.out.print(++count);
				System.out.format("%6s", " ");
				System.out.format("%-20s", contact.getName());
				System.out.format("%-20s", itr.getKey());
				System.out.format("%-20s", contact.getEmail());
				System.out.format("%-20s", contact.getAddress());
				System.out.println();

			}
			System.out.println("--------------------");

		} else
			System.out.format("%-20s", "None");
		System.out.println();
	}

	void search() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number to search");
		Long lNumber = phoneValidation();
		if (contactMap.containsKey(lNumber)) {
			search1(lNumber);
			System.out.println("-----------------------------");
			return;
		} else {
			Scanner scan5 = new Scanner(System.in);
			System.out.println("Data is not found");

		}
	}

	void search1(Long search) {

		Contact display = contactMap.get(search);
		format();
		System.out.print(1);
		System.out.format("%6s", " ");
		System.out.format("%-20s", display.getName());
		System.out.format("%-20s", search);
		System.out.format("%-20s", display.getEmail());
		System.out.format("%-20s", display.getAddress());
		System.out.format("%-20s", display.getType());
		System.out.println();

	}

	void remove() {
		Scanner scan3 = new Scanner(System.in);
		System.out.println("Enter the Number to Delete");
		Long lNumber = phoneValidation();
		if (contactMap.containsKey(lNumber)) {
			contactMap.remove(lNumber);
			System.out.println("Contact is REMOVED");
			return;
		} else {
			Scanner in5 = new Scanner(System.in);
			System.out.println("Data is not found");
			while (true) {
				System.out.println("Enter 1 to continue and any other key to exit");
				String call = in5.nextLine();
				if (call.equals("1"))
					remove();
				else
					return;
			}
		}
	}
	

}