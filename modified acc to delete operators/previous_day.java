package classes;

public class previous_day{
	
public static String getdate(int day, int month, int year){

// check validity
int validDate = 0;
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
 //  previous date calculation
 if(validDate == 1){
	 if(day==1){
		 if(month==1){
			 year = year -1;
			 day =31;
			 month = 12;
		 }
		 else if(month ==3){
			 int rVal = 0;
			 if(year%4==0){
				 rVal =1;
				 if((year%100) == 0  && (year%400)!=0){
					 rVal =0;
				 }
			 }
			 if(rVal ==1){
				 day = 29;
				 month = month -1;
			 }
			 else{
				 day = 28;
				 month = month-1;
			 }
		 }
		 else if (month==2 || month==4 || month==6 || month ==9 || month==11){
			 day =31;
			 month = month-1;	
			 }
		 else{
			 day=30;
			 month = month-1;
		 }
	 }
	 else{
		 day = day-1;
	 }
	 return day+","+month+","+year;
  }
   else {
	   return "invalid date";}
 }
}

	 