package com.rohit.strings;

import java.util.HashMap;
import java.util.Map;

/*
 * Print characters and their frequencies in order of occurrence
Given a string str containing only lowercase characters. The problem is to print the characters along with their frequency in the order of their occurrence and in the given format explained in the examples below.

Examples:

Input : str = "geeksforgeeks"
Output : g2 e4 k2 s2 f1 o1 r1

Input : str = "elephant"
Output : e2 l1 p1 h1 a1 n1 t1
 */
public class CharacterFrequenciesInString {

	public static void main(String[] args) {

		String str = "Aanchal".toUpperCase();
//		System.out.println(str.length());
		
		char c[] = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i =0;i<=c.length-1;i++)
		{
			System.out.println(c[i]);
			if(!map.containsKey(c[i]))
			{
				map.put(c[i], 1);
			}
			else
			{
				int val = map.get(c[i]) +1;
				map.put(c[i], val);
			}
		}
		System.out.println(map);

	}

}
