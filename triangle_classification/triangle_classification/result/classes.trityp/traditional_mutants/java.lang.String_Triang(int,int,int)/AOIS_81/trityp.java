// This is mutant program.
// Author : ysma

package classes;


public class trityp
{

    public static java.lang.String Triang( int Side1, int Side2, int Side3 )
    {
        int validInput = 0;
        java.lang.String output = "";
        if (Side1 > 0 && Side1 <= 100 && Side2 > 0 && Side2 <= 100 && Side3 > 0 && Side3 <= 100) {
            if (Side1 + Side2 > Side3 && Side3 + Side1 > Side2 && Side2 + Side3 > Side1) {
                validInput = 1;
            }
        } else {
            validInput = -1;
        }
        if (validInput == 1) {
            if (Side1 == Side2 && Side2 == Side3) {
                output = "equilateral";
            } else {
                if (Side1 == Side2++ || Side2 == Side3 || Side1 == Side3) {
                    output = "isosceles";
                } else {
                    output = "scalene";
                }
            }
        } else {
            if (validInput == 0) {
                output = "not a valid triangle";
            } else {
                output = "invalid input";
            }
        }
        return output;
    }

}
