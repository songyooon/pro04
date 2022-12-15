package com.lotte.util;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
	@RequestMapping(value="/user/form", method=RequestMethod.GET)
	public String userForm(HttpServletRequest request, Model model) {
		return "check/form";
	}

	@RequestMapping(value="/user/check", method=RequestMethod.POST)
	// binding한 결과가 result에 담긴다.
	public String userCheck(@ModelAttribute @Valid UserVO vo, BindingResult result) {
		// 에러가 있는지 검사
		if( result.hasErrors() ) {

			// 에러를 List로 저장
			List<ObjectError> list = result.getAllErrors();
			for( ObjectError error : list ) {
				System.out.println(error);
			}
			return "check/errorform";
		}
		return "check/resultform";
	}
}