package com.luv2code.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.luv2code.springboot.cruddemo.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>{

}
