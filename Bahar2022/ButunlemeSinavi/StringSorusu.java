package ButunlemeSinavi;

public class StringSorusu {


public static boolean isAllVowels(String s) {
	for(int i=0;i<s.length();i++) {
		String letter=s.substring(i,i+1);
		if(!isVowels(letter)) {
			return false;
		}
	}
	return true;
}
public static boolean isVowels(String s) {
	return s.equalsIgnoreCase("a")||s.equalsIgnoreCase("e")||s.equalsIgnoreCase("i")||
			s.equalsIgnoreCase("o")||s.equalsIgnoreCase("u");
}
	}


