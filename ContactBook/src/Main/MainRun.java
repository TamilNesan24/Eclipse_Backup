package Main;

import java.util.Scanner;

public class MainRun 
{
	public static void main(String arg[])
	{
		Functionality contact=new Functionality();
		int stop = 0;
		Scanner scan5 = new Scanner(System.in);
		
do {
			
			System.out.println("--------------MENU---------------");
			System.out.println("Press 1 To add new contact ");
			System.out.println("Press 2 To See all the Contact");
//			System.out.println("Press 3 To Edit ");
			System.out.println("Press 4 To Remove");
			System.out.println("Press 5 To Search");
			System.out.println("Press 6 To Exit ");
			int input;
			try {
				input = scan5.nextInt();
			} catch (Exception e) {
				System.out.println("Enter numbers only");
				continue;
			}

			switch (input) {
			case 1:
				contact.addData();
				break;
			case 2:
				contact.display();
				break;
			case 3:
//				contact.edit();
				break;
			case 4:
				contact.remove();
				break;
			case 5:
				contact.search();
				break;
			case 6:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid number");
				stop = 0;
			}

		} while (stop == 0);

	}
	}


