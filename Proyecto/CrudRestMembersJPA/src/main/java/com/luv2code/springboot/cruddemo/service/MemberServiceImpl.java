package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.MemberRepository;
import com.luv2code.springboot.cruddemo.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberRepository memberRepository;

    @Autowired
    public MemberServiceImpl(MemberRepository theMemberRepository) {
        memberRepository = theMemberRepository;
    }

    @Override
    public List<Member> findAll() {
        return memberRepository.findAll();
    }

    @Override
    public Member findById(int theId) {
        Optional<Member> result = memberRepository.findById(theId);
        Member theMember = null;

        if (result.isPresent()) {
            theMember = result.get();
        }
        else {
            throw new RuntimeException("Did not find employee id - " + theId);
        }

        return theMember;
    }

    @Transactional
    @Override
    public Member save(Member theMember) {
        return memberRepository.save(theMember);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        memberRepository.deleteById(theId);
    }
}






