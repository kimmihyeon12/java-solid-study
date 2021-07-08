package com.hohocompany.study0707.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
