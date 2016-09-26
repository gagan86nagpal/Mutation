package classes;

import junit.framework.*;
//import classes.find_division;
public class find_divisionTest extends TestCase{
    // boundary value
	public void testdiv1(){
		String actualoutput = find_division.cal_division(0, 50, 50);
		assertEquals("Fail", actualoutput);
	}
	public void testdiv2(){
		String actualoutput = find_division.cal_division(1, 50, 50);
		assertEquals("Fail", actualoutput);
	}
	public void testdiv3(){
		String actualoutput = find_division.cal_division(50, 50, 50);
		assertEquals("Second division", actualoutput);
	}
	public void testdiv4(){
		String actualoutput = find_division.cal_division(99, 50, 50);
		assertEquals("First division", actualoutput);
	}
	public void testdiv5(){
		String actualoutput = find_division.cal_division(100, 50, 50);
		assertEquals("First division", actualoutput);
	}
	public void testdiv6(){
		String actualoutput = find_division.cal_division(50, 0, 50);
		assertEquals("Fail", actualoutput);
	}	
	public void testdiv7(){
		String actualoutput = find_division.cal_division(50, 1, 50);
		assertEquals("Fail", actualoutput);
	}	
	public void testdiv8(){
		String actualoutput = find_division.cal_division(50, 99, 50);
		assertEquals("First division", actualoutput);
	}	
	public void testdiv9(){
		String actualoutput = find_division.cal_division(50, 100, 50);
		assertEquals("First division", actualoutput);
	}	
	public void testdiv10(){
		String actualoutput = find_division.cal_division(50, 50, 0);
		assertEquals("Fail", actualoutput);
	}	
	public void testdiv11(){
		String actualoutput = find_division.cal_division(50, 50, 1);
		assertEquals("Fail", actualoutput);
	}	
	public void testdiv12(){
		String actualoutput = find_division.cal_division(50, 50, 99);
		assertEquals("First division", actualoutput);
	}	
	public void testdiv13(){
		String actualoutput = find_division.cal_division(50, 50, 100);
		assertEquals("First division", actualoutput);
	}	
	
	// equivalence class
	public void testdiv14(){
		String actualoutput = find_division.cal_division(75, 80, 85);
		assertEquals("First division with distinction", actualoutput);
	}
	public void testdiv15(){
		String actualoutput = find_division.cal_division(45, 45, 45);
		assertEquals("Third division", actualoutput);
	}
	public void testdiv16(){
		String actualoutput = find_division.cal_division(-1, 50, 50);
		assertEquals("invalid marks", actualoutput);
	}
	public void testdiv17(){
		String actualoutput = find_division.cal_division(101, 50, 50);
		assertEquals("invalid marks", actualoutput);
	}
	public void testdiv18(){
		String actualoutput = find_division.cal_division(50, -1, 50);
		assertEquals("invalid marks", actualoutput);
	}
	public void testdiv19(){
		String actualoutput = find_division.cal_division(50, 101, 50);
		assertEquals("invalid marks", actualoutput);
	}
	public void testdiv20(){
		String actualoutput = find_division.cal_division(50, 50, -1);
		assertEquals("invalid marks", actualoutput);
	}
	public void testdiv21(){
		String actualoutput = find_division.cal_division(50, 50, 101);
		assertEquals("invalid marks", actualoutput);
	}
}
