package classes;
//import classes.trashAndTakeOut;

import junit.framework.*;
public class trashAndTakeOutTest extends TestCase{
	
	public void test1() {
		int i1 = 0;
		assertEquals(0, trashAndTakeOut.trash(i1));
	}
	
	public void test2() {
		int i1 = 1;
		assertEquals(200, trashAndTakeOut.trash(i1));
	}
	public void test3() {
		int i1 = 5;
		assertEquals(200, trashAndTakeOut.trash(i1));
	}
	public void test4() {
		int i1 = 6;
		assertEquals(192, trashAndTakeOut.trash(i1));
	}
	public void test5() {
		int i1 = -1;
		assertEquals(0, trashAndTakeOut.trash(i1));
	}
	
}
