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
        
public class CinemaTicketsTest1 {

    public static void main(String[] args) {

      Scanner userInput = new Scanner(System.in);
      TicketStore ticketStore = new InMemoryTicketStore();
      boolean checkout = false;
      int command = 0;
                
          System.out.println("Which day of the week would you like to purchase tickets for?");
          String dayOfWeek = "";
          dayOfWeek = userInput.next().toUpperCase();
//     need to have code to error check that user has typed one of the days of the week correctly
//     didn't have time to research how to check whether dayOfWeek is the list {MONDAY,... SUNDAY}
//     have seen that the program crashes when something like xxx is entered for day of the week
//     think I could create a string array, populated with "MONDAY", "TUESDAY", etc
//     and then check if dayofWeek is contained in this array, but have now run out of time.
                   
      while(!checkout) {    
          System.out.println("Which type of ticket would you like to buy?");
          System.out.println("1. A Standard ticket @ £8 per ticket.");
          System.out.println("2. A OAP ticket @ £6 per ticket.");
          System.out.println("3. A Student ticket @ £6 per ticket.");
          System.out.println("4. A Child ticket @ £4 per ticket.");
          System.out.println("5. Check out.");
          System.out.println();
          System.out.println ("Enter a selection between 1 to 5:");
                   
          String response = userInput.next();
          
          try {
            command = Integer.parseInt(response);
          } catch(NumberFormatException e) {
            System.out.println("'" + response + "' is not betwen 1 to 5");
            continue;
          }
          switch(command) {
            case 1:
              ticketStore.addTicketOrder();
              ticketStore.purchaseTickets(1, TicketStore.TicketType.STANDARD, TicketStore.DayOfWeek.valueOf(dayOfWeek));
              System.out.println("Added another Standard ticket to your order.");
              System.out.println();
              break;
            case 2:
              ticketStore.addTicketOrder();
              ticketStore.purchaseTickets(1, TicketStore.TicketType.OAP, TicketStore.DayOfWeek.valueOf(dayOfWeek));
              System.out.println("Added another OAP ticket to your order.");
              System.out.println();
              break;
            case 3:
              ticketStore.addTicketOrder();
              ticketStore.purchaseTickets(1, TicketStore.TicketType.STUDENT, TicketStore.DayOfWeek.valueOf(dayOfWeek));
              System.out.println("Added another Student ticket to your order.");
              System.out.println();
              break;
            case 4:
              ticketStore.addTicketOrder();
              ticketStore.purchaseTickets(1, TicketStore.TicketType.CHILD, TicketStore.DayOfWeek.valueOf(dayOfWeek));
              System.out.println("Added another Child ticket to your order.");
              System.out.println();
              break;
            default:
              checkout = true;
          }
      }
      System.out.println("You purchased " + ticketStore.getNumTicketsOrdered() + " tickets.");
      System.out.println("The total cost of  your tickets is £" + ticketStore.getTotalTicketPrice());
    }

}
        





        
