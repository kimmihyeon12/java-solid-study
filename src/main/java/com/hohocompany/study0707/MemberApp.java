package com.hohocompany.study0707;

import com.hohocompany.study0707.member.Grade;
import com.hohocompany.study0707.member.Member;
import com.hohocompany.study0707.member.MemberService;
import com.hohocompany.study0707.member.MemberServiceImpl;

public class MemberApp {
    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl(memberRepository);
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

       Member findMember = memberService.findMember(1L);
        System.out.println("new member = " + member.getName());
        System.out.println("find Member = " + findMember.getName());
    }
}
