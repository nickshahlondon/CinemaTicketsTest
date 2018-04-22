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
import java.util.*;

public class InMemoryTicketStore implements TicketStore {

    private Map<TicketType, Integer>ticket_prices;
    private int num_tickets_bought = 0;
    private int total_price = 0;
    
    public InMemoryTicketStore() {
      ticket_prices = new HashMap<TicketStore.TicketType, Integer>();
      ticket_prices.put(TicketType.STANDARD, 8);
      ticket_prices.put(TicketType.OAP, 6);
      ticket_prices.put(TicketType.STUDENT, 6);
      ticket_prices.put(TicketType.CHILD, 4);
 }

    @Override
    public void addTicketOrder() {
        num_tickets_bought++;
    };
    @Override
    public int getNumTicketsOrdered() {
        return num_tickets_bought;
    };
    @Override
    public void purchaseTickets (int Tickets, TicketType ticket_type){
        total_price += Tickets * ticket_prices.get(ticket_type);
    }
    @Override
    public int getTotalTicketPrice () {
        return total_price;
    };
}
