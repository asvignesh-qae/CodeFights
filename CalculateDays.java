package challengesCodeSignal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.annotation.Generated;

public class CalculateDays {

	public String noOfDays(String ts1, String ts2) throws ParseException{
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Date d1 = form.parse(ts1);
		Date d2 = form.parse(ts2);
		System.out.println(d1.toString());
		System.out.println(d2.toString());
		if(d2.getMonth()!=d1.getMonth()){
			System.out.println("d2 month is "+d2.getMonth());
			System.out.println("d1 month is "+d1.getMonth());
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(d1);
		
		long diff = d2.getTime() - d1.getTime();
		long diffMinutes = diff / (60 * 1000) % 60;
		long diffHours = diff / (60 * 60 * 1000) % 24;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		System.out.println("minutes difference is "+diffMinutes);
		System.out.println("Hours difference is "+diffHours);
		System.out.println("days difference is "+diffDays);
		cal.add(cal.DATE, -Integer.parseInt(""+diffDays));
		System.out.println("DAte after subtracting is "+cal.getTime());
		System.out.println(d1.getDate()-diffDays);
		int ts1_Date = Integer.parseInt(ts1.substring(8, 10));
		int ts2_Date = Integer.parseInt(ts2.substring(8, 10));
		int diff_Date = ts2_Date-ts1_Date>0?ts2_Date-(ts1_Date+1):0;
		int final_Date = ts1_Date - diff_Date;
		int ts1_h = Integer.parseInt(ts1.substring(11, 13));
		int ts1_m = Integer.parseInt(ts1.substring(14, 16));
		//int ts1_totMins = 1440-((ts1_hour*60)+ts1_mins);
		int ts1_totMins = diff_Date>0?1440-((ts1_h*60)+ts1_m):(ts1_h*60)+ts1_m;
		int ts2_h = Integer.parseInt(ts2.substring(11, 13));
		int ts2_m = Integer.parseInt(ts2.substring(14, 16));
		int ts2_totMins = ts2_h*60+ts2_m;
		//int tot_Mins = ts2_h-ts1_h>0?ts1_totMins+ts2_totMins:ts2_totMins-ts1_totMins;
		int tot_Mins = diff_Date>0?ts1_totMins+ts2_totMins:ts2_totMins-ts1_totMins;
		System.out.println("The date is "+ts1_Date);
		System.out.println("Difference date is "+diff_Date);
		System.out.println("final date is "+final_Date);	
		System.out.println("The hour is "+ts1_h);
		System.out.println("The mins is "+ts1_m);
		System.out.println("The hour is "+ts2_h);
		System.out.println("The mins is "+ts2_m);
		System.out.println("Total ts1 Minutes is "+ts1_totMins);
		System.out.println("Total ts2 Minutes is "+ts2_totMins);
		System.out.println("Total Mins difference is "+tot_Mins);
		/*Date d3 = d1;
		System.out.println("Date 3 is "+d3);
		d3.setDate(d1.getDate()-diff_Date);
		System.out.println("Date 3 after changing date is "+d3);
		d3.setHours(tot_Mins/60);
		System.out.println("Date 3 after changing hour is "+d3);
		d3.setMinutes(tot_Mins%60);
		System.out.println("Date 3 after changing min is "+d3);*/
		String ts3 = ts1;
		System.out.println("ts3 before replace is "+ts3);
		ts3 = ts3.replaceAll(ts3.substring(8, 10), String.format("%02d", final_Date));
		System.out.println("ts3 after date replace is "+ts3);
		ts3 = ts2_h==ts1_h?ts3:ts3.replaceAll(ts1.substring(11, 13), String.format("%02d", tot_Mins/60));
		System.out.println("ts3 after hour replace is "+ts3);
		ts3 = ts2_totMins-ts1_totMins<60?ts3.replaceAll(ts1.substring(14, 16), String.format("%02d", ts1_m-(ts2_totMins-ts1_totMins))):ts3.replaceAll(ts1.substring(14, 16), String.format("%02d", tot_Mins%60));
		System.out.println("ts3 after Minute replace is "+ts3);
		return ts3;
	}
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		/*String srttym = "2016-08-26 22:40";
		String endtym = "2016-08-29 10:00";*/
		/*String srttym = "2016-08-26 22:40";
		String endtym = "2016-08-26 22:41";*/
		String srttym = "2015-01-14 09:12";
		String endtym = "2015-11-04 17:36";
		String d = new CalculateDays().noOfDays(srttym, endtym);
		System.out.println("diff is "+d);
	}

}
