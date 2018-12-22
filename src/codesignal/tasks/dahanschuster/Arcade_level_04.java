package codesignal.tasks.dahanschuster;

import java.util.Arrays;

public class Arcade_level_04 {

	/**
	 * Several people are standing in a row and need to be divided into two teams.
	 * The first person goes into team 1, the second goes into team 2, the third
	 * goes into team 1 again, the fourth into team 2, and so on.
	 * 
	 * You are given an array of positive integers - the weights of the people.
	 * Return an array of two integers, where the first element is the total weight
	 * of team 1, and the second element is the total weight of team 2 after the
	 * division is complete.
	 * 
	 * @Example
	 * 
	 * 			For a = [50, 60, 60, 45, 70], the output should be
	 *          alternatingSums(a) = [180, 105].
	 * 
	 * @InputOutput
	 * 
	 * 				[execution time limit] 3 seconds (java)
	 * 
	 * @Input array.integer a
	 * 
	 *        Guaranteed constraints: 1 ≤ a.length ≤ 105, 45 ≤ a[i] ≤ 100.
	 * 
	 * @Output array.integer
	 * 
	 */
	public static int[] alternatingSums(int[] a) {
		int[] output = new int[2];

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0)
				output[0] += a[i];
			else
				output[1] += a[i];
		}
		return output;
	}

	/**
	 * Given a rectangular matrix of characters, add a border of asterisks(*) to it.
	 * 
	 * @Example
	 * 
	 * 			For
	 * 
	 *          picture = ["abc", "ded"] the output should be
	 * 
	 *          addBorder(picture) = ["*****", "*abc*", "*ded*", "*****"]
	 *          Input/Output
	 * 
	 *          [execution time limit] 3 seconds (java)
	 * 
	 * @Input array.string picture
	 * 
	 *        A non-empty array of non-empty equal-length strings.
	 * 
	 *        Guaranteed constraints: 1 ≤ picture.length ≤ 100, 1 ≤
	 *        picture[i].length ≤ 100.
	 * 
	 * @Output array.string
	 * 
	 *         The same matrix of characters, framed with a border of asterisks of
	 *         width 1.
	 * 
	 */
	public static String[] addBorder(String[] picture) {
		String[] newPicture = new String[picture.length + 2];

		newPicture[0] = "*" + picture[0].replaceAll(".", "*") + "*";
		newPicture[newPicture.length - 1] = "*" + picture[0].replaceAll(".", "*") + "*";

		for (int i = 1; i < newPicture.length - 1; i++) {
			newPicture[i] = "*" + picture[i - 1] + "*";
		}
		return newPicture;
	}

	/**
	 * Two arrays are called similar if one can be obtained from another by swapping
	 * at most one pair of elements in one of the arrays.
	 * 
	 * Given two arrays a and b, check whether they are similar.
	 * 
	 * @Example
	 * 
	 * 			For a = [1, 2, 3] and b = [1, 2, 3], the output should be
	 *          areSimilar(a, b) = true.
	 * 
	 *          The arrays are equal, no need to swap any elements.
	 * 
	 *          For a = [1, 2, 3] and b = [2, 1, 3], the output should be
	 *          areSimilar(a, b) = true.
	 * 
	 *          We can obtain b from a by swapping 2 and 1 in b.
	 * 
	 *          For a = [1, 2, 2] and b = [2, 1, 1], the output should be
	 *          areSimilar(a, b) = false.
	 * 
	 *          Any swap of any two elements either in a or in b won't make a and b
	 *          equal.
	 * 
	 * @InputOutput
	 * 
	 * 				[execution time limit] 3 seconds (java)
	 * 
	 *              [input] array.integer a
	 * 
	 *              Array of integers.
	 * 
	 *              Guaranteed constraints: 3 ≤ a.length ≤ 105, 1 ≤ a[i] ≤ 1000.
	 * 
	 * @Input array.integer b
	 * 
	 *        Array of integers of the same length as a.
	 * 
	 *        Guaranteed constraints: b.length = a.length, 1 ≤ b[i] ≤ 1000.
	 * 
	 * @Output boolean
	 * 
	 *         true if a and b are similar, false otherwise.
	 * 
	 */
	public static boolean areSimilar(int[] a, int[] b) {
		int aDifferent = -1; // 1 <= a[n] <= 1000
		int bDifferent = -1; // 1 <= b[n] <= 1000
		boolean output = true;
		int differenceFoundCount = 0;

		for (int k = 0; k < a.length; k++) {
			System.out.println("Loop nº " + (k + 1) + ":");
			System.out.println("");
			if (a[k] != b[k]) {

				differenceFoundCount++;

				System.out.println(a[k] + " != " + b[k]);
				System.out.println("Difference found: " + differenceFoundCount);

				if (a[k] == bDifferent && b[k] == aDifferent) {
					output = true;
				} else if (differenceFoundCount > 1)
					return false;

				aDifferent = a[k];
				bDifferent = b[k];

				System.out.println("a different = " + aDifferent);
				System.out.println("b different = " + bDifferent);
			}
		}
		return output;
	}

	/**
	 * You are given an array of integers. On each move you are allowed to increase
	 * exactly one of its element by one. Find the minimal number of moves required
	 * to obtain a strictly increasing sequence from the input.
	 * 
	 * @Example
	 * 
	 * 			For inputArray = [1, 1, 1], the output should be
	 *          arrayChange(inputArray) = 3.
	 * 
	 * @InputOutput
	 * 
	 * 				[execution time limit] 3 seconds (java)
	 * 
	 * @input array.integer inputArray
	 * 
	 *        Guaranteed constraints: 3 ≤ inputArray.length ≤ 105, -105 ≤
	 *        inputArray[i] ≤ 105.
	 * 
	 * @output integer
	 * 
	 *         The minimal number of moves needed to obtain a strictly increasing
	 *         sequence from inputArray. It's guaranteed that for the given test
	 *         cases the answer always fits signed 32-bit integer type.
	 * 
	 */
	public static int arrayChange(int[] inputArray) {
		int total = 0;
		for (int i = 0; i < inputArray.length - 1; i++) {
			if (inputArray[(i + 1)] <= inputArray[i]) {
				inputArray[(i + 1)]++;
				total++;
				i--;
			}
		}
		return total;
	}

	/**
	 * Given a string, find out if its characters can be rearranged to form a
	 * palindrome.
	 * 
	 * @Example
	 * 
	 * 			For inputString = "aabb", the output should be
	 *          palindromeRearranging(inputString) = true.
	 * 
	 *          We can rearrange "aabb" to make "abba", which is a palindrome.
	 * 
	 * @InputOutput
	 * 
	 * 				[execution time limit] 3 seconds (java)
	 * 
	 * @input string inputString
	 * 
	 *        A string consisting of lowercase English letters.
	 * 
	 *        Guaranteed constraints: 1 ≤ inputString.length ≤ 50.
	 * 
	 * @output boolean
	 * 
	 *         true if the characters of the inputString can be rearranged to form a
	 *         palindrome, false otherwise.
	 */
	public static boolean palindromeRearranging(String inputString) {
		inputString += "~"; // Confused about the meaning of that tilde? Visit
							// http://support.ecisolutions.com/doc-ddms/help/reportsmenu/ascii_sort_order_chart.htm
							// for an explain
		String differentLetter = "", iLetters = "";
		char[] letters = inputString.toCharArray();
		Arrays.sort(letters);

		for (int i = 0; i < letters.length - 1; i++) {
			if (letters[i] != letters[(i + 1)]) {
				iLetters = inputString.replaceAll("[^" + letters[i] + "]", "");
				if (iLetters.length() % 2 != 0) {
					if (!differentLetter.equals("" + letters[i])) {
						if (!differentLetter.isEmpty())
							return false;

						differentLetter += letters[i];
					} else
						differentLetter = "";
				}
			}
		}
		return true;
	}

	/**
	 * Call two arms equally strong if the heaviest weights they each are able to
	 * lift are equal.
	 * 
	 * Call two people equally strong if their strongest arms are equally strong
	 * (the strongest arm can be both the right and the left), and so are their
	 * weakest arms.
	 * 
	 * Given your and your friend's arms' lifting capabilities find out if you two
	 * are equally strong.
	 * 
	 * @Example
	 * 
	 * For yourLeft = 10, yourRight = 15, friendsLeft = 15, and friendsRight = 10,
	 * the output should be areEquallyStrong(yourLeft, yourRight, friendsLeft,
	 * friendsRight) = true; For yourLeft = 15, yourRight = 10, friendsLeft = 15,
	 * and friendsRight = 10, the output should be areEquallyStrong(yourLeft,
	 * yourRight, friendsLeft, friendsRight) = true; For yourLeft = 15, yourRight =
	 * 10, friendsLeft = 15, and friendsRight = 9, the output should be
	 * areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) = false.
	 * 
	 * 
	 * @InputOutput
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * @input integer yourLeft
	 * 
	 * A non-negative integer representing the heaviest weight you can lift with
	 * your left arm.
	 * 
	 * Guaranteed constraints: 0 ≤ yourLeft ≤ 20.
	 * 
	 * @input integer yourRight
	 * 
	 * A non-negative integer representing the heaviest weight you can lift with
	 * your right arm.
	 * 
	 * Guaranteed constraints: 0 ≤ yourRight ≤ 20.
	 * 
	 * @input integer friendsLeft
	 * 
	 * A non-negative integer representing the heaviest weight your friend can lift
	 * with his or her left arm.
	 * 
	 * Guaranteed constraints: 0 ≤ friendsLeft ≤ 20.
	 * 
	 * @input integer friendsRight
	 * 
	 * A non-negative integer representing the heaviest weight your friend can lift
	 * with his or her right arm.
	 * 
	 * Guaranteed constraints: 0 ≤ friendsRight ≤ 20.
	 * 
	 * @output boolean
	 * 
	 * true if you and your friend are equally strong, false otherwise.
	 * 
	 */
	public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		return Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight)
				&& Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight);
	}

}

/*



















*/