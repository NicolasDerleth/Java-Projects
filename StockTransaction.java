/* ========================================================================== */
/*	PROGRAM Stock Transaction Simulator

    AUTHOR: <Nicolas Derleth, Kolin Scharnhorst>
    COURSE NUMBER: <CIS 210>
    COURSE SECTION NUMBER: <01D>
    INSTRUCTOR NAME: <Professor Tian>
    PROJECT NUMBER: 2
    DUE DATE: 07/09/2021

SUMMARY

This program asks the user how many shares were 
bought and at what price. 
Also asks, how many shares your selling and the 
price per share.The program will calculate the 
amount of commission the user paid and how much 
that the user made profit.

INPUT

-Number of shares to buy (an integer)
-Price to be bought (a real number)
-Number of shares to sell (an integer)
-Price to be sold (an integer)

OUTPUT

The input shares, prices, and commission will be calculated to show the 
amount of commission paid and the total amount of profit.

ASSUMPTIONS
-Price to be bought is a real number
-Number of shares to sell is an integer
-Number of shares to buy
Price to be sold is an integer
-Commission is 2%
- Error checking does not need to be done on this input value.

/* MAIN FUNCTION */

//Scanner is used to input values.
import java.util.Scanner;

public class HW2_Derleth_Nicolas_Scharnhorst_Kolin
{
   public static void main(String [] args){
	// named constants
	     final double COMMISSION_RATE = 0.02;              // commission constant (2%)

	     //named variables
	     double sharestobuy;              // variable for initial amount of shares
	     double buyingprice;  			  //variable for initial price per share
	     double sharestosell; 			  //variable for amount of shares being sold
	     double sellingprice;			  //variable for final price per share
	     double commissionone;             //variable for initial commission amount
	     double commissiontwo;			  //variable for final commission amount
	     double profit;					  //total profit
	     String userName; 				  //variable to store user name
	     
	 

	     // print an introductory message output heading 
	     System.out.println("Welcome to the Stock Transaction Simulator!\n");
	     System.out.println("You will be asked to enter the amount of shares ");
	     System.out.println("you bought and for what price. It will aslo ask\n");
	     System.out.println("you to enter the amount of stocks you sold and");
	     System.out.println("at what price. Then the program will output how ");
	     System.out.println("much the broker fee is and the total profit");
	     System.out.println("that was made.\n");
	     System.out.println("==================================================");
	     

	     //create an scanner object for read in values from the user
	     Scanner input = new Scanner(System.in);
	   
	     //Read in name of the user.
	     System.out.println("Please enter your name: ");
	     userName = input.nextLine();
	    
	     //Read in the number of shares being purchased.
	     System.out.println("The number of shares you want to purchase: ");
	     sharestobuy = input.nextDouble();
	    
	     //Read in the price of each share.
	     System.out.println("Purchase price: ");
	     buyingprice = input.nextDouble();
	     
	     //Read in number of shares being sold.
	     System.out.println("The number of shares you want to sell: ");
	     sharestosell = input.nextDouble();
	     
	     //Read in price of shares being sold.
	     System.out.println("Sold Price: ");
	     sellingprice = input.nextDouble();
	     
	     //Calculate the commission on the share purchase
	     commissionone = COMMISSION_RATE * (sharestobuy * buyingprice);
	     
	     //Calculate the commission on selling the shares
	     commissiontwo = COMMISSION_RATE * (sharestosell * sellingprice);
	     
	     //Calculate total profit
	     profit = (sharestosell * sellingprice) - (sharestobuy * buyingprice) - commissionone - commissiontwo;
	     
	     //Outputs the users broker fees and prints profits. Decimals are only 2 digits.
	     System.out.println(userName + " has purchased " + (int)sharestobuy + " shares");
	     System.out.println("at $" + buyingprice + " and then sold " + (int)sharestosell + " shares");
	     System.out.printf("at $%.2f. He paid $%.2f.\n", sellingprice, commissionone);
	     System.out.println("for broker fees when buying the stock and");
	     System.out.printf("$%.2f for broker fees when selling the stock.\n", commissiontwo);
	     System.out.printf("So his profit is $%.2f.\n", profit);
	     System.out.println("Good bye");
	     
	    
	     
	     
	     input.close();
	
	}
}

/* ========================================================================== */ 
/*                      E N D   O F   P R O G R A M                           */
/* ========================================================================== */

  