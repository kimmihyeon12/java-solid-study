package com.hohocompany.study0707;

import com.hohocompany.study0707.member.Grade;
import com.hohocompany.study0707.member.Member;
import com.hohocompany.study0707.member.MemberService;
import com.hohocompany.study0707.member.MemberServiceImpl;
import com.hohocompany.study0707.order.Order;
import com.hohocompany.study0707.order.OrderService;
import com.hohocompany.study0707.order.OrderServiceImpl;

public class OrderApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl(memberRepository);
        OrderService orderService = new OrderServiceImpl(memberRepository, discountPolicy);

        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(member.getId(),"itemA",20000);
        System.out.println("order = " + order.toString());
        System.out.println("order.calculatePrice = " + order.calculatePrice());


    }

}
