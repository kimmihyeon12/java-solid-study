package com.hohocompany.study0707.discount;

import com.hohocompany.study0707.member.Member;

public interface DiscountPolicy {
    //return 할인대상금액
    int discount(Member member , int price);
}
