package chapter01.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 매표소를 구현
 * 판매하거나 교환해 줄 티켓의 목록과 판매 금액을 인스턴스 변수로 가짐
 */
public class TicketOffice {

    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket ... tickets) {
        this.amount = amount;
        this.tickets.addAll(Arrays.asList(tickets));
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    private void plusAmount(Long amount) {
        this.amount += amount;
    }

    //TODO: audience와 의존성이 생겨버림
    public void sellToTicketTo(Audience audience) {
        plusAmount(audience.buy(getTicket()));
    }
}
