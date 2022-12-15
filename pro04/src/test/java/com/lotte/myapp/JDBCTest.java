package com.lotte.myapp;

import static org.junit.Assert.*;

import org.junit.Test;

public class JDBCTest {
	JDBCConn t1 = new JDBCConn();
	
	@Test
	public void test() {
		t1.testConnection();
	}

}
