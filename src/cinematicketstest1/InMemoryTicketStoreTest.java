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
public class InMemoryTicketStoreTest {
    
public static void main(String[] args) {
        TicketStore ticket_store = new InMemoryTicketStore();
        ticket_store.purchaseTickets(3, TicketStore.TicketType.CHILD);
        if (ticket_store.getTotalTicketPrice() != 12) {
            System.out.println("Expected 12 got " + ticket_store.getTotalTicketPrice());
        }
        ticket_store.purchaseTickets(4, TicketStore.TicketType.OAP);
        if (ticket_store.getTotalTicketPrice() != 36) {
            System.out.println("Expected 36 got " + ticket_store.getTotalTicketPrice());
        }
 }
}
