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
    
public class InMemoryTicketStore implements TicketStore {
    int num_tickets_bought = 0;
    @Override
    public void addTicketOrder() {
        num_tickets_bought++;
    };
    @Override
    public int getNumTicketsOrdered() {
        return num_tickets_bought;
    };
}
