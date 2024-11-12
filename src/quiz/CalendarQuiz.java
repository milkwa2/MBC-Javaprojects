package quiz;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarQuiz {
	  public static void main(String[] args) {
   // 년, 월, 일을 입력받고 해당 날짜가 무슨 요일인지 출력하는 프로그램 작성하세요. 

		  Scanner sc = new Scanner(System.in);

           System.out.println("년을 입력하세요"); 
           int a = sc.nextInt();
           System.out.println("월을 입력하세요");
           int b = sc.nextInt();
           System.out.println("일을 입력하세요");
           int c = sc.nextInt();
           int year = a;
           int month = b;
           int date = c;

  
      String dayOfWeek = getDayOfWeek(year, month, date);
      System.out.println(dayOfWeek);
 
 
      
   }
   
   static String getDayOfWeek(int year, int month, int date) {
      Calendar cal = Calendar.getInstance();
      cal.set(Calendar.YEAR, year);
      cal.set(Calendar.MONTH, month - 1);
      cal.set(Calendar.DATE, date);
      
      
      
      switch (cal.get(Calendar.DAY_OF_WEEK)) {
         case Calendar.MONDAY:
            return "월요일";
         case Calendar.TUESDAY:
            return "화요일";
         case Calendar.WEDNESDAY:
            return "수요일";
         case Calendar.THURSDAY:
            return "목요일";
         case Calendar.FRIDAY:
            return "금요일";
         case Calendar.SATURDAY:
            return "토요일";
         default:
            return "일요일";
            
            
      }
      
      
   }

}
