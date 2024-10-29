/* ========================================================================== */
/*	PROGRAM Slot Machine Simulation

    AUTHOR: <Nicolas Derleth, Kolin Scharnhorst>
    COURSE NUMBER: <CIS 210>
    COURSE SECTION NUMBER: <01D>
    INSTRUCTOR NAME: <Professor Tian>
    PROJECT NUMBER: 4
    DUE DATE: 23/09/2021

SUMMARY
The program that simulates a slot machine. 
When the program runs, it should do the following:
-Read in the initial amount of money a user wants to enter into the slot
from an input file.
-Ask the user to enter the amount of money he or she wants to bet. The amount of money must be a multiple of $10.
The minimum is $10 and maximum is the amount of money the user currently has.
-Display a menu for the user to select a word from the following list:
	1.Cherry
	2.Orange
	3.Apple
	4.Peach
	5.Melon
	6.Pear
	-Ask the user to select one word by entering the number between 1 and 6.
	-Randomly select a word from the above list three times and display all three of the words.
	-If none of the randomly selected words match, the program will inform the user that he or she has won $0. 
	If one of the words match, the program will inform the user that he or she has won one time of the amount entered. 
	If two of the words match, the program will inform the user that he or she has won two times the amount entered. 
	If three of the words match, the program will inform the user that he or she has won three times the amount entered.
	-The program will ask whether the user wants to play again. If so, these steps are repeated. If not, the program 
	displays the total amount of money entered into the slot machine and the total amount won. 
INPUT

-The amount of money a user owns initially. It is read from a input file named input.txt
-Whether or not a user wants to play
-The amount of money he wants to bet each time
-The word a user selects

OUTPUT

The program outputs the amount that is being bet, the selection you picked as your word
and if you would like to play again. It also will tell you how much money you currently
have and how much each bet will cost to play it.

ASSUMPTIONS



/* MAIN FUNCTION */

//Scanner is used to input values.
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


				

