package com.hohocompany.study0707;

import com.hohocompany.study0707.discount.FixDiscountPolicy;
import com.hohocompany.study0707.member.MemberService;
import com.hohocompany.study0707.member.MemberServiceImpl;
import com.hohocompany.study0707.member.MemoryMemberRepository;
import com.hohocompany.study0707.order.OrderService;
import com.hohocompany.study0707.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService(){
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
    public OrderService orderService(){
        return new OrderServiceImpl(new MemoryMemberRepository(),new FixDiscountPolicy());
    }
}
