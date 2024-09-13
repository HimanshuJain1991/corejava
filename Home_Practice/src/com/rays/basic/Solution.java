package com.rays.basic;

public class Solution {
	// Function to reverse words in a given string.
	String reverseWords(String s) {
		String reverse = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			reverse = reverse + s.charAt(i);
		}
		return reverse;
	}

	public static void main(String args[]) {
		String s = "My Name is Himanshu Jain";
		Solution s2 = new Solution();
		s2.reverseWords(s);
	}
}