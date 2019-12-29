package codeSignalPacka;

import java.util.Arrays;

public class AddBorder {
	String[] addBorder(String[] picture) {
		String[] newPic = new String[picture.length+2];
		String bo = ""; int i=1;
		while(i<=picture[0].length()+2) {
			bo=bo.concat("*");
			i++;
		}
		System.out.println("border is "+bo);
		newPic[0] = bo;
		newPic[newPic.length-1] = bo;
		for(int j=0;j<picture.length;j++) {
			newPic[j+1] = "*"+picture[j]+"*";
		}
		return newPic;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] pic = {"abc","ded"};
		String[] t = new AddBorder().addBorder(pic);
		System.out.println(Arrays.toString(t));
	}

}
