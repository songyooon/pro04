package com.lotte.myapp;

import com.lotte.dto.MemberDTO;
import com.lotte.myapp.DTOTest;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DTOTest {
  private static final Logger logger = LoggerFactory.getLogger(DTOTest.class);
  
  @Test
  public void testDto() {
    MemberDTO dto = new MemberDTO();
    dto.setId("admin");
    dto.setPw("1234");
    dto.setName("������");
    dto.setTel("01011112222");
    dto.setAddr("�ϻ�");
    dto.setPt(300);
    dto.setRegdate("2022-11-21");
    logger.info(dto.toString());
  }
}
