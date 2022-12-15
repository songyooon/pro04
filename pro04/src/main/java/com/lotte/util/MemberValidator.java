package com.lotte.util;

import java.util.regex.Pattern;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class MemberValidator implements Validator {

    public void validate(Object obj, Errors error) {
        System.out.println("validate action");
        Member member = (Member)obj;

		ValidationUtils.rejectIfEmpty(error, "id", "member.id.empty","아이디를 입력해주세요.");
		ValidationUtils.rejectIfEmpty(error, "pw", "member.pw.empty","비밀번호를 입력해주세요");

		Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{8,12}$", Pattern.CASE_INSENSITIVE);
        if (!(pattern.matcher(member.getPw()).matches())) {
        	error.rejectValue("pw", "member.pw.invalid");
        }
        
		/*
        String id = member.getId();
        String pw = member.getPw();
        
        //id가 비었는지 확인
        if(id == null || id.trim().isEmpty()) {
            error.rejectValue("id", "not value");
        }
        
        //pw가 비었는지 확인
        if(pw == null || pw.trim().isEmpty()) {
            error.rejectValue("pw", "not value");
        }
        
        //id가 8~12 이하인지 확인
        else if(id.length() >= 8 && id.length() <= 12) {
            error.rejectValue("id", "bad size"); 
        }
        
        //pw가 6~12자 이하인지 확인
        if(pw.length() >= 6 && pw.length() <= 12) {
            error.rejectValue("pw", "bad size");
        }
        */

		
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Member.class.equals(clazz);
    }
}