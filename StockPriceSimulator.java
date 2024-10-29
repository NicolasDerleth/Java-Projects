/* ========================================================================== */
/*	PROGRAM Stock Price Simulator

    AUTHOR: <Nicolas Derleth, Kolin Scharnhorst>
    COURSE NUMBER: <CIS 210>
    COURSE SECTION NUMBER: <01D>
    INSTRUCTOR NAME: <Professor Tian>
    PROJECT NUMBER: 6
    DUE DATE: 12/10/2021

SUMMARY

The program will ask the user to enter a stock's name, symbol, and current price. 
The program will display the stock’s name, symbol, current price,
 next price, price change, and price change percentage for each day on the console.

INPUT


-The Stock's Name
-The Stock's Symbol
-The Stock's Current Price

OUTPUT

The program outputs the amount that is being bet, the selection you picked as your word
and if you would like to play again. It also will tell you how much money you currently
have and how much each bet will cost to play it.

ASSUMPTIONS

The stocks exist

/* MAIN FUNCTION */

//Scanner is used to input values.
 

import java.util.Scanner; // allows for Scanner object to be used




				

public class StockPriceSimulator
{
	public static void main(String [] args) {
		  
		   

		   // print an introductory message output heading 
		     System.out.println("Welcome to the Stock Price Simulator!\n");
		     System.out.println("The user will be asked to enter the stock name,  ");
		     System.out.println("the stock symbol, and the current price of the stock. ");
		     System.out.println("The program will return the current price,");
		     System.out.println("the price of the next day, the change in price, ");
		     System.out.println("and the change in the price percentage.");
		     System.out.println("The program will display the stock's next 30 days.\n");
		     System.out.println("==================================================");
		     
		     
		     System.out.println("\t--Stock Price Simulation--");
		        Scanner input = new Scanner(System.in);
		        System.out.println("Enter Stock Name: ");
		        String stockName = input.next();
		        System.out.println("Enter Stock Symbol: ");
		        String symbol = input.next();
		        System.out.println("Enter Current Stock Price: ");
		        float currentPrice = input.nextFloat();
		        Stock stock;
		        
		        if(stockName.equals("NONE") || symbol.equals("NA") || currentPrice == 0.0){
		            stock = new Stock();
		            //Bike1 b = new Bike1();  
		        
		        }
		        else{
		            stock = new Stock(stockName, symbol, currentPrice, currentPrice);
		            
		        }
		        
		            // loop for 30 count
		        	
		            System.out.println("\t--30 Days Simulation--");
		            
		            for(int i = 1; i <= 30; i++){
		            	
		              
		                float price = stock.simulatePrice();
		               
		                
		                System.out.println("--Day-" + i + "--");
		                System.out.println("Stock Name: " + stock.getName());
		                System.out.println("Stock Symbol: " + stock.getSymbol());
		                System.out.printf("Stock Current Price: $%.2f\n", stock.getCurrentPrice());
		                System.out.printf("Stock Next Price: $%.2f\n", stock.getNextPrice());
		                System.out.printf("Price Change: $%.2f\n", stock.getPriceChange());
		                System.out.printf("Price Change Percentage: %.2f", stock.getPercentChange());
		                System.out.println("%");
		                System.out.println("===============================================================================");
		                // set stock current price to new price
		                stock.setCurrentPrice(price);
		                
		                input.close();
		            }
		        
		    }
}