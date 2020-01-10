package challengesCodeSignal;

import java.util.ArrayList;
import java.util.List;

public class Lrc2subRip {
	/*["1", 
	 "00:00:12,000 --> 00:00:17,200", 
	 "Happy birthday dear coder,", 
	 "", 
	 "2", 
	 "00:00:17,200 --> 00:00:20,000", 
	 "Happy birthday to you!"]*/

	String[] lrc2subRip(String[] lrcLyrics, String songLength) {
		String[] sub = new String[(lrcLyrics.length-1)*4+3];
		String nos, words,hh="00",mm="00",ss,ms,modTim;
		List<String> timer = new ArrayList<String>();
		List<String> names = new ArrayList<String>();
		int int_hh,int_mm;
		for(String strEle:lrcLyrics) {
			nos= strEle.replaceAll("\\[|\\]|\\D", "");
			System.out.println("nos are "+nos);
			mm = nos.substring(0, 2);
			System.out.println("minutes is "+mm);
			ss = nos.substring(2, 4);
			System.out.println("Seconds is "+ss);
			ms = ","+nos.substring(4, 6)+"0";
			System.out.println("milli seconds is "+ms);
			int_hh = Integer.parseInt(mm);
			if(int_hh>59) {
				int_mm=int_hh%60;
				mm=String.valueOf(int_mm);
				System.out.println("int of min is "+int_mm);
				System.out.println("String format of mm is "+mm);
				hh=String.format("%02d", int_hh/=60);
				System.out.println("int of hours is "+int_hh);
				System.out.println("Sting format of hh is "+hh);	
			}		
			modTim = hh+":"+mm+":"+ss+ms;
			System.out.println("modified time is "+modTim);
			words = strEle.substring(11, strEle.length());
			System.out.println("words are "+words);
			timer.add(modTim);
			System.out.println(timer.toString());
			names.add(words);
			System.out.println(names.toString());
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lrcLyrics = {"[00:12.00] Happy birthday dear coder,", "[00:17.20] Happy birthday to you!"};
		String songLength = "00:00:20";
		String[] subRip = new Lrc2subRip().lrc2subRip(lrcLyrics, songLength);
	}

}
