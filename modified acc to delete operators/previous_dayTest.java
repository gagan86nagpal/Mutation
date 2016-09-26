package classes;

import junit.framework.*;
public class previous_dayTest extends TestCase {
 public void test1(){
	 assertEquals("14,6,1900",previous_day.getdate(15, 6, 1900));
 }
 
 public void test2(){
	 assertEquals("14,6,1901",previous_day.getdate(15, 6, 1901));
 }
 public void test3(){
	 assertEquals("14,6,1962",previous_day.getdate(15, 6, 1962));
 }
 public void test4(){
	 assertEquals("14,6,2024",previous_day.getdate(15, 6, 2024));
 }
 public void test5(){
	 assertEquals("14,6,2025",previous_day.getdate(15, 6, 2025));
 }
 public void test6(){
	 assertEquals("31,5,1962",previous_day.getdate(1, 6, 1962));
 }
 
 public void test7(){
	 assertEquals("1,6,1962",previous_day.getdate(2, 6, 1962));
 }
 public void test8(){
	 assertEquals("29,6,1962",previous_day.getdate(30, 6, 1962));
 }
 public void test9(){
	 assertEquals("invalid date",previous_day.getdate(31, 6, 1962));
 }
 public void test10(){
	 assertEquals("14,1,1962",previous_day.getdate(15, 1, 1962));
 }
 public void test11(){
	 assertEquals("14,2,1962",previous_day.getdate(15, 2, 1962));
 }
 public void test12(){
	 assertEquals("14,11,1962",previous_day.getdate(15, 11, 1962));
 }
 public void test13(){
	 assertEquals("14,12,1962",previous_day.getdate(15, 12, 1962));
 }
 // equivalence class
 public void test14(){
	 assertEquals("invalid date",previous_day.getdate(-1, 12, 1962));
 } 
 public void test15(){
	 assertEquals("invalid date",previous_day.getdate(1, -1, 1962));
 }
 public void test16(){
	 assertEquals("invalid date",previous_day.getdate(1, 12, 1899));
 }
 public void test17(){
	 assertEquals("invalid date",previous_day.getdate(32, 6, 1962));
 }
 public void test18(){
	 assertEquals("invalid date",previous_day.getdate(15, 13, 1962));
 }
 public void test19(){
	 assertEquals("invalid date",previous_day.getdate(15, 6, 2026));
 } 
 public void test20(){
	 assertEquals("invalid date",previous_day.getdate(29, 2, 1962));
 } 
}
 