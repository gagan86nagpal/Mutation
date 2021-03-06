package classes;
import junit.framework.*;
public class tritypTest extends TestCase{
	
  public void testtriangleclass1(){
	   String actualop = trityp.Triang(1,0,-3);  // initial
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass2(){
	   String actualop = trityp.Triang(88,34,98);// initial
	   String expectedop = "scalene";
	   assertEquals(expectedop, actualop);
   }
public void testtriangleclass3(){
	   String actualop = trityp.Triang(0, 77,0);// initial
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass4(){
	   String actualop = trityp.Triang(100, 100, 100);// initial
	   String expectedop = "equilateral";
	   assertEquals(expectedop, actualop);
   }
   
   public void testtriangleclass5(){
	   String actualop = trityp.Triang(100,34,98);  // 1st itr high crossover
	   String expectedop = "scalene";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass6(){
	   String actualop = trityp.Triang(88,100,100); // 1st itr high crossover
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
public void testtriangleclass7(){
	   String actualop = trityp.Triang(88,38,98); // 1st itr low crossover
	   String expectedop = "scalene";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass8(){
	   String actualop = trityp.Triang(0, 73, 0); // 1st itr low crossover
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   
   public void testtriangleclass9(){
	   String actualop = trityp.Triang(80,100 ,100);  // 2nd itr high crossover
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
   public void testtriangleclass12(){
	   String actualop = trityp.Triang(88, 34, 96); // 2nd itr low crossover
	   String expectedop = "scalene";
	   assertEquals(expectedop, actualop);
   }
   
   public void testtriangleclass13(){ 
	  // String actualop = trityp.Triang(84,100,100);  // 3rd itr high crossover
	   String actualop = trityp.Triang(80,100,108);  // 3rd itr  2point mutation	   
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass14(){
	   //String actualop = trityp.Triang(104,100,100); // 3rd itr high crossover
	   String actualop = trityp.Triang(96,100,108);  // 3rd itr high crossover
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass15(){
	   //String actualop = trityp.Triang(0,100,100); // 3rd itr low crossover
	   String actualop = trityp.Triang(8,100,108);  // 3rd itr high crossover
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass16(){
	  // String actualop = trityp.Triang(108, 77, 0); // 3rd itr low crossover
	   String actualop = trityp.Triang(100,77,108);  // 3rd itr high crossover
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }   
   public void testtriangleclass17(){
	   String actualop = trityp.Triang(88,116,100);  // 4th itr high crossover
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass18(){
	   String actualop = trityp.Triang(100,116,100); // 4th itr high crossover
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
public void testtriangleclass19(){
	   String actualop = trityp.Triang(0,100,108); // 4th itr low crossover
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass20(){
	   String actualop = trityp.Triang(80, 77, 2); // 4th itr low crossover
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }  
   
   public void testtriangleclass21(){
	   String actualop = trityp.Triang(90,100,100);  // 5th itr high crossover	   
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass22(){
	  String actualop = trityp.Triang(102,100,100); // 5th itr high crossover
	  
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass23(){
	   String actualop = trityp.Triang(2,77,2); // 5th itr low crossover  
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass24(){
	   String actualop = trityp.Triang(82,77,2); // 5th itr low crossover	  
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass25(){	 
	   //String actualop = trityp.Triang(36,100,100);  // 6th itr high crossover
   	   String actualop = trityp.Triang(36,-28,101);  // 6th itr  2point mutation
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass26(){	   
	   //String actualop = trityp.Triang(24,100,100);  // 6th itr high crossover
	   String actualop = trityp.Triang(24,-28,101);  // 6th itr 2point mutation
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass27(){	   
	   //String actualop = trityp.Triang(0,77,2);  	//  6th itr high crossover
	   String actualop = trityp.Triang(0,-56,3);  // 6th itr 2point mutation
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass28(){	   
	   //String actualop = trityp.Triang(82,77,2);  // 6th itr high crossover
	   String actualop = trityp.Triang(82,-56,3);  // 6th itr 2point mutation	
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass29(){	   
   	   String actualop = trityp.Triang(88,96,100);  // 7th itr  2point mutation
	   String expectedop = "scalene";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass30(){  
	   String actualop = trityp.Triang(100,96,100);  // 7th itr 2point mutation
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass31(){  
	   String actualop = trityp.Triang(66,77,2);  // 7th itr 2point mutation
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass32(){	   
	   String actualop = trityp.Triang(16,77,2);  // 7th itr 2point mutation	
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass33(){	   
   	   String actualop = trityp.Triang(88,100,96);  // 8th itr  2point mutation
	   String expectedop = "scalene";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass34(){  
	   String actualop = trityp.Triang(100,100,96);  // 8th itr 2point mutation
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass35(){  
	   String actualop = trityp.Triang(82,77,2);  // 8th itr 2point mutation
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass36(){	   
	   String actualop = trityp.Triang(0,77,2);  // 8th itr 2point mutation	
	   String expectedop = "invalid input";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass37(){	   
   	  // String actualop = trityp.Triang(88,100,96);  // 9th itr  high crossover
   	   String actualop = trityp.Triang(24,36,96);  // 9th itr 2point mutation	
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass38(){  
	  // String actualop = trityp.Triang(100,100,100);  // 9th  high crossover
	   String actualop = trityp.Triang(36,36,100);  // 9th itr 2point mutation	
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass39(){  
	  // String actualop = trityp.Triang(66,77,2);  // 9th itr  low crossover
	   String actualop = trityp.Triang(2,13,2);  // 9th itr 2point mutation	
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass40(){	   
	  // String actualop = trityp.Triang(16,77,2);  // 9th itr  low crossover 
	   String actualop = trityp.Triang(80,13,2);  // 9th itr 2point mutation	
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   		public void testtriangleclass41(){	   	
	   	   String actualop = trityp.Triang(88,100,96);  // 10th itr high crossover	
		   String expectedop = "scalene";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass42(){	
		   String actualop = trityp.Triang(100,100,100);  // 10th itr high crossover
		   String expectedop = "equilateral";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass43(){	  
		   String actualop = trityp.Triang(80,77,-126);  // 10th itr low crossover	
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
	   public void testtriangleclass44(){		  
		   String actualop = trityp.Triang(2,77,-126);  // 10th itr	low crossover
		   String expectedop = "invalid input";
		   assertEquals(expectedop, actualop);
	   }
}
