package test;

import classes.trityp;

import junit.framework.*;
public class boundary_tc extends TestCase {
	// boundary (1-100)
	public void test1(){
	    assertEquals("isosceles", trityp.Triang(50, 50, 1));   
	}	
	public void test2(){
	    assertEquals("isosceles", trityp.Triang(50, 50, 2));
	}
	
	public void test3(){
	    assertEquals("isosceles", trityp.Triang(50, 50, 99));  
	}
	public void test4(){
	    assertEquals("not a valid triangle", trityp.Triang(50, 50, 100));   
	} 
	
	public void test5(){
	    assertEquals("equilateral", trityp.Triang(50, 50, 50));   
	}
	
	public void test6(){
	    assertEquals("isosceles", trityp.Triang(50, 1, 50));    
	}	
	public void test7(){
	    assertEquals("isosceles", trityp.Triang(50, 2, 50));   
	}
	
	public void test8(){
	    assertEquals("isosceles", trityp.Triang(50, 99, 50));   
	}	
	
	public void test9(){
	    assertEquals("not a valid triangle", trityp.Triang(50, 100, 50));   
	}
	public void test10(){	   
	    assertEquals("isosceles", trityp.Triang(1, 50, 50));   
	}
	public void test11(){	 
	    assertEquals("isosceles", trityp.Triang(2, 50, 50));   
	}
	public void test12(){	   		   
		assertEquals("isosceles", trityp.Triang(99, 50, 50));  
    }	
	public void test13(){	 
	  
	    assertEquals("not a valid triangle", trityp.Triang(100, 50, 50));   
	}
	
}
