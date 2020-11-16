package chapter02.domain;

/**
 * 예약을 표현
 * 고객, 상영정보, 예매 요금, 인원 수를 가지고 있음
 */
public class Reservation {
    private Customer customer;
    private Screening screening;
    private Money fee;
    private int audienceCount;

    public Reservation(Customer customer, Screening screening, Money fee, int audienceCount) {
        this.customer = customer;
        this.screening = screening;
        this.fee = fee;
        this.audienceCount = audienceCount;
    }
}
