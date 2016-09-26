package classes;

import junit.framework.TestCase;

//import classes.Roots;

public class RootsTest extends TestCase {
	  public void testroots1(){
		   String actualop = Roots.get_roots(0,50,50);   
		   String expectedop = "not a quadratic equation";
		   assertEquals(expectedop, actualop);
	   }
	   public void testroots2(){
		   String actualop = Roots.get_roots(1,50,50);	   
		   String expectedop = "real roots";
		   assertEquals(expectedop, actualop);
	   }	
	    public void testroots3(){
		   String actualop = Roots.get_roots(50,50,50);	   
		   String expectedop = "imaginary roots";
		   assertEquals(expectedop, actualop);
	    }  
		
	     public void testroots4(){
		   String actualop = Roots.get_roots(50,50,0);	   
		   String expectedop = "real roots";
		   assertEquals(expectedop, actualop);
	   }
	     public void testroots5(){
	  	   String actualop = Roots.get_roots(50,50,1);  	   
	  	   String expectedop = "real roots";
	  	   assertEquals(expectedop, actualop);
	     }
	     public void testroots6(){
	  	   String actualop = Roots.get_roots(50,0,50); 	   
	  	   String expectedop = "imaginary roots";
	  	   assertEquals(expectedop, actualop);
	     }
	     public void testroots7(){
	    	   String actualop = Roots.get_roots(50,1,50);    	   
	    	   String expectedop = "imaginary roots";
	    	   assertEquals(expectedop, actualop);
	       }
	     public void testroots8(){
	  	   String actualop = Roots.get_roots(1,4,4);  	   
	  	   String expectedop = "equal roots";
	  	   assertEquals(expectedop, actualop);
	     }
	     
	    public void testroots9(){
		   String actualop = Roots.get_roots(-1,50,50);	   
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
	    
	    public void testroots10(){
		   String actualop = Roots.get_roots(50,-1,50);	   
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
	 
	   public void testroots11(){
		   String actualop = Roots.get_roots(50,50,-1);	   
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   } 
}
