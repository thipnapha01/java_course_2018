package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void สวัสดี_Thip() {
		Reception  reception = new Reception();
		String actualResult = reception.get("Thip");
		assertEquals("สวัสดี Thip", actualResult);
	}
	public void สวัสดี_Noom() {
		Reception  reception = new Reception();
		String actualResult = reception.get("Noom");
		assertEquals("สวัสดี Noom", actualResult);
	}

}
