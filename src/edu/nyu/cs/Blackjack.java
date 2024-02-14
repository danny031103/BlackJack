package edu.nyu.cs;

import java.util.Scanner;
import java.util.Random;


/**
 * A variation of the game of Blackjack.  
 * Complete this program according to the instructions in the README.md file as well as within the given comments below.
 */
public class Blackjack {

  //private static final String T = null;

  /**
   * The main function is automatically called first in a Java program.
   * 
   * @param args An array of any command-line arguments.
   */
  public static void main(String[] args) throws Exception {

//WELCOME MESSAGE
    System. out.println("Welcome to Blackjack!");

//RANDOM TO MAKE CARDS AND DEALER CHOICE
    Random random = new Random();

//USER CARD VARIABLES
    int usercard1= (int) (Math.random() * 11) + 1;
    int usercard2= (int) (Math.random() * 11) + 1;
    int usercard3= (int) (Math.random() * 11) + 1;
    int usercard4= (int) (Math.random() * 11) + 1;
    int usercard5= (int) (Math.random() * 11) + 1;
    int usercard6= (int) (Math.random() * 11) + 1;
    int usercard7= (int) (Math.random() * 11) + 1;

//DEALER CARD VARIABLES
    int dealercard1= (int) (Math.random() * 11) + 1;
    int dealercard2= (int) (Math.random() * 11) + 1;
    int dealercard3= (int) (Math.random() * 11) + 1;
    int dealercard4= (int) (Math.random() * 11) + 1;
    int dealercard5= (int) (Math.random() * 11) + 1;
    int dealercard6= (int) (Math.random() * 11) + 1;
    int dealercard7= (int) (Math.random() * 11) + 1;

//USER TOTAL VARIABLE
    int user_total=usercard1+usercard2;

//DEALER TOTAL VARIABLE
    int dealer_total=dealercard1+dealercard2;

//SHOW THE USER THEIR CARDS
    System. out.println("Your cards are: "+usercard1+" and "+usercard2);

// HIT COUNTER VARIABLE
    int hitcounter=0;
    int dealerhitcounter=0;

//BUST VARIABLE
    int userbust=0;
//LOOPING VARIABLE
    boolean userlooper = true;
    boolean dealerlooper=true;

//WHILE LOOP FOR PLAYER AND ASK FOR HIT OR STAND
    while (userlooper) {
      System.out.println("Would you like to hit or stand? ");
      Scanner stringScanner = new Scanner(System.in);
      String hit_or_stand = stringScanner.next();
      hitcounter++;


      if (user_total>21) {
        System.out.println("Your cards are: "+usercard1+" and "+usercard2);
        System.out.println("You have bust!");
        System.out.println("Dealer Wins!");
        userbust+=1;
        break;
      }

  //IF STATEMENT FOR IF THE USER HITS ONCE
      if ( hit_or_stand.equals("hit") & hitcounter==1) {
        user_total+=usercard3;

//IF STATEMENT FOR USER BUSTING AFTER ONE HIT
        if (user_total>21 & hitcounter==1) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3);
          System.out.println("You have bust!");
          System.out.println("Dealer Wins!");
          userbust+=1;
          break;
        }

  //IF STATEMENT FOR USER BLACKJACK AFTER ONE HIT
        else if (user_total==21 & hitcounter==1) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3);
          System.out.println("You win!");
          break;
        }
  //IF STATEMENT FOR USER NEITHER LOSING OR WINNING AFTER ONE HIT
        else {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3);
          continue;
        }
      }
  //IF STATEMENT FOR IF THE USER HITS TWICE
        if ( hit_or_stand.equals("hit") & hitcounter==2) {
          user_total+=usercard4;

  //IF STATEMENT FOR USER BUSTING AFTER TWO HITS
        if (user_total>21 & hitcounter==2) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", and "+usercard4);
          System.out.println("You have bust!");
          System.out.println("Dealer Wins!");
          userbust+=1;
          break;
        }

  //IF STATEMENT FOR USER BLACKJACK AFTER TWO HITS
        else if (user_total==21 & hitcounter==2) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", and "+usercard4);
          System.out.println("You win!");
          break;
        }
  //IF STATEMENT FOR USER NEITHER LOSING OR WINNING AFTER TWO HITS
        else {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", and "+usercard4);
          continue;
        }
    }

  //IF STATEMENT FOR IF THE USER HITS THREE TIMES
        if ( hit_or_stand.equals("hit") & hitcounter==3) {
          user_total+=usercard5;

  //IF STATEMENT FOR USER BUSTING AFTER THREE HITS
        if (user_total>21 & hitcounter==3) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", and "+usercard5);
          System.out.println("You have bust!");
          System.out.println("Dealer Wins!");
          userbust+=1;
          break;
        }

  //IF STATEMENT FOR USER BLACKJACK AFTER THREE HITS
        else if (user_total==21 & hitcounter==3) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", and "+usercard5);
          System.out.println("You win!");
          break;
        }
  //IF STATEMENT FOR USER NEITHER LOSING OR WINNING AFTER THREE HITS
        else {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", and "+usercard5);
          continue;
        }
    }  

  //IF STATEMENT FOR IF THE USER HITS FOUR TIMES
        if ( hit_or_stand.equals("hit") & hitcounter==4) {
          user_total+=usercard6;

  //IF STATEMENT FOR USER BUSTING AFTER FOUR HITS
        if (user_total>21 & hitcounter==4) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", and "+usercard6);
          System.out.println("You have bust!");
          System.out.println("Dealer Wins!");
          userbust+=1;
          break;
        }

  //IF STATEMENT FOR USER BLACKJACK AFTER FOUR HITS
        else if (user_total==21 & hitcounter==4) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", and "+usercard6);
          System.out.println("You win!");
          break;
        }
  //IF STATEMENT FOR USER NEITHER LOSING OR WINNING AFTER FOUR HITS
        else {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", and "+usercard6);
          continue;
        }
    }

