package classes;
import junit.framework.*;
public class valid_DateTest extends TestCase {
 public void test1(){
	 assertEquals(true,valid_Date.check(15, 6, 1900));
 }
 
 public void test2(){
	 assertEquals(true,valid_Date.check(15, 6, 1901));
 }
 public void test3(){
	 assertEquals(true,valid_Date.check(15, 6, 1962));
 }
 public void test4(){
	 assertEquals(true,valid_Date.check(15, 6, 2024));
 }
 public void test5(){
	 assertEquals(true,valid_Date.check(15, 6, 2025));
 }
 public void test6(){
	 assertEquals(true,valid_Date.check(1, 6, 1962));
 }
 
 public void test7(){
	 assertEquals(true,valid_Date.check(2, 6, 1962));
 }
 public void test8(){
	 assertEquals(true,valid_Date.check(30, 6, 1962));
 }
 public void test9(){
	 assertEquals(false,valid_Date.check(31, 6, 1962));
 }
 public void test10(){
	 assertEquals(true,valid_Date.check(15, 1, 1962));
 }
 public void test11(){
	 assertEquals(true,valid_Date.check(15, 2, 1962));
 }
 public void test12(){
	 assertEquals(true,valid_Date.check(15, 11, 1962));
 }
 public void test13(){
	 assertEquals(true,valid_Date.check(15, 12, 1962));
 }
 // equivalence class
 public void test14(){
	 assertEquals(false,valid_Date.check(-1, 12, 1962));
 } 
 public void test15(){
	 assertEquals(false,valid_Date.check(1, -1, 1962));
 }
 public void test16(){
	 assertEquals(false,valid_Date.check(1, 12, 1899));
 }
 public void test17(){
	 assertEquals(false,valid_Date.check(32, 6, 1962));
 }
 public void test18(){
	 assertEquals(false,valid_Date.check(15, 13, 1962));
 }
 public void test19(){
	 assertEquals(false,valid_Date.check(15, 6, 2026));
 } 
 public void test20(){
	 assertEquals(false,valid_Date.check(29, 2, 1962));
 } 
}
 