package com.insel.chapter23;

import java.util.logging.Logger;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Fixtures {
	
	static final Logger log = Logger.getLogger(Fixtures.class.getName());
	
	@BeforeAll
	public static void beforeClass() {log.info("@BeforeAll");}
	
	@AfterAll
	public static void afterClass() {log.info("@AfterAll");}
	
	@BeforeEach
	public void setUp() {log.info("@BeforeEach");}
	
	@AfterEach
	public void tearDown() {log.info("@AfterEach");}
	
	@Test
	public void test1() {log.info("test 1");}
	
	@Test
	public void test2() {log.info("test 2");}
}
