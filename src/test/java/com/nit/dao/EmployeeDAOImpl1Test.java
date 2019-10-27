/**
 * 
 */
package com.nit.dao;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Gaurav Kumar
 *
 */

public class EmployeeDAOImpl1Test {
	
	private static ApplicationContext ctx;
	private static EmployeeDAO dao;
	
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("EmployeeDAOImpl1Test.setUpBeforeClass() called");
		ctx = new ClassPathXmlApplicationContext("com/nit/config/persistence-beans-test.xml");
		dao = ctx.getBean("empDAO",EmployeeDAO.class);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("EmployeeDAOImpl1Test.tearDownAfterClass() called");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		System.out.println("EmployeeDAOImpl1Test.setUp() called");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		System.out.println("EmployeeDAOImpl1Test.tearDown() called");
	}

	/**
	 * Test method for {@link com.nit.dao.EmployeeDAOImpl1#EmployeeDAOImpl1(org.springframework.jdbc.core.JdbcTemplate)}.
	 */
//	@Test
//	@Ignore
//	public void testEmployeeDAOImpl1() {
//		fail("Not yet implemented");
//	}

	/**
	 * Test method for {@link com.nit.dao.EmployeeDAOImpl1#getAllEmployees()}.
	 */
	@Test
	public void testGetAllEmployees() {
		System.out.println("EmployeeDAOImpl1Test.testGetAllEmployees() called");
		int actualCount = dao.getAllEmployees().size();
		Assert.assertEquals(14, actualCount);
	}

}
