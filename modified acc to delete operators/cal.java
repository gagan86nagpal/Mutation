package classes;
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 5, section 5.2, page 190
//import java.io.*;

public class cal
{

public static int cal (int month1, int day1, int month2, int day2, int year)
{
//***********************************************************
// Calculate the number of Days between the two given days in
// the same year.
// preconditions : day1 and day2 must be in same year
//               1 <= month1, month2 <= 12
//               1 <= day1, day2 <= 31
//               month1 <= month2
//               The range for year: 1 ... 10000
//***********************************************************
   int numDays=0;
   if ( (month1 < 1) || (month1 > 12) )
   {
	   numDays = -1;
      return numDays;
   //   month1 = 1;
     // System.out.println ("invalid month1, choosing 1.");
   }
   if ((month2 < 1) || (month2 > 12) )
   {
	   numDays = -1;
      return numDays;
      //System.out.println ("invalid month2, choosing 1.");
   }
   if ( (day1 < 1) || (day1 > 31) )
   {
	   numDays = -1;
      return numDays;// invalid
      //System.out.println ("invalid day1, choosing 1.");
   }
   if ( (day2 < 1) || (day2 > 31) )
   {
	   numDays = -1;
      return numDays;
      //System.out.println ("invalid day2, choosing 1.");
   }
   
   if ( (year < 1) || (year > 10000) )
   {
	   numDays = -1;
	   return numDays;
      //System.out.println ("invalid year, choosing 1.");
   }
  
   if (month2 == month1){ // in the same month
      numDays  = day2 - day1;
   }
   else
   { 
      // Skip month 0.
      int daysIn[] = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      // Are we in a leap year?
      int m4=0,m100 =0, m400 =0;
      m4 = year % 4; 
      m100 = year % 100;
      m400 = year % 400;
      if ((m4 != 0) || ((m100 == 0) && (m400 != 0))){
         daysIn[2] = 28; 
      }
      else{
         daysIn[2] = 29;}

      // start with days in the two months
      numDays = day2 + (daysIn[month1] - day1);

      // add the days in the intervening months
      for (int i = month1 + 1; i <= month2-1; i++){
         numDays = daysIn[i] + numDays;
      }
   }
   return (numDays);
	}
}

