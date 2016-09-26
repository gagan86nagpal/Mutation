package classes;

public class valid_Date {
		public static boolean check(int day, int month, int year){

		// check validity
		int validDate = 0;
		boolean output = false;
		 if(year >=1900 && year <=2025){
			 if(month == 1 || month == 3 || month == 5 || month == 7 || month ==8 || month == 10 || month == 12){
				 if(day >=1 && day <=31){
					 validDate = 1;
				 }
				 else{
					 validDate =0;
				 }
			 }
			 else if(month ==2){
				 int rVal = 0;
				 if(year%4 == 0){
					 rVal =1;
					 if(((year%100) ==0)  && ((year%400) != 0)){
						 rVal = 0;
					 }
				 }
				 if(rVal ==1 && (day>=1 && day<=29)){
					 validDate =1;
				 }
				 else if(day>=1&& day <=28){
					 validDate = 1;
				 }
				 else{
					 validDate =0;
				 }
			 }
			 else if((month >=1 && month <=12) && (day>=1 && day<=30)){
				 validDate = 1;
			 }
			 else{
				 validDate =0;
			 }
		 }
		 
		 if(validDate ==1){
			 output  = true;
		 }
		 else{ 
			 output = false;
		 }
		return output;
		}
}
		 