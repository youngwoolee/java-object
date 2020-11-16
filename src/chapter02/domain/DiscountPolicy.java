package chapter02.domain;

import javax.script.ScriptEngine;

public interface DiscountPolicy {
    Money calculateDiscountAmount(Screening screening);
}
