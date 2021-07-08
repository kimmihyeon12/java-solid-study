package com.hohocompany.study0707.member;

public interface MemberService {
    void join(Member member);
    Member findMember(Long memberId);
}
