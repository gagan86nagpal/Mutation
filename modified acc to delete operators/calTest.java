package classes;


import junit.framework.*;
public class calTest extends TestCase{

	public void test1(){
		int actualdays = cal.cal(1, 1, 1, 1, 2014);// month1, day1, mnth2, day2, year
		assertEquals(0, actualdays);
	}
	public void test2(){
		int actualdays = cal.cal(1, 1, 1, 4, 2014);
		assertEquals(3, actualdays);
	}
	public void test3(){
		int actualdays = cal.cal(1, 1, 6, 4, 2014); 
		assertEquals(154, actualdays);
	}
	public void test4(){
		int actualdays = cal.cal(1, 1, 2, 29, 2012);
		assertEquals(59, actualdays);
	}
	public void test5(){
		int actualdays = cal.cal(0, 1, 1, 4, 2014);
		assertEquals(-1, actualdays);
	}
	public void test6(){
		int actualdays = cal.cal(1, 0, 1, 4, 2014);
		assertEquals(-1, actualdays);
	}
	public void test7(){
		int actualdays = cal.cal(1, 1, 0, 4, 2014);
		assertEquals(-1, actualdays);
	}
	public void test8(){
		int actualdays = cal.cal(1, 1, 1, 0, 2014);
		assertEquals(-1, actualdays);
	}	
	public void test9(){
		int actualdays = cal.cal(13, 1, 1, 4, 2013);
		assertEquals(-1, actualdays);
	}
	public void test10(){
		int actualdays = cal.cal(1, 32, 1, 4, 2013);
		assertEquals(-1, actualdays);
	}
	public void test11(){
		int actualdays = cal.cal(1, 1, 13, 4, 2013);
		assertEquals(-1, actualdays);
	}
	public void test12(){
		int actualdays = cal.cal(1, 1, 1, 32, 2013);
		assertEquals(-1, actualdays);
	}
	public void test13(){
		int actualdays = cal.cal(1, 1, 1, 1, 100001);
		assertEquals(-1, actualdays);
	}
	public void test14(){
		int actualdays = cal.cal(1, 1, 6, 15, 1);
		assertEquals(165, actualdays);
	}
	public void test15(){
		int actualdays = cal.cal(1, 1, 6, 15, 10000);
		assertEquals(166, actualdays);
	}
	
}
