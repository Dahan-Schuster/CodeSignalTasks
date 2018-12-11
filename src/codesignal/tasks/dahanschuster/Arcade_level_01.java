package codesignal.tasks.dahanschuster;

public class Arcade_level_01 {

	public static int add(int param1, int param2) {
		return param1 + param2;
	}

	public static int centuryFromYear(int year) {
		if (year % 100 != 0) {
			return (int) (year / 100) + 1;
		} else {
			return year / 100;
		}
	}

	public static boolean checkPalindrome(String inputString) {
		String p = "";
		for (int i = inputString.length() - 1; i >= 0; i--) {
			p += inputString.charAt(i);
		}

		if (p.equals(inputString))
			return true;

		return false;
	}

}
