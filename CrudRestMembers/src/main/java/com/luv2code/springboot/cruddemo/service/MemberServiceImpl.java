package com.luv2code.springboot.cruddemo.service;

import com.luv2code.springboot.cruddemo.dao.MemberDAO;
import com.luv2code.springboot.cruddemo.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

    private MemberDAO memberDAO;

    @Autowired
    public MemberServiceImpl(MemberDAO theMemberDAO) {
        memberDAO = theMemberDAO;
    }

    @Override
    public List<Member> findAll() {
        return memberDAO.findAll();
    }

    @Override
    public Member findById(int theId) {
        return memberDAO.findById(theId);
    }

    @Transactional
    @Override
    public Member save(Member theMember) {
        return memberDAO.save(theMember);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        memberDAO.deleteById(theId);
    }
}






