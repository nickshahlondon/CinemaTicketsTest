/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinematicketstest1;

/**
 *
 * @author Nick
 */
public interface TicketStore {
    enum TicketType {STANDARD, OAP, STUDENT, CHILD
    };
    enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    };

    
    void addTicketOrder();
    int getNumTicketsOrdered();
    void purchaseTickets (int Tickets, TicketType ticketType, DayOfWeek dayOfWeek );
    int getTotalTicketPrice ();
   
}
