package classes;
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3, section 3.3, page 121

// Jeff Offutt--Java version Feb 2003
// Classify triangles


public class trityp
{
   private static String[] triTypes = { "", "scalene", "isosceles", "equilateral", "not a valid triangle"};
//   private static String instructions = "This is the ancient TriTyp program.\nEnter three integers that represent the lengths of the sides of a triangle.\nThe triangle will be categorized as either scalene, isosceles, equilateral\nor invalid.\n";


// ====================================
// The main triangle classification method
public static String Triang (int Side1, int Side2, int Side3)
{
   int triOut =-1;
   
   // triOut is output from the routine:
   //    Triang = 1 if triangle is scalene
   //    Triang = 2 if triangle is isosceles
   //    Triang = 3 if triangle is equilateral
   //    Triang = 4 if not a triangle

   // After a quick confirmation that it's a valid
   // triangle, detect any sides of equal length
   if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
   {
      triOut = 4;      
      return (triTypes[triOut]);
   }

   triOut = 0;
   if (Side1 == Side2){
      triOut = triOut + 1;}
   if (Side1 == Side3){
      triOut = triOut + 2;}
   if (Side2 == Side3){
      triOut = triOut + 3;}
   if (triOut == 0)
   {  // Confirm it's a valid triangle before declaring
      // it to be scalene

     if (Side1+Side2 <= Side3 || Side2+Side3 <= Side1 || Side1+Side3 <= Side2){
        triOut = 4;}
     else{
        triOut = 1;}
     return (triTypes[triOut]);
	 
   }

   // Confirm it's a valid triangle before declaring
   // it to be isosceles or equilateral

   if (triOut > 3){
      triOut = 3;}
   else if (triOut == 1 && Side1+Side2 > Side3){
      triOut = 2;}
   else if (triOut == 2 && Side1+Side3 > Side2){
      triOut = 2;}
   else if (triOut == 3 && Side2+Side3 > Side1){
      triOut = 2;}
   else{
      triOut = 4;}
   return (triTypes[triOut]);
} // end Triang

// ====================================


}  // end trityp class
