// Introduction to Software Testing
// Authors: Paul Ammann & Jeff Offutt
// Chapter 3, section 3.3, page 130
package classes;
public class checkit
{

public static String getcheck (boolean a, boolean b, boolean c)
{  
	String output ="";
   if (a && (b || c))
   {
	   output=  "P is true";
   }
   else
   {
	   output=  "P isn't true";
   }
   return output;
}
}
/*
public static void main (String []argv)
{  // Driver method for checkIt
   // Read an array from standard input, call checkIt()
   boolean []inArr = new boolean [argv.length];
   if (argv.length != 3)
   {
      System.out.println ("Usage: java checkIt v1 v2 v3");
      return;
   }

   for (int i = 0; i< argv.length; i++)
   {
      inArr [i] = Boolean.parseBoolean(argv[i]);
   }

   checkIt (inArr[0], inArr[1], inArr[2]);
}
*/

