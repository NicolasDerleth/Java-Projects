/* ========================================================================== */
/*	PROGRAM Internet Service Provider

    AUTHOR: <Nicolas Derleth, Kolin Scharnhorst>
    COURSE NUMBER: <CIS 210>
    COURSE SECTION NUMBER: <01D>
    INSTRUCTOR NAME: <Professor Tian>
    PROJECT NUMBER: 3
    DUE DATE: 16/09/2021

SUMMARY

This program calculates a customer’s monthly bill. 
It asks the user to enter the letter of the 
package the customer has purchased (A, B, or C) and 
the number of hours that were used. It 
displays the total charges. In addition, it
displays the amount of money Package A customers 
would save if they purchased Package B or C, and 
the amount of money Package B customers would save 
if they purchased Package C. If there would be no savings, no
message will be printed.

INPUT

-The type of Package (a character)
-The number of hours a customer accessed to the Internet.
OUTPUT

- The amount of money a customer will pay
- The amount of money a customer will save if he or she purchase Package B or C
- The amount of money must following a ‘$’ and have 2 decimal points, such as $2.00,
$34.56, etc.


ASSUMPTIONS
-There are 3 packages at their set prices
-Package A: $9.95 per month 10 hours access. Additional hours are $2.00
-Package B: $13.95 per month 20 hours access. Additional hours are $1.00
-Package C: $19.95 per month unlimited access
-Hours used is an integer

- Error checking does not need to be done on this input value.

/* MAIN FUNCTION */

//Scanner is used to input values.
import java.util.Scanner;

public class HW3_Derleth_Nicolas_Scharnhorst_Kolin
{
   public static void main(String [] args){
	   
	   
	  
	   //variables
	  char userPackage;					//variable for the package user has
	  int hours;						//variable for hours user is accessed
	  double cost = 0;						//variable for the fees the customer pays
	  double savings;					//variable for how much user could have saved
	  
	//create an scanner object for read in values from the user
	 Scanner input = new Scanner(System.in);
	  
	 //inputting the package selection and the hours
	  System.out.println("Please enter the letter of the package: ");
	  userPackage = input.next().charAt(0);
	  System.out.println("Please enter the number of hours used: ");
	  hours = input.nextInt();
	  
	  //creating a switch to help divide and process each package
	  switch(userPackage) {
	  
	  	case 'A':
	  		if (hours <= 10 && hours >= 0) {
	  			System.out.println("Total cost is $9.95");										//case if customer chose package a and used 10 or less hours
	  		}
	  		if (hours > 10) {																	//case if customer chose package a and used more than 10 hours
	  			cost = 9.95 + (hours - 10) * 2;
	  			System.out.println("Total cost is $" + cost);
	  			if (cost > 13.95 && cost <= 19.95) {
	  				savings = cost - 13.95;														//calculate savings relating from package A to package B
	  				System.out.printf("Customer can save $%.2f if he purchases Package B. \n", savings);
	  				
	  			}
	  			if (cost > 19.95) {
	  				savings = cost - 19.95;														//calculate savings relating from package A to package C
	  				System.out.printf("Customer can save $%.2f if he purchases Package C. \n", savings);
	  				
	  			}
	  		}
	
	  		System.out.println("Good Bye");
	  		break;
	  	case 'B':
	  		if (hours <= 20 && hours >= 0) {													//case for package B and used less than 20 hours
	  			System.out.println("Total cost is $13.95");
	  			if (hours < 10) {																//case for package B using less than 10 hours
	  				System.out.println("You should purchase Package A if you continue to use 10 or less hours.");
	  			}
	  		}
	  		if (hours > 20) {																	//case for package B using more than 20 hours
	  			cost = 13.95 + (hours - 20);													//calculating cost
	  			System.out.println("Total cost is " + cost);
	  			if (cost > 19.95) {
	  				savings = cost -19.95;														//calculating savings
	  				System.out.printf("Customer can save $%.2f if he purchases Package C \n", savings);	
	  			}
	  		}
	  		
	  		System.out.println("Good Bye");
	  		
	  		break;
	  	case 'C':
	  		System.out.println("Total cost is $19.95");
	  		
	  		break;
	  	default: 
	  		System.out.println("Error! Enter a valid package!");
	  		
	  }
	  
	  
	  
	  input.close();
	  
   }
}
