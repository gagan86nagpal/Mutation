package test;

import classes.trityp;

import junit.framework.*;
public class random_tc extends TestCase {
	// boundary (1-100)
	public void test1(){
	    assertEquals("invalid input", trityp.Triang(38,0,69));   
	}	
	public void test2(){
	    assertEquals("isosceles", trityp.Triang(80,80,90));
	}	
	public void test3(){
	    assertEquals("not a valid triangle", trityp.Triang(42,4,96 ));  
	}
	public void test4(){
	    assertEquals("scalene", trityp.Triang(32,42,56));   
	}
	public void test5(){
	    assertEquals("scalene", trityp.Triang(75,60,35));   
	}	
	public void test6(){
	    assertEquals("not a valid triangle", trityp.Triang(53,21,15));    
	}	
	public void test7(){
	    assertEquals("scalene", trityp.Triang(43,69,49));   
	}
	
	public void test8(){
	    assertEquals("scalene", trityp.Triang(32,48,51));   
	}	
	
	public void test9(){
	    assertEquals("not a valid triangle", trityp.Triang(47,96,45));   
	}
	public void test10(){	   
	    assertEquals("scalene", trityp.Triang(89,87,84));   
	}
	public void test11(){	 
	    assertEquals("scalene", trityp.Triang(68,26,80 ));   
	}
	public void test12(){	   		   
		assertEquals("scalene", trityp.Triang(81,29,76 ));  
    }	
	public void test13(){		  
	    assertEquals("not a valid triangle", trityp.Triang(87,36,47 ));   
	}
	public void test14(){		  
	    assertEquals("scalene", trityp.Triang(6,9,11));   
	}
	
}
