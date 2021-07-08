package com.hohocompany.study0707.discount;

import com.hohocompany.study0707.member.Grade;
import com.hohocompany.study0707.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{
    private final int discountFixAmount = 1000;
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade()== Grade.VIP){
            return  discountFixAmount;
        }else return 0;


    }
}
