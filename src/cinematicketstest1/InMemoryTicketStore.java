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

    private Map<TicketType, Integer>ticketPrices;
    private int numTicketsBought = 0;
    private int totalPrice = 0;
    private static final int WED_DISCOUNT = 2;
    
    public InMemoryTicketStore() {
      ticketPrices = new HashMap<TicketStore.TicketType, Integer>();
      ticketPrices.put(TicketType.STANDARD, 8);
      ticketPrices.put(TicketType.OAP, 6);
      ticketPrices.put(TicketType.STUDENT, 6);
      ticketPrices.put(TicketType.CHILD, 4);
 }

    @Override
    public void addTicketOrder() {
        numTicketsBought++;
    };
    @Override
    public int getNumTicketsOrdered() {
        return numTicketsBought;
    };
    @Override
    public void purchaseTickets (int Tickets, TicketType ticketType, DayOfWeek dayOfWeek){
        if (dayOfWeek == DayOfWeek.WEDNESDAY) {
                totalPrice += Tickets * (ticketPrices.get(ticketType) - WED_DISCOUNT);
    }
        else    totalPrice += Tickets * ticketPrices.get(ticketType);
    }
    @Override
    public int getTotalTicketPrice () {
        return totalPrice;
    };
}
