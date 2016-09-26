package test;

import classes.trityp;

import junit.framework.*;
public class generated_tc extends TestCase{
	 public void testtriangleclass2(){
		 
		 
		   String actualop = trityp.Triang(88,34,98);// initial
		   String expectedop = "scalene";
		   assertEquals(expectedop, actualop);
	   }
	 public void testtriangleclass4(){
		   String actualop = trityp.Triang(100, 100, 100);// initial
		   String expectedop = "equilateral";
		   assertEquals(expectedop, actualop);
	   }
	 public void testtriangleclass6(){
		   String actualop = trityp.Triang(88,100,100); // 1st itr high crossover
		   String expectedop = "isosceles";
		   assertEquals(expectedop, actualop);
	   }
	 public void testtriangleclass10(){
		   String actualop = trityp.Triang(108,100,100); // 2nd itr high crossover
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass11(){
		   String actualop = trityp.Triang(0,77,2); // 2nd itr low crossover
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
	   	   
	   public void testtriangleclass13(){ 
		  // String actualop = trityp.Triang(84,100,100);  // 3rd itr high crossover
		   String actualop = trityp.Triang(80,100,108);  // 3rd itr  2point mutation	   
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass17(){
		   String actualop = trityp.Triang(88,116,100);  // 4th itr high crossover
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass20(){
		   String actualop = trityp.Triang(80, 77, 2); // 4th itr low crossover
		   String expectedop = "not a valid triangle";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass23(){
		   String actualop = trityp.Triang(2,77,2); // 5th itr low crossover  
		   String expectedop = "not a valid triangle";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass28(){	   
		   //String actualop = trityp.Triang(82,77,2);  // 6th itr high crossover
		   String actualop = trityp.Triang(82,-56,3);  // 6th itr 2point mutation	
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass30(){  
		   String actualop = trityp.Triang(100,96,100);  // 7th itr 2point mutation
		   String expectedop = "isosceles";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass34(){  
		   String actualop = trityp.Triang(100,100,96);  // 8th itr 2point mutation
		   String expectedop = "isosceles";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass37(){	   
		   	  // String actualop = trityp.Triang(88,100,96);  // 9th itr  high crossover
		   	   String actualop = trityp.Triang(24,36,96);  // 9th itr 2point mutation	
			   String expectedop = "not a valid triangle";
			   assertEquals(expectedop, actualop);
		   }
	   public void testtriangleclass43(){	  
		   String actualop = trityp.Triang(80,77,-126);  // 10th itr low crossover	
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
}