//IF STATEMENT FOR IF THE USER HITS FIVE TIMES
        if ( hit_or_stand.equals("hit") & hitcounter==5) {
          user_total+=usercard7;

      //IF STATEMENT FOR USER BUSTING AFTER FIVE HITS
        if (user_total>21 & hitcounter==5) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
          System.out.println("You have bust!");
          System.out.println("Dealer Wins!");
          userbust+=1;
          break;
        }

      //IF STATEMENT FOR USER BLACKJACK AFTER FIVE HITS
        else if (user_total==21 & hitcounter==5) {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
          System.out.println("You win!");
          break;
        }
      //IF STATEMENT FOR USER NEITHER LOSING OR WINNING AFTER FIVE HITS
        else {
          System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
          continue;
        }
      }

  //ELSE STATEMENT FOR IF THE USER STANDS  
      else {
        break;
      }
    }

  //DEALER WHILE LOOP TO START AFTER THE USER IS DONE
  //DEALER CHOICE 1 IS HIT
  //DEALER CHOICE 2 IS STAND
  if (user_total<21) {
    while (dealerlooper) {
      int dealerchoice= (int) (Math.random() * 2) + 1;

  //DEALER BUSTS WITH FIRST TWO CARDS
      if (dealercard1+dealercard2>21) {
        System.out.println("The dealer's cards are: "+dealercard1+" and "+dealercard2);
        System.out.println("The dealer has bust.");
        System.out.println("You win!");
        break;
      }
  
  //DEALER DOESNT PLAY BECAUSE USER WON
      if (usercard1+usercard2==21) {
        System.out.println("The dealer's cards are: "+dealercard1+" and "+dealercard2);
        System.out.println("You win!");
        break;
      }

  //DEALER DOESNT PLAY BECAUSE USER WON PT2
      if (user_total==21) {
        System.out.println("The dealer's cards are: "+dealercard1+" and "+dealercard2);
        System.out.println("You win!");
        break;
      }

  //DEALER HITS
      if ((dealerchoice==1)& userbust!=1){
        dealerhitcounter+=1;
        System.out.println("The dealer hits.");
    
  //DEALER FIRST HIT
        if (dealerhitcounter==1) {
          dealer_total+=dealercard3;

          if ((dealer_total==21)&(user_total!=21)) {
            System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
            System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", and "+dealercard3);
            System.out.println("Dealer wins!");
            break;
          }
          else if (dealer_total>21) {
            System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
            System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", and "+dealercard3);
            System.out.println("The dealer has bust.");
            System.out.println("You win!");
            break;
          }
          else {
            continue;
          }
        }

  //DEALER SECOND HIT
        if ((dealerhitcounter==2)&(userbust!=1)) {
          dealer_total+=dealercard4;

          if ((dealer_total==21)&(user_total!=21)) {
            System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
            System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", and "+dealercard4);
            System.out.println("Dealer wins!");
            break;
          }
          else if (dealer_total>21) {
            System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
            System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", and "+dealercard4);
            System.out.println("The dealer has bust!");
            System.out.println("You win!");
            break;
          }
          else {
            continue;
          }
        }
 
      ///DEALER THIRD HIT
        if (dealerhitcounter==3) {
          dealer_total+=dealercard5;

          if ((dealer_total==21)&(user_total!=21)) {
            System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
            System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", "+dealercard4+", and "+dealercard5);
            System.out.println("Dealer wins!");
            break;
          }
          else if (dealer_total>21) {
            System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
            System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", "+dealercard4+", and "+dealercard5);
            System.out.println("The dealer has bust!");
            System.out.println("You win!");
            break;
          }
          else {
            continue;
          }
        }
  
      ///DEALER FOURTH HIT
          if (dealerhitcounter==4) {
            dealer_total+=dealercard6;

            if ((dealer_total==21)&(user_total!=21)) {
              System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
              System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", "+dealercard4+", "+dealercard5+", and "+dealercard6);
              System.out.println("Dealer wins!");
              break;
            }
            else if (dealer_total>21) {
              System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
              System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", "+dealercard4+", "+dealercard5+", and "+dealercard6);
              System.out.println("The dealer has bust!");
              System.out.println("You win!");
              break;
            }
            else {
              continue;
            }
          }
        ///DEALER FIFTH HIT
          if (dealerhitcounter==5) {
            dealer_total+=dealercard7;

            if ((dealer_total==21)&(user_total!=21)) {
              System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
              System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", "+dealercard4+", "+dealercard5+", "+dealercard6+", and "+dealercard7);
              System.out.println("Dealer wins!");
              break;
            }
            else if (dealer_total>21) {
              System.out.println("Your cards are: "+usercard1+", "+usercard2+", "+usercard3+", "+usercard4+", "+usercard5+", "+usercard6+", and "+usercard7);
              System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", "+dealercard4+", "+dealercard5+", "+dealercard6+", and "+dealercard7);
              System.out.println("The dealer has bust.");
              System.out.println("You win!");
              break;
            }
            else {
              continue;
            }
          }

      }
  //DEALER STANDS
      else if (dealerchoice==2 & userbust!=1) {
        System.out.println("The dealer stands.");
        if (dealerhitcounter==0){
          System.out.println("The dealer's cards are: "+dealercard1+" and "+dealercard2);
          break;
        }
        else if (dealerhitcounter==1) {
          System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", and "+dealercard3);
          break;
        }
        else if (dealerhitcounter==2) {
          System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", and "+dealercard4);
          break;
        }
        else{
          System.out.println("The dealer's cards are: "+dealercard1+", "+dealercard2+", "+dealercard3+", "+dealercard4+", and "+dealercard5);
          break;
        }
       
      }
      else {
        break;
      }
    }
  }
