package classes;

public class max_three {
	public static int getmax(int A, int B, int C){
	
	int output = -2;
	/*Check for greatest of three numbers*/
	if(A>100 || A<0 || B>100 || B<0 || C >100 || C<0){
		output = -1;
	}
	else{
	if(A>B) {
		if(A>C) {	    
	       output = A ;
		}
		else {
	       output = C;
		}
	}
	else {
		if(C>B) {
			output  =C;
		}
		else {
			output =B;
		}
	}	
   }
	return output;
  }
}