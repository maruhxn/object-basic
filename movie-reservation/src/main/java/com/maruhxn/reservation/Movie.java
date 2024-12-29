package com.maruhxn.reservation;

import com.maruhxn.generic.Money;

public class Movie {
    private String title;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money calculateFee(Screening screening) {
        return fee.minus(discountPolicy.calculateDiscount(screening));
    }

    public Money getFee() {
        return fee;
    }
}