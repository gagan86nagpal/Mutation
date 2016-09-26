package classes;
import junit.framework.*;
public class Cal_commisionTest extends TestCase{
	// 1---70 1--80, 1-90
	// output boundary vale or output based equivalence class
	public void testComm1(){
		double actcomm = Cal_commision.get_comm(1, 1, 1);
		assertEquals(10.0, actcomm);
	}
	public void testComm2(){
		double actcomm = Cal_commision.get_comm(1, 1, 2);
		assertEquals(12.5, actcomm);
	}
	public void testComm3(){
		double actcomm = Cal_commision.get_comm(1, 2, 1);
		assertEquals(13.0, actcomm);
	}
	public void testComm4(){
		double actcomm = Cal_commision.get_comm(2, 1, 1);
		assertEquals(14.5, actcomm);
	}
	public void testComm5(){
		double actcomm = Cal_commision.get_comm(5, 5, 5);
		assertEquals(50.0, actcomm);
	}
	public void testComm6(){
		double actcomm = Cal_commision.get_comm(10, 10, 9);
		assertEquals(97.5, actcomm);
	}
	public void testComm7(){
		double actcomm = Cal_commision.get_comm(10, 9, 10);
		assertEquals(97.0, actcomm);
	}
	public void testComm8(){
		double actcomm = Cal_commision.get_comm(9, 10, 10);
		assertEquals(95.5, actcomm);
	}
	public void testComm9(){
		double actcomm = Cal_commision.get_comm(10, 10, 10);
		assertEquals(100.0, actcomm);
	}
	public void testComm10(){
		double actcomm = Cal_commision.get_comm(10, 10, 11);
		assertEquals(103.75, actcomm);
	}
	public void testComm11(){
		double actcomm = Cal_commision.get_comm(10, 11, 10);
		assertEquals(104.5, actcomm);
	}
	public void testComm12(){
		double actcomm = Cal_commision.get_comm(11, 10, 10);
		assertEquals(106.75, actcomm);
	}
	public void testComm13(){
		double actcomm = Cal_commision.get_comm(14, 14, 14);
		assertEquals(160.0, actcomm);
	}
	public void testComm14(){
		double actcomm = Cal_commision.get_comm(18, 18, 17);
		assertEquals(216.25, actcomm);
	}
	public void testComm15(){
		double actcomm = Cal_commision.get_comm(18, 17, 18);
		assertEquals(215.5, actcomm);
	}
	public void testComm16(){
		double actcomm = Cal_commision.get_comm(17, 18, 18);
		assertEquals(213.25, actcomm);
	}
	public void testComm17(){
		double actcomm = Cal_commision.get_comm(18, 18, 18);
		assertEquals(220.0, actcomm);
	}
	public void testComm18(){
		double actcomm = Cal_commision.get_comm(18, 18, 19);
		assertEquals(225.0, actcomm);
	}
	public void testComm19(){
		double actcomm = Cal_commision.get_comm(18, 19, 18);
		assertEquals(226.0, actcomm);
	}
	public void testComm20(){
		double actcomm = Cal_commision.get_comm(19, 18, 18);
		assertEquals(229.0, actcomm);
	}
	public void testComm21(){
		double actcomm = Cal_commision.get_comm(48, 48, 48);
		assertEquals(820.0, actcomm);
	}
	public void testComm22(){
		double actcomm = Cal_commision.get_comm(70, 80, 89);
		assertEquals(1415.0, actcomm);
	}
	public void testComm23(){
		double actcomm = Cal_commision.get_comm(70,79, 90);
		assertEquals(1414.0, actcomm);
	}
	public void testComm24(){
		double actcomm = Cal_commision.get_comm(69, 80, 90);
		assertEquals(1411.0, actcomm);
	}
	public void testComm25(){
		double actcomm = Cal_commision.get_comm(70,80, 90);
		assertEquals(1420.0, actcomm);
	}
	// equivalence test
	public void testComm26(){
		double actcomm = Cal_commision.get_comm(-1, 40, 45);
		assertEquals(0.0, actcomm);
	}
	public void testComm27(){
		double actcomm = Cal_commision.get_comm(35, -1, 45);
		assertEquals(0.0, actcomm);
	}
	public void testComm28(){
		double actcomm = Cal_commision.get_comm(35, 40, -1);
		assertEquals(0.0, actcomm);
	}
	public void testComm29(){
		double actcomm = Cal_commision.get_comm(35, 40, -1);
		assertEquals(0.0, actcomm);
	}
}
