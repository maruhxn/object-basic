package com.maruhxn.reservation;

public interface DiscountCondition {
    boolean isSatisfiedBy(Screening screening);
}