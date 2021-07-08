package com.hohocompany.study0707.discount;

import com.hohocompany.study0707.member.Grade;
import com.hohocompany.study0707.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {
    private  int discountRercent = 10; // 할인율
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
        return (price/100)*discountRercent;
        }else {
            return  0;
        }
    }
}
