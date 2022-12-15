package com.lotte.myapp;

import com.lotte.myapp.JDBCConn;
import java.sql.Connection;
import java.sql.DriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JDBCConn {
  private static final Logger logger = LoggerFactory.getLogger(JDBCConn.class);
  
  static {
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
    } catch (Exception e) {
      e.printStackTrace();
    } 
  }
  
  @Test
  public void testConnection() {
    try {
      Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test3", "9876");
      if (conn != null) {
        logger.info("����Ŭ ���� ����");
      } else {
        logger.info("����Ŭ ���� ����");
      } 
    } catch (Exception e) {
      Assert.fail("Not yet implemented");
    } 
  }
}
