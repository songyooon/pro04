package com.lotte.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.lotte.dto.MemberDTO;

public interface MemberService {
	public List<MemberDTO> memberList() throws Exception;
	public MemberDTO getMember(String id) throws Exception;
	public void memberInsert(MemberDTO member) throws Exception;
	public MemberDTO signIn(MemberDTO mdto) throws Exception;
	public boolean login(HttpServletRequest req) throws Exception;
	public MemberDTO loginCheck(MemberDTO mdto) throws Exception;
	public void memberUpdate(MemberDTO mdto) throws Exception;
	public void memberDelete(String id) throws Exception;
	
}
