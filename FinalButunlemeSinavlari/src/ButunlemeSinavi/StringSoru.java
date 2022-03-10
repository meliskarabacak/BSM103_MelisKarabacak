package ButunlemeSinavi;

public class StringSoru {

	/*
	 * bir String yapisinin tamamensesli harflerden(a,e,i,o,u ve buyuk/kucuk harfe
	 * duyarsiz olarak) olusup olusmadigini donduren isAllVowels adli bir yontem
	 * yazin.isAllVowels yontemi girdi parametresi olarak String almali ve cikti
	 * parametresi olarak boolean dondurmeli.eger Stringin her karekteri bir sesli
	 * ise, yonteminiz true dondurmeli.Ornegin isAllVowels ("aeiou") cagrisi true ve
	 * isAllVowels ("oink") false dondurur.Bos String girdisi aldiysa, true
	 * dondurmelisiniz
	 */
	public static boolean isAllVowels(String s) {
		for (int i = 0; i < s.length(); i++) {
			String letter = s.substring(i, i + 1);
			if (!isVowels(letter)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isVowels(String s) {
		return s.equalsIgnoreCase("a") || s.equalsIgnoreCase("e") || s.equalsIgnoreCase("i") || s.equalsIgnoreCase("o")
				|| s.equalsIgnoreCase("u");

	}
}
