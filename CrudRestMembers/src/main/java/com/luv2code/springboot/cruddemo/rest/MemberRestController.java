package com.luv2code.springboot.cruddemo.rest;

import com.luv2code.springboot.cruddemo.entity.Member;
import com.luv2code.springboot.cruddemo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MemberRestController {

    private MemberService memberService;

    @Autowired
    public MemberRestController(MemberService theMemberService) {
        memberService = theMemberService;
    }

    // expose "/employees" and return a list of employees
    @GetMapping("/members")
    public List<Member> findAll() {
        return memberService.findAll();
    }

    // add mapping for GET /employees/{memberId}

    @GetMapping("/members/{memberId}")
    public Member getMember(@PathVariable int memberId) {

        Member theMember = memberService.findById(memberId);

        if (theMember == null) {
            throw new RuntimeException("Member id not found - " + memberId);
        }

        return theMember;
    }

    // add mapping for POST /employees - add new employee

    @PostMapping("/members")
    public Member addMember(@RequestBody Member theMember) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theMember.setId(0);

        Member dbMember = memberService.save(theMember);

        return dbMember;
    }

    // add mapping for PUT /employees - update existing employee

    @PutMapping("/members")
    public Member updateEmployee(@RequestBody Member theMember) {

        Member dbMember = memberService.save(theMember);

        return dbMember;
    }

    // add mapping for DELETE /employees/{memberId} - delete employee

    @DeleteMapping("/members/{memberId}")
    public String deleteEmployee(@PathVariable int memberId) {

        Member tempMember = memberService.findById(memberId);

        // throw exception if null

        if (tempMember == null) {
            throw new RuntimeException("Member id not found - " + memberId);
        }

        memberService.deleteById(memberId);

        return "Deleted employee id - " + memberId;
    }

}














