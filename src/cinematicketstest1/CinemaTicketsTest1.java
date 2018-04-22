// QA Pre Interview Assessment Exercise for BAE Training Scheme
//Define the following key Object Orientated Programming (OOP) principles with examples:
//These concepts will be discussed further if you are invited to an assessment day.
//Exercise 1
//
//Encapsulation
//
//Inheritance
//
//Polymorphism
//
//Abstraction
//
//QA Cinemas is a well-known company in the Cinema industry that has been running since 1859. 
//Currently the company do all their ticket pricing manually, 
//and therefore, they want to commission an external party to build an electronic system 
//to replace this outdated manual process.
//
//You are required to create a simple prototype cinema system that provide the ability 
//to purchase tickets and return the total price of a customer’s order.
//Ticket prices for all movies at this cinema are as follows:
//
//Ticket prices:
//
//Standard - £8
//
//OAP - £6
//
//Student - £6
//
//Child - £4
//
//QA Cinemas also offers a discount each Wednesday where every ticket is £2 cheaper.
//
//For example, if a family consisting of a standard admission, a student and a child attended 
//an appropriate film showing on a Monday. The program would output something similar to the following:
//•
//The total cost of tickets for this movie is £18.
//
//You are required to create a java project that meets the requirements outlined above.
//We expect a minimum of 4 classes to be created and for you to utilise the concepts outlined in exercise 1.
//
//Both exercises should be submitted on Github for review. 
//Exercise 1 can be published as a text file, and exercise 2 by committing the relevant source code 
//to a Github repository.
//
package cinematicketstest1;

/**
 *
 * @author Nick
 */

import java.util.*;
import java.io.*;     
        
public class CinemaTicketsTest1 {

    public static void main(String[] args) {
//      Console console = System.console();
//      if (console == null) {
//          System.out.println("No console: non-interactive mode!");
//          System.exit(0);
//      }

      Scanner user_input = new Scanner(System.in);

      TicketStore ticket_store = new InMemoryTicketStore();
      boolean checkout = false;
      while(!checkout) {
          System.out.println("What do you want to do?");
          System.out.println("1. Buy another ticket.");
          System.out.println("2. Check out.");
          System.out.println();
          System.out.println ("Enter a selection (1, 2):");
//          String response = console.readLine("Enter a selection (1, 2): ");
          int command = 0;
          String response = user_input.next();
          try {
            command = Integer.parseInt(response);
          } catch(NumberFormatException e) {
            System.out.println("'" + response + "' is not one of (1, 2).");
            continue;
          }
          switch(command) {
            case 1:
              ticket_store.addTicketOrder();
              System.out.println("Added another ticket to your order.");
              continue;
            default:
              checkout = true;
          }
      }
      System.out.println("You purchased " + ticket_store.getNumTicketsOrdered() + " tickets.");
    }

}





        
