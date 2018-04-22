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
    }
    
    void addTicketOrder();
    int getNumTicketsOrdered();
    void purchaseTickets (int Tickets, TicketType ticket_type);
    int getTotalTicketPrice ();
   
}
