package com.mongodb.mongoProject.controller;

import com.mongodb.mongoProject.collection.Member;
import com.mongodb.mongoProject.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    //Post request
    @PostMapping
    public String save (@RequestBody Member member){
        return memberService.save(member);
    }

    //Get request
    @GetMapping
    public List<Member> getPersonStartsWith(@RequestParam String name){
        return memberService.getPersonStartsWith(name);
    }

    //Delete request
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        memberService.delete(id);
    }
}
