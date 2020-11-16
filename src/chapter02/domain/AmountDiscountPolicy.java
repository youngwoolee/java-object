package chapter02.domain;

/**
 * 금액을 할인해주는 할인정책 표현
 * 할인금액을 가지고 있음
 */
public class AmountDiscountPolicy extends DiscountPolicy{

    private Money discountAmount;

    public AmountDiscountPolicy(Money discountAmount, DiscountCondition... conditions) {
        super(conditions);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money getDiscountAmount(Screening screening) {
        return discountAmount;
    }
}
