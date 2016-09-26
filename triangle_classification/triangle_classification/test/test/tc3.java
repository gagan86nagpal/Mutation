package test;

import junit.framework.*;
public class tc3 extends TestCase {
	int a=2, b=77,c=-126;
	String expop = "invalid input";
	public void testvarm1(){
		   String actualop = varm1.trityp.Triang(a, b, c);	   
		   assertEquals(expop, actualop);
	}
	public void testvarm2(){
		   String actualop = varm2.trityp.Triang(a, b, c);	   
		   assertEquals(expop, actualop);
	}
	public void testvarm3(){
		   String actualop = varm3.trityp.Triang(a, b, c);	   
		   assertEquals(expop, actualop);
	}
	public void testvarm4(){
		   String actualop = varm4.trityp.Triang(a, b, c);	   
		   assertEquals(expop, actualop);
	}
	public void testvarm5(){
		   String actualop = varm5.trityp.Triang(a, b, c);	   
		   assertEquals(expop, actualop);
	}
	public void testvarm6(){
		   String actualop = varm6.trityp.Triang(a, b, c);	   
		   assertEquals(expop, actualop);
	}
	
}
