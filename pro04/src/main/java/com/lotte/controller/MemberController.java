package com.lotte.controller;

import java.io.PrintWriter;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lotte.dto.MemberDTO;
import com.lotte.service.MemberService;

@Controller
@RequestMapping("/member/")
public class MemberController {
	private static final Logger logger = LoggerFactory.getLogger(MemberController.class);
	
	//������ ����
	@Autowired
	MemberService memberService;
	
	@Inject
	BCryptPasswordEncoder pwdEncoder;
	
	@Autowired
	HttpSession session;
	
	//member/list.do -> MemberService -> MemberDAO -> MyBatis(memberMapper) -> DB 
	//localhost:8093/member/list.do
	@RequestMapping(value="list.do", method = RequestMethod.GET)
	public String memberList(Model model) throws Exception {
		List<MemberDTO> memberList = memberService.memberList();
		model.addAttribute("memberList", memberList);
		return "member/memberList";
	}
	
	/* ������ ȸ�� ���� ���� */
	@RequestMapping(value="getMember.do", method = RequestMethod.GET)
	public String getMember(@RequestParam String id, Model model) throws Exception {
		MemberDTO member = memberService.getMember(id);
		model.addAttribute("member", member);
		return "member/memberDetail";
	}

	/* �Ϲ�ȸ�� �������� */
	@RequestMapping(value="read.do", method = RequestMethod.GET)
	public String memberRead(Model model, HttpServletRequest request) throws Exception {
		String id = (String) session.getAttribute("sid");
		MemberDTO member = memberService.getMember(id);
		model.addAttribute("member", member);
		return "member/memberRead";
	}
	
	
	//ȸ�� ���� - ��� ���� ������ �ε�
	@GetMapping("agree.do")
	public String getAgree(Model model) throws Exception {
		return "member/agree";
	}
	//ȸ�� ���� - ȸ�������� ������ �ε�
	@GetMapping("join.do")
	public String getJoin(Model model) throws Exception {
		return "member/memberInsert";
	}
	//ȸ�� ���� - Ajax�� ���̵� �ߺ� üũ 
	@RequestMapping(value="idCheck.do", method=RequestMethod.POST)
	public void idCheck(HttpServletResponse response, HttpServletRequest request, Model model) throws Exception {
		String id = request.getParameter("id");
		boolean result = false;
		MemberDTO dto = new MemberDTO();
		dto = memberService.getMember(id);

		if(dto!=null){	//�̹� �ִ� ���̵���
			result = false;
		} else {
			result = true;
		}
		JSONObject json = new JSONObject();
		json.put("result", result);
		PrintWriter out = response.getWriter();
		out.println(json.toString());
	}
	//ȸ�� ���� - ȸ�� ���� ó��
	@RequestMapping(value="insert.do", method = RequestMethod.POST)
	public String memberWrite(MemberDTO member, Model model) throws Exception {
		//��й�ȣ ��ȣȭ
		String userpw = member.getPw();
		String pwd = pwdEncoder.encode(userpw);
		member.setPw(pwd);
		memberService.memberInsert(member);
		return "redirect:/";
	}
	
	//�α��� �� �ε�
	@RequestMapping("loginForm.do")  
	public String memberLoginForm(Model model) throws Exception {
		return "member/loginForm";
	}
	
	//�α��� 	- ��Ʈ�ѷ����� ���� ó��
	@RequestMapping(value="signin.do", method = RequestMethod.POST)
	public String memberSignin(@RequestParam String id, @RequestParam String pw, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		session.invalidate();
		MemberDTO mdto = new MemberDTO();
		mdto.setPw(pw);
		mdto.setId(id);
		MemberDTO login = memberService.signIn(mdto);
		boolean loginSuccess = pwdEncoder.matches(mdto.getPw(), login.getPw());
		if(loginSuccess && login!=null) {
			session.setAttribute("member", login);
			session.setAttribute("sid", id);
			return "redirect:/";
		} else {
			return "redirect:loginForm.do";
		}
	} 
	
	//�α��� - Service���� ���� ó��
	@RequestMapping(value="login.do", method = RequestMethod.POST)
	public String memberLogin(MemberDTO mdto, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
		boolean loginSuccess = memberService.login(req);
		if(loginSuccess) {		
			return "home";
		} else {
			return "redirect:loginForm.do";
		}
	}
	
	//Ajax�� �̿��ϴ� ���
	@RequestMapping(value="loginCheck.do", method = RequestMethod.POST)
	public String memberLoginCtrl(MemberDTO mdto, RedirectAttributes rttr) throws Exception {
		session.getAttribute("member");
		MemberDTO member = memberService.loginCheck(mdto);
		boolean mat = pwdEncoder.matches(mdto.getPw(), member.getPw());
		if(mat==true && member!=null) {
			logger.info("�α��� ����");
			session.setAttribute("member", member);
			session.setAttribute("sid", member.getId());
			rttr.addFlashAttribute("msg", "�α��� ����");
			return "redirect:/";
		} else {
			logger.info("�α��� ����");
			session.setAttribute("member", null);
			rttr.addFlashAttribute("msg", false);
			return "redirect:loginForm.do";
		}
	}
	
	//ȸ�� ���� ����
	@RequestMapping(value="update.do", method = RequestMethod.POST)
	public String memberUpdate(MemberDTO mdto, Model model) throws Exception {
		String pwd = pwdEncoder.encode(mdto.getPw());
		mdto.setPw(pwd);
		memberService.memberUpdate(mdto);
		return "redirect:/";
	}

	//ȸ�� Ż��
	@RequestMapping(value="delete.do", method = RequestMethod.GET)
	public String memberDelete(@RequestParam String id, Model model, HttpSession session) throws Exception {
		memberService.memberDelete(id);
		session.invalidate();
		return "redirect:/";
	}
	
	//�α׾ƿ�
	@RequestMapping("logout.do")
	public String memberLogout(HttpSession session) throws Exception {
		session.invalidate();
		return "redirect:/";
	}
}