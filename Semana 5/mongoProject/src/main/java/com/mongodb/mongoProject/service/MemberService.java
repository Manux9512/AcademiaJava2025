package com.mongodb.mongoProject.service;
import com.mongodb.mongoProject.collection.Member;
import java.util.List;

// This is a service interface
public interface MemberService {
    // Save a member
    String save(Member member);
    // Get a list of members starting with the given name
    List<Member> getPersonStartsWith(String name);
    // Delete a member with the given id
    void delete (String id);

}
