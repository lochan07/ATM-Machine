package source;

import java.util.*;
import java.text.DecimalFormat;
import java.io.IOException;
public class Optionmenu extends Account{
 
	Scanner sc=new Scanner(System.in);
	DecimalFormat m=new DecimalFormat("'$'###,##0.00");
	HashMap<Integer,Integer> data=new HashMap<Integer, Integer>();
	public void getLogin() throws IOException
	{
		int x=1;
		do {
		try {
			data.put(68686969, 9876);
			data.put(86866969, 1890);
			
			System.out.println("Welcome to the ATM");
			System.out.print("Enter customer number");
			setCustomernumber(sc.nextInt());
			
			System.out.print("Enter your pin number");
			setPinnumber(sc.nextInt());
			}
		catch(Exception e)
		{
	     System.out.println("\n" + "Invalid character(s).Only numbers "+"\n");
	     x=2;break;
		}
		int cn=getCustomernumber();
		int pn=getPinnumber();
		if(data.containsKey(cn) && data.get(cn)==pn)
			  getAccountType();
		else
		   System.out.println("Invalid customer number");	 
		}while(x==1);
   }
public void getAccountType()
{
  System.out.println("Select the account you want to access");
  System.out.println("1. Checking account");
  System.out.println("2. Savings account");
  System.out.println("3. Exit");
  System.out.println("Your choice : ");
  selection=sc.nextInt();
  switch(selection)
  {
  case 1: getChecking();
            break;
  case 2: getSaving();
            break;
  case 3: System.out.println("Thankyou for using the atm. BYE");
            break;
  default : System.out.println("\n"+" Invalid choice" +"\n");
             getAccountType();
  }
}

public void getChecking()
{
  System.out.println("Checking Account :");
  System.out.println("Type 1 - View Balance");
  System.out.println("Type 2 - Withdraw Funds");
  System.out.println("Type 3 - Deposit Funds");
  System.out.println("Type 4 - Exit");
  System.out.println("Choice :");
  selection = sc.nextInt();
  switch(selection)
  {
  case 1: System.out.println("Checking Account Balance : "+m.format(getCheckingBalance()));
	       System.out.println();
	       break;
  case 2:  getCheckingWithdrawInput();
            getAccountType();
            break;
  case 3: getCheckingDepositInput();
            getAccountType();
            break;
  case 4:  System.out.println("Thanks for using the ATM bye.");  
             break;
  default : System.out.println("\n"+" Invalid choice" +"\n");
            getChecking();
             break;
  }
  }

public void getSaving()
{
  System.out.println("Saving Account :");
  System.out.println("Type 1 - View Balance");
  System.out.println("Type 2 - Withdraw Funds");
  System.out.println("Type 3 - Deposit Funds");
  System.out.println("Type 4 - Exit");
  System.out.println("Choice :");
  selection = sc.nextInt();
  switch(selection)
  {
  case 1: System.out.println("Saving Account Balance : "+m.format(getSavingBalance()));
	       getAccountType();
	       break;
  case 2:  getSavingWithdrawInput();
            getAccountType();
            break;
  case 3: getSavingDepositInput();
            getAccountType();
            break;
  case 4:  System.out.println("Thanks for using the ATM bye.");  
             break;
  default : System.out.println("\n"+" Invalid choice" +"\n");
             getSaving();
             break;
  }
  }
 int selection;
}

