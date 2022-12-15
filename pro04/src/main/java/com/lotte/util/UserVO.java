package com.lotte.util;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class UserVO {
	  private Integer no;
	   
	  @NotEmpty
	  @Length(min=2, max=16)
	  private String name;
	   
	  @NotEmpty
	  @Email
	  private String email;
	   
	  @NotEmpty
	  @Pattern(regexp="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&+=])(?=\\S+$).{8,}")
	  private String pwd;
	   
	  @NotEmpty
	  private String gender;
	   
	  private String regDate;
}