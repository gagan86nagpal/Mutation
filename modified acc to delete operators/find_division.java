package classes;

public class find_division {
	
 public static String cal_division(int mark1, int mark2, int mark3){
	 int avg=0;
	 String output="";
	if(mark1>100 || mark1 <0 || mark2>100 || mark2<0 || mark3>100 || mark3<0){
		output="invalid marks";
	}
	else{
		avg = (mark1 + mark2 + mark3) /3;
		if (avg<40){
			output= "Fail";
		}
		else if(avg>=40 && avg<50){
			output= "Third division";
		}
		else if(avg>=50 && avg<60){
			output= "Second division";
		}
		else if(avg>=60 && avg<75){
			output= "First division";
		}
		else {
			output= "First division with distinction";
		}
	}  	
	return output;
  }
}