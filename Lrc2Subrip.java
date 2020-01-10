package challengesCodeSignal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lrc2Subrip {
	String ar = "-->";
	String nos, words,hh="00",mm="00",ss,ms,modTim;
	int int_hh,int_mm;
	String[] lrc2subRip(String[] lrcLyrics, String songLength) {
		String[] sub = new String[(lrcLyrics.length-1)*4+3];
		List<String> timer = new ArrayList<String>();
		List<String> names = new ArrayList<String>();
		for(String strEle:lrcLyrics) {
			modTim = getWords(strEle);
			words = strEle.substring(11, strEle.length());
			timer.add(modTim);
			names.add(words);
		}
		timer.add(songLength+",000");
		System.out.println(timer.toString());
		System.out.println(names.toString());
		for(int i=0;i<lrcLyrics.length;i++){
			sub[i] = ""+(i+1);
			sub[i+1] = timer.get(0)+ar+timer.get(1);
		}
		System.out.println(Arrays.toString(sub));
		return sub;
		
	}
	String getWords(String word){
		nos= word.replaceAll("\\[|\\]|\\D", "");
		mm = nos.substring(0, 2);
		ss = nos.substring(2, 4);
		ms = ","+nos.substring(4, 6)+"0";
		int_hh = Integer.parseInt(mm);
		if(int_hh>59) {
			mm=String.valueOf(int_hh%60);
			hh=String.format("%02d", int_hh/=60);
		}		
		modTim = hh+":"+mm+":"+ss+ms;
		return modTim;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lrcLyrics  = {"[00:12.00] Happy birthday dear coder,", "[00:17.20] Happy birthday to you!"};
		String sortLength = "00:00:20";
		String[] lrc2Sub = new Lrc2Subrip().lrc2subRip(lrcLyrics, sortLength);
		//System.out.println(lrc2Sub.toString());
	}

}
