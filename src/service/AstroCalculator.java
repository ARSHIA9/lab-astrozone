package service;

// Type your code
public class AstroCalculator
{
	public String findSign(model.User u)
	{
//	    String dob= u.dob;
//		String d = u.dob.substring(0,2);
//		String m = u.dob.substring(3,5);
//		int date = Integer.parseInt(d);
//		int month = Integer.parseInt(m) ;
//		String sign="";		
		String dob=u.getDob();		
		String[] arr=dob.split("-");		
		int date= Integer.parseInt(arr[0]);		
		int month=Integer.parseInt(arr[1]);

		
	if ((date>21 && month == 12) || (date<=19 && month== 1)){
           return  "Capricorn";
       }
       if ((date>20 && month ==1) || (date<=18 && month == 2)){
           return "Aquarius";
       }
       if ((date>19 && month == 2) || (date <=20 && month == 3)){
           return "Pisces";
       }
       if ((date>21 && month == 3) || (date <=20 && month == 4)){
           return "aries";
       }
       if ((date>21 && month == 4) || (date <=20 && month == 5)){
           return "Taurus";
       }
       if ((date>21 && month == 5) || (date<=20 && month == 6)){
           return "Gemini";
       }
       if ((date>21 && month == 6) || (date<=20 && month == 7)){
           return "Cancer";
       }
       if ((date>21 && month  == 7) || (date<=20 && month== 8)){
           return "Leo";
       }
       if ((date>21 && month ==8) || (date<=22 && month == 9)){
           return "Virgo";
       }
       if ((date>23 && month == 9) || (date<=20 && month ==10)){
           return "Libra";
       }
       if ((date>21 && month == 10) || (date<=22 && month == 11)){
           return "Scorpio";
       }
       if ((date>23 && month == 11) || (date<=20 && month == 12)){
           return "Sagitarius";
       }
       else
    	   return ("please enter all the values");
}
}