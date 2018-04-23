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
        TicketStore ticketStore = new InMemoryTicketStore();
        ticketStore.purchaseTickets(3, TicketStore.TicketType.CHILD, TicketStore.DayOfWeek.FRIDAY);
        if (ticketStore.getTotalTicketPrice() != 12) {
            System.out.println("Expected 12 got " + ticketStore.getTotalTicketPrice());
        }
        ticketStore.purchaseTickets(4, TicketStore.TicketType.OAP, TicketStore.DayOfWeek.WEDNESDAY);
        if (ticketStore.getTotalTicketPrice() != 28) {
            System.out.println("Expected 36 got " + ticketStore.getTotalTicketPrice());
        }
 }
}
