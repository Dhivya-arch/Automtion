package com.ntrs.pack1;

public class RepeatingWords {

	public static void main(String[] args) {
		String essay="This is the test string to find the most repeating words in the given string ";
		String[] words=essay.split("\\s");
		int previousVal=1;
		String repeat=null;
		for(int i=0;i<words.length;i++)
		{
			int count=0;
			for(int j=0;j<words.length;j++)
			{
				if(words[i].equals(words[j]))
				{
					count=count+1;
				}
				if(count>previousVal)
				{
					previousVal=count;
					repeat=words[i];
				}
			}
		}
			System.out.println("most repeating word"+repeat);
			System.out.println("Count "+previousVal);
			
	}

}
