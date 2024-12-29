package com.maruhxn.reservation;

import com.maruhxn.generic.Money;

import java.util.List;

public abstract class DiscountPolicy {
    private List<DiscountCondition> conditions;

    public Money calculateDiscount(Screening screening) {
        for (DiscountCondition each : conditions) {
            if (each.isSatisfiedBy(screening)) {
                return getDiscountAmount(screening);
            }
        }

        return Money.ZERO;
    }

    abstract protected Money getDiscountAmount(Screening screening);
}