public class HW4_Derleth_Nicolas_Scharnhorst_Kolin
{
	public static void main(String [] args) throws IOException {
		  
		//name variables
		   
		   char playAgain = 'y';								//variable for if user enter yes or no to playing
		   double userBet = 0;							//variable for the amount user is going to bet
		  							//variable for total money user has
		   String word = " ";							//String for the word user bets on
		   int wordIndex;								//variable so the words can be defined as a number 1-6.
		   String word1 = " ";
		   String word2 = " ";
		   String word3 = " ";
		   Random random = new Random();
		   double amountWon = 0;
		   int userWord;
		   String userwordBet = null;
		  
		   
		   // print an introductory message output heading 

		   // print an introductory message output heading 
		     System.out.println("Welcome to the Craps Game Simulator!\n");
		     System.out.println("The first player will be asked to call the size ");
		     System.out.println("of the bet they wish to make.");
		     System.out.println("The dice will roll and if the player wins,");
		     System.out.println("they will get to roll the dice again. ");
		     System.out.println("The program will tell you the roll of the dice");
		     System.out.println("and will let the player play until he loses.\n");
		     System.out.println("==================================================");
		     
		    Scanner input = new Scanner(System.in);
		    File newFile = new File("input (3).txt");
		    Scanner inputFile = new Scanner(newFile);
		    double userTotal = inputFile.nextDouble();
		    inputFile.close();
		    
		    PrintWriter outputFile = new PrintWriter("Output.txt");
		    
		    Double initialUserTotal = userTotal;
		    //input.txt file in order to determine total amount user has.
		    do{
		    	

		    	if (userTotal >= 0) {
				    
			    	 System.out.printf("You currently have $%.2f.\nYou can bet any multiple of 10.\n", userTotal);
					    System.out.printf("Enter 1 you bet $10\n");
					    System.out.printf("Enter 2 you bet $20, etc.\n");
					    System.out.println("How much do you want to bet: ");
					    userBet = input.nextDouble();
					    
					   
					    userBet = (userBet * 10);
					    System.out.println("1.Cherry");
					    System.out.println("2.Orange");
					    System.out.println("3.Apple");
					    System.out.println("4.Peach");
					    System.out.println("5.Melon");
					    System.out.println("6.Pear");
					    System.out.println("Choose a number to bet on that corresponds with one of the words: ");
					    userWord = input.nextInt();
					    if(userWord == 1) {
					    	userwordBet = "Cherry";
					    	
					    }else if(userWord == 2) {
					    	userwordBet = "Orange";
					    }else if(userWord == 3) {
					    	userwordBet = "Apple";
					    }else if(userWord == 4) {
					    	userwordBet = "Peach";
					    }else if(userWord == 5) {
					    	userwordBet = "Melon";
					    }else {
					    	userwordBet = "Pear";
					    }
					    
					    
					    	 
					    	 
					    	 
					    	 for (int wordCount = 1; wordCount <= 3; wordCount++) {
					    		 
					    		 wordIndex = random.nextInt(6);
								    
								    if (wordIndex == 0) {
								    	word = "Cherry";
								    }else if (wordIndex == 1) {
								    	word = "Orange";
								    }else if (wordIndex == 2){
								    	word = "Apple";
								    }else if (wordIndex == 3){
								    	word = "Peach";
								    }else if (wordIndex == 4){
								    	word = "Melon";
								    }else if (wordIndex == 5){
								    	word = "Pear";
								    }
								    
								    if (wordCount == 1) {
								    	word1 = word;
								    } else if(wordCount == 2){
								    	word2 = word;
								    } else if  (wordCount == 3) {
								    	word3 = word;
								    }
								    
					    		 
					    		 
					    	 }
					    	 
					    	 System.out.println("[" + word1 + "]\t[" + word2 + "]\t[" + word3 + "]");
					    	 
					    	 if ((userwordBet != word1) && (userwordBet != word2) && (userwordBet != word3)) {
					    		 System.out.printf("\n\nYou lost $%.2f \n", userBet);
					    		 amountWon = amountWon - userBet;
					    	 }else if ((userwordBet == word1) && (userwordBet != word2) && (userwordBet != word3) || (userwordBet == word2) && (userwordBet != word1) && (userwordBet != word3) || (userwordBet == word1) && (userwordBet != word2) && (userwordBet != word3)) {
					    		 System.out.printf("\n\nYou Won $%,.2f\n", (userBet * 1));
					    		 amountWon = amountWon + (userBet * 1);
					    		 
					    	 
					    		 
					    		 
					    	 }
					    	 else if(((userwordBet == word1) && (userwordBet == word2) && (userwordBet != word3)) || ((userwordBet == word3) && (userwordBet == word2) && (userwordBet != word1))|| ((userwordBet == word1) && (userwordBet == word3) && (userwordBet != word2))){
					    		 System.out.printf("\n\nYou Won $%,.2f\n", (userBet * 2));
					    		 amountWon = amountWon + (userBet * 2);
					    		 
					    	 }
					    	 else {
					    	 
					    		 System.out.printf("\n\nYou Won $%,.2f\n", (userBet * 3));
					    		 amountWon = amountWon + (userBet * 3);
					    	 }
					    	  userTotal =  userTotal + amountWon;
					    	 System.out.printf("\n\nAmount you started with: $%,.2f.\n The amount won so far is: $%,.2f.\n" ,initialUserTotal, amountWon);
							 
							 
						
					     if (amountWon <= 0) {
					    	 System.out.printf("You inserted $%.2f making a loss of $%.2f.\n Better luck next time!\n ", userBet, userBet);
					    	 
					     }else if (amountWon > userBet) {
					    	System.out.printf("You inserted $%.2f making a profit of $%.2f.\nCongratulations! \n", userBet, (amountWon - userBet));
					     }else {
					    	 System.out.printf("You inserted $%.2f and won $%.2f.\n No loss and No win.\nThanks for playing!\n ", userBet, amountWon);
					     }
					     
					   
					     
					     
					    	 
		    	
		    }
		    	
			    	
		
		    	 System.out.println("Do you want to play again? (y or n):");
			     playAgain = input.next().charAt(0);
			     outputFile.println(userTotal);
				  outputFile.println(userBet);
				    outputFile.println(userwordBet);
				    outputFile.println(amountWon);
			     
		    	
		    	
		    		
		    }while (playAgain == 'y' || playAgain == 'Y'); 
		   
		   outputFile.close();
		   input.close();
	}
	
	
		
	}

	
		    	  


					   
					 
					