package codesignal.tasks.dahanschuster;

import java.util.regex.Pattern;

public class Arcade_level_05 {

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
	 * 			For yourLeft = 10, yourRight = 15, friendsLeft = 15, and
	 *          friendsRight = 10, the output should be areEquallyStrong(yourLeft,
	 *          yourRight, friendsLeft, friendsRight) = true; For yourLeft = 15,
	 *          yourRight = 10, friendsLeft = 15, and friendsRight = 10, the output
	 *          should be areEquallyStrong(yourLeft, yourRight, friendsLeft,
	 *          friendsRight) = true; For yourLeft = 15, yourRight = 10, friendsLeft
	 *          = 15, and friendsRight = 9, the output should be
	 *          areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight) =
	 *          false.
	 * 
	 * 
	 * @InputOutput
	 * 
	 * 				[execution time limit] 3 seconds (java)
	 * 
	 * @input integer yourLeft
	 * 
	 *        A non-negative integer representing the heaviest weight you can lift
	 *        with your left arm.
	 * 
	 *        Guaranteed constraints: 0 ≤ yourLeft ≤ 20.
	 * 
	 * @input integer yourRight
	 * 
	 *        A non-negative integer representing the heaviest weight you can lift
	 *        with your right arm.
	 * 
	 *        Guaranteed constraints: 0 ≤ yourRight ≤ 20.
	 * 
	 * @input integer friendsLeft
	 * 
	 *        A non-negative integer representing the heaviest weight your friend
	 *        can lift with his or her left arm.
	 * 
	 *        Guaranteed constraints: 0 ≤ friendsLeft ≤ 20.
	 * 
	 * @input integer friendsRight
	 * 
	 *        A non-negative integer representing the heaviest weight your friend
	 *        can lift with his or her right arm.
	 * 
	 *        Guaranteed constraints: 0 ≤ friendsRight ≤ 20.
	 * 
	 * @output boolean
	 * 
	 *         true if you and your friend are equally strong, false otherwise.
	 * 
	 */
	public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
		return Math.max(yourLeft, yourRight) == Math.max(friendsLeft, friendsRight)
				&& Math.min(yourLeft, yourRight) == Math.min(friendsLeft, friendsRight);
	}

	/**
	 * Given an array of integers, find the maximal absolute difference between any
	 * two of its adjacent elements.
	 * 
	 * Example
	 * 
	 * For inputArray = [2, 4, 1, 0], the output should be
	 * arrayMaximalAdjacentDifference(inputArray) = 3.
	 * 
	 * Input/Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] array.integer inputArray
	 * 
	 * Guaranteed constraints: 3 ≤ inputArray.length ≤ 10, -15 ≤ inputArray[i] ≤ 15.
	 * 
	 * [output] integer
	 * 
	 * The maximal absolute difference.
	 */
	public static int arrayMaximalAdjacentDifference(int[] inputArray) {
		int MaximalAdjacentDifference = 0;

		for (int i = 0; i < inputArray.length - 1; i++) {
			int adjacentDifference = Math.abs(inputArray[i] - inputArray[(i + 1)]);
			if (adjacentDifference > MaximalAdjacentDifference)
				MaximalAdjacentDifference = adjacentDifference;
		}

		return MaximalAdjacentDifference;
	}

	/**
	 * An IP address is a numerical label assigned to each device (e.g., computer,
	 * printer) participating in a computer network that uses the Internet Protocol
	 * for communication. There are two versions of the Internet protocol, and thus
	 * two versions of addresses. One of them is the IPv4 address.
	 * 
	 * IPv4 addresses are represented in dot-decimal notation, which consists of
	 * four decimal numbers, each ranging from 0 to 255 inclusive, separated by
	 * dots, e.g., 172.16.254.1.
	 * 
	 * Given a string, find out if it satisfies the IPv4 address naming rules.
	 * 
	 * @Example
	 * 
	 * For inputString = "172.16.254.1", the output should be
	 * isIPv4Address(inputString) = true;
	 * 
	 * For inputString = "172.316.254.1", the output should be
	 * isIPv4Address(inputString) = false.
	 * 
	 * 316 is not in range [0, 255].
	 * 
	 * For inputString = ".254.255.0", the output should be
	 * isIPv4Address(inputString) = false.
	 * 
	 * There is no first number.
	 * 
	 * @InputOutput
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * @input string inputString
	 * 
	 * A string consisting of digits, full stops and lowercase English letters.
	 * 
	 * Guaranteed constraints: 1 ≤ inputString.length ≤ 30.
	 * 
	 * @output boolean
	 * 
	 * true if inputString satisfies the IPv4 address naming rules, false otherwise.
	 * 
	 */
	public static boolean isIPv4Address(String inputString) {
		if (Pattern.compile("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$").matcher(inputString).matches()) {
			String[] numbers = inputString.split("\\.");
			return ((Integer.parseInt(numbers[0]) >= 0 && Integer.parseInt(numbers[0]) <= 255)
					&& (Integer.parseInt(numbers[1]) >= 0 && Integer.parseInt(numbers[1]) <= 255)
					&& (Integer.parseInt(numbers[2]) >= 0 && Integer.parseInt(numbers[2]) <= 255)
					&& (Integer.parseInt(numbers[3]) >= 0 && Integer.parseInt(numbers[3]) <= 255));
		}
		// I swear I'll submit it with an one-line solution.
		// Will be using regex.
		// I was almost there... (look at the partial solution below)
		return false;

		/*
		 * return Pattern.compile(
		 * "^[((1?[0-9]?[0-9]+)|(2?[0-5]?[0-5]+))]\\.((1?[0-9]?[0-9]+)|(2?[0-5]?[0-5]+))\\.((1?[0-9]?[0-9]+)|(2?[0-5]?[0-5]+))\\.((1?[0-9]?[0-9]+)|(2?[0-5]?[0-5]+))$"
		 * ).matcher(inputString).matches();
		 */
	}

}
