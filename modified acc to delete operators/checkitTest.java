
package classes;
import junit.framework.*;

	public class checkitTest extends TestCase{
	    // boundary value not appled. according to equivalence class, input - true and false given to each inpt
		public void testcheck1(){
			assertEquals("P is true", checkit.getcheck(true, true, true));
		}
		
		public void testcheck2(){
			assertEquals("P isn't true", checkit.getcheck(false, false, false));
		}
	}

