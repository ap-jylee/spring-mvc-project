package com.cbnu.sample.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cbnu.sample.entity.Member;
import com.cbnu.sample.service.MemberService;

@Controller
@RequestMapping("members")
public class MemberController {

	private final MemberService memberService;
	
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
	
	@GetMapping
	public String member(Model model) {
		List<Member> members = memberService.getMembers();
		Member member = memberService.getMember("e200uk");
		model.addAttribute("members", members);
		model.addAttribute("member", member);
		return "member";
	}
	
}
