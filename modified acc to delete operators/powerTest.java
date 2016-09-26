package classes;
import junit.framework.*;

public class powerTest extends TestCase{

	public void test1(){
		assertEquals(1, power.checklr(0, 0));
	}
	public void test2(){
		assertEquals(-1, power.checklr(0, -1));
	}
	public void test3(){
		assertEquals(10000, power.checklr(100, 2));
	}
	public void test4(){
		assertEquals(-1, power.checklr(-1, 3));
	}
}
