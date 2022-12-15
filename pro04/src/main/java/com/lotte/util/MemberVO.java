package com.lotte.util;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

public class MemberVO {
	
	@Id		//primary key�� �ʵ忡 ����
	@Size(min=5, max =12, message="���̵�� 5~12�ڷ� �ۼ��ؾ���")
	String id;
	
	@Column
	@NotNull
	@Size(min=6, max =12, message="��й�ȣ�� 8~12�ڷ� �ۼ��ؾ���")
	@Pattern(regexp="(^[A-Za-z0-9]{8,12}$)")
	//(^(?=.*[A-Za-z])(?=.*[0-9])(?=.*[$@$!%*#?&])[A-Za-z[0-9]$@$!%*#?&]{8,10}$)
	String pw; 
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	/*
	 	javax.validation�� javax.persistence ��Ű������ ���� ������ �ֳ����̼� �� �ɼ� 
	 	
		@AssertTrue �� ����
		@DecimalMax ���� �� ������ �Ǽ�
		@DecimalMin ���� �� �̻��� �Ǽ�
		@Digits(integer=, fraction=) ���� ����
		@Pattern(regexp="()") ���ϴ� ���� ����
		@Future �̷�
		@Past ����
		@Max ���� �� �̻�
		@Min ���� �� ����
		@NotNull
		@Null 
		@Size(min=,max=)  ���ڿ� �Ǵ� �迭���� ����
	 */
}
