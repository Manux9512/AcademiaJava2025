package com.mongodb.mongoProject.repository;


import com.mongodb.mongoProject.collection.Member;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// MemberRepository interface that finds members by first name
@Repository
public interface MemberRepository extends MongoRepository<Member, String> {
    List<Member> findByFirstNameStartsWith(String name);
}