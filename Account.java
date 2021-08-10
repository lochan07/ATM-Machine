package source;
import java.text.DecimalFormat;
import java.util.*;
public class Account {

	 Scanner sc=new Scanner(System.in);
	DecimalFormat input=new DecimalFormat("'$'###,##0.00");
	private int customernumber;
	private int pinnumber;
	private double checkingBalance=0;
	private double savingBalance=0;
	 public int setCustomernumber(int customernumber)
	 {
		 this.customernumber=customernumber;
		 return customernumber;
	 }
	 public int getCustomernumber()
	 {
	   return customernumber;	 
	 }
	 public int setPinnumber(int pinnumber)
	 {
	  this.pinnumber=pinnumber;
	  return pinnumber;
	 }
	 public int getPinnumber()
	 {
	   return pinnumber;	 
	 }
	 public double getCheckingBalance()
	 {
		 return checkingBalance;
	 }
     public double getSavingBalance()
     {
    	return savingBalance; 
     }
     public double calcCW(double amount)
     {
    	checkingBalance-=amount;
    	return checkingBalance;
     }
     public double calcSW(double amount)
     {
    	savingBalance-=amount;
    	return savingBalance;
     }
     public double calcCD(double amount)
     {
    	checkingBalance+=amount;
    	return checkingBalance;
     }
     public double calcSD(double amount)
     {
    	savingBalance+=amount;
    	return savingBalance;
     }
     public void getCheckingWithdrawInput()
     {
        System.out.println("Amount you wish to withdraw");
    	double amount=sc.nextDouble();
    	if((checkingBalance-amount)>=0)
    		{
    		double k=calcCW(amount);
    		System.out.println("Remaining balance" +input.format(k));
    		}
    	else
    		System.out.println("Balance cant be negative");	
        }
     public void getCheckingDepositInput()
     {
        System.out.println("Amount you wish to deposit");
    	double amount=sc.nextDouble();
    	if((checkingBalance+amount)>=0)
    		{
    		double k=calcCD(amount);
    		System.out.println("Remaining balance" +input.format(k));
    		}
    	else
    		System.out.println("Balance cant be negative");	
        }
     public void getSavingWithdrawInput()
     {
        System.out.println("Amount you wish to withdraw");
    	double amount=sc.nextDouble();
    	if((savingBalance-amount)>=0)
    		{
    		double k=calcSW(amount);
    		System.out.println("Remaining balance" +input.format(k));
    		}
    	else
    		System.out.println("Balance cant be negative");	
        } 
     public void getSavingDepositInput()
     {
        System.out.println("Amount you wish to deposit");
    	double amount=sc.nextDouble();
    	if((savingBalance+amount)>=0)
    		{
    		double k=calcSD(amount);
    		System.out.println("Remaining balance" +input.format(k));
    		}
    	else
    		System.out.println("Balance cant be negative");	
        } 
     
     
}
