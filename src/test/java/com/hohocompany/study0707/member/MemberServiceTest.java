package com.hohocompany.study0707.member;

import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl(memberRepository);
    @Test
    void join(){
        //givien
        Member member = new Member(1L , "memberA" , Grade.VIP);
        //when
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        //Assertions.assertThat(member)
    }
}
