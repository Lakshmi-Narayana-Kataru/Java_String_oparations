package com.learning.practice;

import java.util.Arrays;

public class Remove_Duplicate_charectors_in_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "narayana";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = new char[s1.length()];
		int j =0;
		Arrays.sort(ch1);
		for(int i=0;i<ch1.length-1;i++) {
			if(ch1[i]!=ch1[i+1]) {
				ch2[j++]=ch1[i];
			}
		}
		ch2[j++]=ch1[ch1.length-1];
		System.out.println(ch2);

	}

}
