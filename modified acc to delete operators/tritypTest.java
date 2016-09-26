package classes;
import junit.framework.*;
public class tritypTest extends TestCase{
	///private static String[] triTypes = { "", "scalene", "isosceles", "equilateral", "not a valid triangle"};
	
		public void testtriangleclass1(){
	   String actualop = trityp.Triang(50, 50, 1);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass2(){
	   String actualop = trityp.Triang(50, 50, 2);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
public void testtriangleclass3(){
	   String actualop = trityp.Triang(50, 50, 50);
	   String expectedop = "equilateral";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass4(){
	   String actualop = trityp.Triang(50, 50, 99);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass5(){
	   String actualop = trityp.Triang(50, 50, 100);
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass6(){
	   String actualop = trityp.Triang(50, 1, 50);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass7(){
	   String actualop = trityp.Triang(50, 2, 50);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass8(){
	   String actualop = trityp.Triang(50, 99, 50);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass9(){
	   String actualop = trityp.Triang(50, 100, 50);
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
	public void testtriangleclass10(){
	   String actualop = trityp.Triang(1, 50, 50);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass11(){
	   String actualop = trityp.Triang(2, 50, 50);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass12(){
	   String actualop = trityp.Triang(99, 50, 50);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
  public void testtriangleclass13(){
	   String actualop = trityp.Triang(100, 50, 50);
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
 public void testtriangleclass14(){
	   String actualop = trityp.Triang(0, 50, 50);
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   public void testtriangleclass15(){
	   String actualop = trityp.Triang(101, 50, 50);
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
    
    public void testtriangleclass16(){
	   String actualop = trityp.Triang(50, 0, 50);
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
    
	public void testtriangleclass17(){
	   String actualop = trityp.Triang(50, 101, 50);
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
   
	public void testtriangleclass18(){
	   String actualop = trityp.Triang(50, 50, 0);
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   }
	public void testtriangleclass19(){
	   String actualop = trityp.Triang(100,99,50);
	   String expectedop = "scalene";
	   assertEquals(expectedop, actualop);
   }
	 public void testtriangleclass20(){
	   String actualop = trityp.Triang(100,50,25);
	   String expectedop = "not a valid triangle";
	   assertEquals(expectedop, actualop);
   } 
	    public void testtriangleclass21(){
	   String actualop = trityp.Triang(50,50,60);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
	   public void testtriangleclass22(){
	   String actualop = trityp.Triang(50,60,50);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }
	   public void testtriangleclass23(){
	   String actualop = trityp.Triang(60,50,50);
	   String expectedop = "isosceles";
	   assertEquals(expectedop, actualop);
   }

}
