package codesignal.tasks.dahanschuster;

import java.util.ArrayList;
import java.util.List;

public class Arcade_level_03 {

	public static String[] allLongestStrings(String[] a) {
		int len = 0;

		List<String> longest = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > len) {
				len = a[i].length();
				longest.clear();
			}

			if (a[i].length() == len)
				longest.add(a[i]);
		}

		String[] outPutStrings = new String[longest.size()];
		for (int k = 0; k < longest.size(); k++) {
			outPutStrings[k] = longest.get(k);
		}

		return outPutStrings;
	}

	public static int commonCharacterCount(String s1, String s2) {
		int len = Math.max(s1.length(), s2.length());

		String regex;

		String news1 = s1;

		for (int i = 0; i < len; i++) {

			try {
				regex = String.valueOf(s2.charAt(i));
				System.out.println(regex);

				news1 = news1.replaceFirst(regex, "");
				System.out.println(news1 + "\n");
			} catch (IndexOutOfBoundsException e) {
				break;
			}

		}

		return s1.length() - news1.length();

	}

	public static boolean isLucky(int n) {
		int divisorLength = ("" + n).length() / 2;
		String divisorString = "1";

		for (int i = 1; i <= divisorLength; i++) {
			divisorString += "0";
		}

		int divisor = Integer.parseInt(divisorString);

		String f = "" + n / divisor;
		String s = "" + n % divisor;

		System.out.println(f);
		System.out.println(s);

		int firstSum = 0;
		int secondSum = 0;

		for (char k : f.toCharArray()) {
			firstSum += Integer.parseInt("" + k);
		}

		for (char k : s.toCharArray()) {
			secondSum += Integer.parseInt("" + k);
		}

		return (firstSum == secondSum);
	}

	public static int[] sortByHeight(int[] a) {
		ArrayList<Integer> people = new ArrayList<>();
		ArrayList<Integer> indexes = new ArrayList<>();
		ArrayList<Integer> all = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				indexes.add(i);
			} else {
				people.add(a[i]);
				indexes.add(-1);
			}

		}

		people.sort(null);

		for (int i = 0; i < indexes.size(); i++) {
			if (indexes.get(i) != -1) {
				all.add(-1);
			} else {
				all.add(people.get(0));
				people.remove(0);
			}
		}

		int[] output = new int[all.size()];
		for (int i = 0; i < all.size(); i++) {
			output[i] = all.get(i);
		}

		return output;
	}

	public static String reverseParentheses(String inputWord /* The ((quick (brown) (fox) jumps over the lazy) dog) */) {
		String outputWord = inputWord; // Should be "afecdb"

		int firstParenthesesIndex = -1;
		int lastParenthesesIndex = -1;

		String reverseInsideParentheses = "";
		String leftSide = "";
		String rightSide = "";

		boolean isParenthesesReverse = false;

		char FIRST_PARENTHESES = '(';
		char LAST_PARENTHESES = ')';

		System.out.println("INPUTWORD: " + inputWord+"\n");
		
		while (inputWord.contains("(")) {

			firstParenthesesIndex = -1;
			lastParenthesesIndex = -1;

			reverseInsideParentheses = "";


			if (isParenthesesReverse) {
				FIRST_PARENTHESES = ')';
				LAST_PARENTHESES = '(';
			} else {
				FIRST_PARENTHESES = '(';
				LAST_PARENTHESES = ')';
			}

			int firstParenthesesCount = 0;
			int lastParenthesesCount = 0;


			for (int i = 0; i < inputWord.length(); i++) {
				if (inputWord.charAt(i) == FIRST_PARENTHESES) {
					firstParenthesesCount++;
					if (firstParenthesesIndex == -1) {
						firstParenthesesIndex = i;
					}
				} else if (inputWord.charAt(i) == LAST_PARENTHESES) {
					lastParenthesesCount++;
					if (firstParenthesesCount == lastParenthesesCount) {
						lastParenthesesIndex = i;
						break;
					}
				}

				/**
				 * For monitoring the indexes where the firstParentheses and the
				 * lastParentheses' are found Actually, the last parentheses index is not showed
				 * 'cause the 'break' statement stops the 'for' block before the i variable
				 * receive thhe value. So, the index where the lastParentheses were found is the
				 * one after the last 'i' printed on screen.
				 * 
				 * System.out.print("i: " + i + " -> "); System.out.print(firstParenthesesIndex
				 * + " / " + lastParenthesesIndex); System.out.println("");
				 */
			}

			leftSide = inputWord.substring(0, firstParenthesesIndex);
			String insideParentheses = inputWord.substring(firstParenthesesIndex + 1, lastParenthesesIndex);
			rightSide = inputWord.substring(lastParenthesesIndex + 1);

			for (int i = insideParentheses.length() - 1; i >= 0; i--) {
				reverseInsideParentheses += insideParentheses.charAt(i);
			}

			inputWord = leftSide + reverseInsideParentheses + rightSide;

			outputWord = inputWord;

			System.out.println("PARTIAL OUTPUTWORD: " + outputWord + "\n");

			if (reverseInsideParentheses.contains(")"))
				isParenthesesReverse = !isParenthesesReverse;
		}

		return "FINAL OUTPUT: " + outputWord;
	}

}
