package com.luv2code.springboot.cruddemo.dao;

import com.luv2code.springboot.cruddemo.entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MemberDAOJpaImpl implements MemberDAO {

    // define field for entitymanager
    private EntityManager entityManager;


    // set up constructor injection
    @Autowired
    public MemberDAOJpaImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }


    @Override
    public List<Member> findAll() {

        // create a query
        TypedQuery<Member> theQuery = entityManager.createQuery("from Member", Member.class);

        // execute query and get result list
        List<Member> members = theQuery.getResultList();

        // return the results
        return members;
    }

    @Override
    public Member findById(int theId) {

        // get member
        Member theMember = entityManager.find(Member.class, theId);

        // return member
        return theMember;
    }

    @Override
    public Member save(Member theMember) {

        // save member
        Member dbMember = entityManager.merge(theMember);

        // return the dbMember
        return dbMember;
    }

    @Override
    public void deleteById(int theId) {

        // find member by id
        Member theMember = entityManager.find(Member.class, theId);

        // remove member
        entityManager.remove(theMember);
    }
}