////////////SCENARIOS///////////

  //TIE GAME
    if (dealer_total==user_total) {
      System.out.println("Tie!");
    }
  
  //BOTH UNDER 21 BUT USER IS HIGHER
    if (dealer_total<user_total & user_total<=21 & dealer_total<21) {
      System.out.println("You Win!");
    }

  //BOTH UNDER 21 BUT DEALER HIGHER
    if (dealer_total>user_total & dealer_total<=21 & user_total<21) {
      System.out.println("Dealer wins!");
    }

  //BOTH UNDER 21 BUT EQUAL
    if (dealercard1+dealercard2==usercard1+usercard2 & user_total<=21 & dealer_total<=21) {
      System.out.println("Tie!");
    }

  //DEALER BUSTS WITH FIRST TWO CARDS AND USER DOESNT
    if (dealercard1+dealercard2>21 & usercard1+usercard2<=21){
      System.out.println("The dealer has bust.");
      System.out.println("You win!");
    }

  //USER BUSTS WITH FIRST TWO CARDS AND USER DOESNT
    if (dealercard1+dealercard2<=21 & usercard1+usercard2>21) {
      System.out.println("You have bust!");
      System.out.println("Dealer wins!");
    }

  //USER BUSTS AND DEALER DOESNT
    if (user_total>21 & dealer_total<=21) {
      System.out.println("You have bust!");
      System.out.println("Dealer wins!");
    }
  
  //DEALER BUSTS AND USER DOESNT
    if (dealer_total>21 & user_total<=21) {
      System.out.println("The dealer has bust.");
      System.out.println("You win!");
    }
    
  //USER BUSTS
    if (user_total>21 || usercard1+usercard2>21) {
      System.out.println("You have bust!");
      System.out.println("Dealer wins!");
    }

  //USER IS UNDER 21 AND DEALER DID NOT BUST OR DID BUST
    if (user_total<21 & (dealer_total<user_total || dealer_total>21)) {
      System.out.println("The dealer's cards are: "+dealercard1+" and "+dealercard2);
      System.out.println("You win!");
    }
  } 
  
}