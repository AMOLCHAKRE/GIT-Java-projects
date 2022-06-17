package coreJava_part_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		System.out.println(date.toString());
		
		SimpleDateFormat SDF = new SimpleDateFormat("M/dd/yyyy");
		SDF.format(date);
		System.out.println(SDF.format(date));
		
		SimpleDateFormat SD = new SimpleDateFormat("M/dd/yyyy hh:mm:ss");
		System.out.println(SD.format(date));
		

	}

}
