// TestAccounts1
// A simple program to test the numAccts method of the
// Account class.
//************************************************************
import java.util.Scanner;
public class TestAccounts1
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many accounts would you like to create?"); 
		int num = scan.nextInt();
		
		Account testAcct=null;
		Account allList[]=new Account[num+1];
		
		
		
		for (int i=1; i<=num; i++)
		{
			testAcct = new Account(100, "Name" + i);
			allList[i]=testAcct;
			System.out.println("\nCreated account " + testAcct);
			// Your code here: call method to print out how many accounts have been created so far
		}
		
		int NoOfAccount=testAcct.getNumAccounts();
		System.out.println("Number of  accounts " + testAcct.getNumAccounts());
		System.out.println("Which Account You want to cloase");
scan.nextLine();
String s=scan.nextLine();
for(int i=1;i<=num;i++)
{
	if(allList[i].getName().equals(s))
	{
		allList[i].setName(" - Closed");
		testAcct.setNumAccounts();
		allList[i].setBalance(0.0);
	}
}	
	System.out.println("------------------------------------------------------------------------");
	//Final Display all Accounts
	
		for(int i=1; i<=num; i++)
		{
			System.out.println("\nCreated account " + allList[i]);
		}
			System.out.println("Number of Remaining accounts " + testAcct.getNumAccounts());
	
	
}
}