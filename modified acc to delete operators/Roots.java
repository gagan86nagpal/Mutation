package classes;

public class Roots {
	public static String get_roots(int a, int b,int c){
		int validInput=0,d=0;
		double D=0.0;
		String rtype="";
		String root1="",root2="";
		if((a>=0) && (b>=0) &&(c>=0)){
			validInput =1;
			if(a==0){
				validInput=-1;
			}
	    }
		if(validInput==1){
		   d = b*b - (4 * a * c);
		   if(d==0){
			   rtype =  "equal roots";
		   }
		   else if(d>0){
		        rtype = "real roots";
		   }
		   else{
			   rtype = "imaginary roots";
		   }
	   }
		else if(validInput ==-1){
			rtype ="not a quadratic equation";
		} 
		else{
			rtype = "invalid input";
		} 
		return rtype;
	} 
}