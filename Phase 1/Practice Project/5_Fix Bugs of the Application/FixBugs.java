package fixBugs;
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class FixBugs {

	private static ArrayList<Integer> arrlist = new ArrayList<Integer>();
	private static ArrayList<Integer> expenses = new ArrayList<Integer>();
	FixBugs()
	{
		expenses.add(1000);
		expenses.add(2300);
		expenses.add(45000);
		expenses.add(32000);
		expenses.add(110);
		expenses.addAll(arrlist);
	}
	private void optionsSelection() 
	{
		String[] arr = {"1. I wish to review my expenditure",
				"2. I wish to add my expenditure",
				"3. I wish to delete my expenditure",
				"4. I wish to sort the expenditures",
				"5. I wish to search for a particular expenditure",
				"6. Close the application"
		};
		int  slen = arr.length;
		System.out.println("--------------------------------------------------");
		for(int i=0; i<slen; i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("\nENTER YOUR CHOICE :\t");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int  options =  sc.nextInt();
		switch (options)
		{
		case 1:
			if(expenses.isEmpty())
			{
				System.out.println("There is no Expences saved");
				optionsSelection();
			}
			else
			{
				System.out.println("Your Saved EXPENCES Are Listed Below: \n");
				System.out.println(expenses+ "\n");
				optionsSelection();
			}
			break;

		case 2:
			System.out.println("Enter The Values to Add Your EXPENCE: ");
			int value = sc.nextInt();
			expenses.add(value);
			System.out.println("Your values are UPDATED\n");
			expenses.addAll(arrlist);
			System.out.println(expenses+ "\n");
			optionsSelection();
			break;

		case 3:
			if(expenses.isEmpty())
			{
				System.out.println("There is no Expences saved \n");
				optionsSelection();
			}
			else
			{
				System.out.println("You are about the delete all your EXPENCES!! \n Confirm again by selecting the same option...\n");
				int con_choice = sc.nextInt();
				if(con_choice == options)
				{
					expenses.clear();
					System.out.println("All your EXPENCES are Erased!\n");
				} 
				else 
				{
					System.out.println("Somthing went to Wrong..... try again! \n");
				}
				optionsSelection();
			}
			break;

		case 4:
			if(expenses.isEmpty())
			{
				System.out.println("There is no Expences saved\n");
				optionsSelection();
			}
			else
			{
				sortExpenses(expenses);
				optionsSelection();
			}
			break;

		case 5:
			if(expenses.isEmpty())
			{
				System.out.println("There is no Expences saved\n");
				optionsSelection();
			}
			else
			{
				searchExpenses(expenses);
				optionsSelection();
			}
			break;

		case 6:
			closeApp();
			break;

		default:
			System.out.println("You have made an invalid choice!\n");
			optionsSelection();
			break;
		}
	}




	private static void closeApp() 
	{
		System.out.println("Closing Your Application... \nTHANK YOU!");
	}

	private static void searchExpenses(ArrayList<Integer> arrayList) 
	{
		int leng = arrayList.size(),i;
		System.out.println("Enter the EXPENCES You Need to Search:\t");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for(i=0;i<leng;i++) 
		{
			if(arrayList.get(i)==input) 
			{
				System.out.println("Found the EXPENCE " + input + " at " + i + " Position");
				break;
			}
		}
		if(i==leng)
		{
			System.out.println("No Such Expence exists.\n");
		}

	}

	private static void sortExpenses(ArrayList<Integer> arrayList) 
	{
		@SuppressWarnings("unused")
		int arrlength =  arrayList.size();
		Collections.sort(arrayList);
		System.out.println("Sorted EXPENCES: ");
		for(Integer i: arrayList) 
		{
			System.out.print(i + " ");
		}
		System.out.println("\n");

	}

	public static void main(String[] args) {
		FixBugs obj = new FixBugs();
		System.out.println("Hello World!");
		System.out.println("\n--------------------------------------------------\n");
		System.out.println("\t WELCOME TO THE DESK: \n");
		System.out.println("--------------------------------------------------");
		obj.optionsSelection();

	}

}
