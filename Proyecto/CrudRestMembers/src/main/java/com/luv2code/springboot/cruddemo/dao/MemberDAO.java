package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Member;

import java.util.List;

public interface MemberDAO {

    List<Member> findAll();

    Member findById(int theId);

    Member save(Member theMember);

    void deleteById(int theId);
}










