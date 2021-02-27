package co.in.exersiseQuestions;

import java.util.Date;
import java.text.SimpleDateFormat;
public class TestDate {
   public static void main(String[]args)  {
	   Date d = new Date();
	   SimpleDateFormat sd = new SimpleDateFormat("dd/mm/yyyy");
	   String newdate = sd.format(d);
	System.out.println(newdate);
	
	System.out.println("one day before date" );
   }
	}


