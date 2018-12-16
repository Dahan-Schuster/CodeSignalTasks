package codesignal.tasks.dahanschuster;

public class Challenges {

	/**
	 * Given an encoded string, return its corresponding decoded string.
	 * 
	 * The encoding rule is: k[encoded_string], where the encoded_string inside the
	 * square brackets is repeated exactly k times. Note: k is guaranteed to be a
	 * positive integer.
	 * 
	 * Note that your solution should have linear complexity because this is what
	 * you will be asked during an interview.
	 * 
	 * @Example
	 * 
	 * 			For s = "4[ab]", the output should be decodeString(s) = "abababab";
	 * 
	 *          For s = "2[b3[a]]", the output should be decodeString(s) =
	 *          "baaabaaa";
	 * 
	 *          For s = "z1[y]zzz2[abc]", the output should be decodeString(s) =
	 *          "zyzzzabcabc".
	 * 
	 * @InputOutput
	 * 
	 * 				[execution time limit] 3 seconds (java)
	 * 
	 * @input string s
	 * 
	 *        A string encoded as described above. It is guaranteed that:
	 * 
	 *        the string consists only of digits, square brackets and lowercase
	 *        English letters; the square brackets form a regular bracket sequence;
	 *        all digits that appear in the string represent the number of times the
	 *        content in the brackets that follow them repeats, i.e. k in the
	 *        description above; there are at most 20 pairs of square brackets in
	 *        the given string. Guaranteed constraints: 0 ≤ s.length ≤ 80.
	 * 
	 */
	public static String decodeString(String s) {
		int firstBracketIndex = -1;
		int lastBracketIndex = -1;
		
		int multiply = 1;

		while (s.contains("[")) {
			for (int k = 0; k < s.length(); k++) {
				if (s.charAt(k) == '[') {
					firstBracketIndex = k;
				} 
			}
			for (int k = s.length()-1; k >= 0; k--) {
				if (s.charAt(k) == ']' && k > firstBracketIndex) {
					lastBracketIndex = k;
				} 
			}
			String[] numbers = s.substring(0, firstBracketIndex).split("[^0-9]");
			multiply = Integer.parseInt(numbers[numbers.length-1]);
			
			String leftString = "";
			if (firstBracketIndex > 1) leftString = s.substring(0, firstBracketIndex-((""+multiply).length()));
			
			String lettersToRepeat = s.substring(firstBracketIndex+1, lastBracketIndex);
			
			String rightString = s.substring(lastBracketIndex+1);
			s = leftString;
			for (int k = 0; k < multiply; k++) {
				s += lettersToRepeat;
			}
			s += rightString;
		}
		return s;
	}
}