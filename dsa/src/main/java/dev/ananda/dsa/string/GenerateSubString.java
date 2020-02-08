package dev.ananda.dsa.string;

public class GenerateSubString {
	
	public void generateSubString(String pattern) {
		for (int i = 0; i < pattern.length(); i++) {
			for (int j = i + 1; j <= pattern.length(); j++) {
				System.out.println(pattern.substring(i, j));
			}
		}
	}

}
