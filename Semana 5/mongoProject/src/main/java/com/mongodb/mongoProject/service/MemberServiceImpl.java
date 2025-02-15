package com.mongodb.mongoProject.service;

import com.mongodb.mongoProject.collection.Member;
import com.mongodb.mongoProject.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MemberServiceImpl implements MemberService {
    @Autowired
    private MemberRepository memberRepository;
    @Override
    public String save(Member member){
        memberRepository.save(member);
        return member.getPersonId();
    }

    @Override
    public List<Member> getPersonStartsWith(String name){
        return memberRepository.findByFirstNameStartsWith(name);
    }

    @Override
    public void delete(String id){
        memberRepository.deleteById(id);
    }
}
