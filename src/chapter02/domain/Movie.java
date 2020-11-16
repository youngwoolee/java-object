package chapter02.domain;

import java.time.Duration;

/**
 * 영화를 표현
 * 제목, 상영시간, 기본요금, 할인정책을 가지고 있음
 */
public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy dIscountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy dIscountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.dIscountPolicy = dIscountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        return fee.minus(dIscountPolicy.calculateDiscountAmount(screening));
    }
}
