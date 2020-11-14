package domain;

/**
 * 관람객을 표현
 * 소지품을 보관하기위한 Bag 소지
 */
public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        if(bag.hasInvitation()) {
            bag.setTicket(ticket);
            return 0L;
        }
        else {
            bag.setTicket(ticket);
            bag.minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }
}
