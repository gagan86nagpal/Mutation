package classes;
// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 2, section 2.4, page 74

public class trashAndTakeOut
{
public static int trash (int x)    
{                         
   int m=0, n=0, o=0;                      
   if (x > 0)               
      m = 4;                
   if (x > 5){              
      n = 3*m; 
   }
   else{                     
      n = 4*m;
   }
   o = takeOut (m, n);
   return o;
   //System.out.println ("o is: " + o);  
}

public static int takeOut (int a, int b) 
{
   int d=0, e=0;
   d = 42*a; 
   if (a > 0){ 
      e = 2*b+d;      
   }
   else {
      e = b+d;} 
   return (e); 
}
}
