package com.learning.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Occarance_Of_Charector_In_String {
	public static void main(String[] args) {
		String s1 = "narayana";
		HashMap<Character,Integer> occr = new HashMap<>();
		char[] ch1 = s1.toCharArray();
		int size = s1.length();
		for(int i=0;i<size;i++) {
			char c = s1.charAt(i);
			int count =0;
			for(int j =0;j<size;j++) {
				if(c == ch1[j]) {
					++count;
				}
			}
			occr.put(c, count);
		}
		for(Entry<Character, Integer> entry : occr.entrySet()) {
		System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}
}
