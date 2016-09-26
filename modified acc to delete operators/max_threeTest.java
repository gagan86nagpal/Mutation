package classes;

import junit.framework.TestCase;

public class max_threeTest extends TestCase {
 public void test1 (){
	assertEquals(50, max_three.getmax(0, 50, 50));
 }
 public void test2 (){
		assertEquals(50, max_three.getmax(1, 50, 50));
 }	
 public void test3(){
		assertEquals(99, max_three.getmax(99, 50, 50));
 }
 public void test4 (){
		assertEquals(100, max_three.getmax(100, 50, 50));
 }
 public void test5 (){
		assertEquals(50, max_three.getmax(50, 50, 50));
 }
 public void test6 (){
		assertEquals(50, max_three.getmax(50, 0, 50));
 }
 public void test7 (){
		assertEquals(50, max_three.getmax(50, 1, 50));
 }
 public void test8 (){
		assertEquals(99, max_three.getmax(50, 99, 50));
 }
 public void test9 (){
		assertEquals(100, max_three.getmax(50, 100, 50));
 }
 public void test10 (){
		assertEquals(50, max_three.getmax(50, 50, 0));
 }
 public void test11 (){
		assertEquals(50, max_three.getmax(50, 50, 1));
}
 public void test12 (){
		assertEquals(99, max_three.getmax(50, 50, 99));
}
 public void test13 (){
		assertEquals(100, max_three.getmax(50, 50, 100));
}
 public void test14 (){
		assertEquals(-1, max_three.getmax(-1, 50, 0));
}
 public void test15 (){
		assertEquals(-1, max_three.getmax(101, 50, 0));
}
}
