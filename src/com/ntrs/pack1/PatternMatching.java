package com.ntrs.pack1;

public class PatternMatching {

	public static void main(String[] args) {

		
		String paragraph = "AABCABCABC";
		
		
		
		String finapattern=null;
		String[] para = paragraph.split("");
		int index = 2;
		int k = 0, count, previousValue = 0;
		// char[] para=paragraph.toCharArray();
		for (int i = 0; i < paragraph.length(); i++) {
			k = i + index;
			count = 0;
			if (k <= paragraph.length()) {

				String sub = paragraph.substring(i, k);

				for (int j = i,m=i+index; j <= paragraph.length()&&m <= paragraph.length(); j++,m++) {
					if (sub.equals(paragraph.substring(j,m))) {
						count++;
					}

				}
				if (count > previousValue) {
					previousValue = count;
					  finapattern=sub;
					  
					  
				}
			}
		}
		System.out.println("pattern"+finapattern);
	}

}
