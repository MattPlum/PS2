package base;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInteger_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void TestIsEven() {
		MyInteger myIntEven = new MyInteger(2);
		MyInteger myIntOdd = new MyInteger(1);
		assertTrue(myIntEven.isEven() == true);
		assertFalse(myIntOdd.isEven() == true);
	}
	
	public void TestIsOdd() {
		MyInteger myIntOdd = new MyInteger(1);
		MyInteger myIntEven = new MyInteger(2);
		assertTrue(myIntOdd.isOdd() == true);
		assertFalse(myIntEven.isOdd() == true);
	}

	@Test
	public void TestIsPrime() {
		MyInteger myIntPrime = new MyInteger(11);
		MyInteger myIntNotPrime = new MyInteger(4);
		assertTrue(myIntPrime.isPrime() == true);
		assertFalse(myIntNotPrime.isPrime() == true);
	}
	@Test
	public void TestIsEven1() {
		MyInteger myIntEven1 = new MyInteger(120);
		MyInteger myIntOdd1 = new MyInteger(1337);
		assertTrue(myIntEven1.isEven() == true);
		assertFalse(myIntOdd1.isEven() == true);
	}

	public void TestIsOdd1() {
		MyInteger myIntOdd1 = new MyInteger(11);
		MyInteger myIntEven1 = new MyInteger(22);
		assertTrue(myIntOdd1.isOdd() == true);
		assertFalse(myIntEven1.isOdd() == true);
	}

	public void TestIsPrime1() {
		MyInteger myIntPrime1 = new MyInteger(5);
		MyInteger myIntNotPrime1 = new MyInteger(15);
		assertTrue(myIntPrime1.isPrime() == true);
		assertFalse(myIntNotPrime1.isPrime() == true);
	}


	public void TestEqualsInt() {
		MyInteger myIntEquals = new MyInteger(4);
		assertTrue(myIntEquals.equals(4) == true);
		assertFalse(myIntEquals.equals(2) == true);
	}

	@Test
	public void TestEqualsInt1() {
		MyInteger myIntEquals = new MyInteger(4);
		assertTrue(myIntEquals.equals(4) == true);
		assertFalse(myIntEquals.equals(3) == true);
	}
}