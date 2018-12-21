package codesignal.tasks.dahanschuster;

import java.util.Arrays;

public class DailyChallenges {

	/**
	 * During the holiday season you go through a lot of candles! You burn many
	 * candles of various sizes, represented by the array candleSizes.
	 * 
	 * You prefer big candles, so you always light the biggest candle available at
	 * the time.
	 * 
	 * For every n candles you burn, you can use the remaining wax to create a new
	 * candle! The size of this new candle will depend on the sizes of the n candles
	 * you got the wax from. More specifically, the size of the new candle will be
	 * equal to the sum of the sizes of the n candles, divided by n + 1 (rounded
	 * down).
	 * 
	 * Given candleSizes and n, your task is to find the sum of the sizes of all
	 * candles burned!
	 * 
	 * Notes:
	 * 
	 * If the size of the new candle would be rounded down to zero, there isn't
	 * enough wax to make a new candle. You can't make a new candle with fewer than
	 * n leftovers. Example
	 * 
	 * For candleSizes = [2, 181, 32, 188, 188] and n = 3, the output should be
	 * burningCandles(candleSizes, n) = 773.
	 * 
	 * There's a tie for biggest candle, so you'll burn one of the 188 ones. The
	 * total is now 188 and the remaining candles are [2, 181, 32, 188]. You can now
	 * burn the other 188 candle. The total is now 376 and the remaining candles are
	 * [2, 181, 32]. The next biggest candle is 181, and since you've now burned 3
	 * (n) candles, you can make a new one! It will have a size of floor((188 + 188
	 * + 181) / 4) = 139. So the total is now 557 and the remaining candles are [2,
	 * 32, 139]. You'll burn the 139 candle next, since it's by far the biggest. The
	 * total is now 696 and the remaining candles are [2, 32]. The next candle will
	 * be the 32, so the total is now 728, and only [2] remains. You burn the 2
	 * next, and it seems like we're all out of candles now, but since you've now
	 * burned another 3 candles, you can make another new one! This one will have a
	 * size of floor((139 + 32 + 2) / 4) = 43. So the total is now 730 with [43]
	 * remaining. You now burn the final candle (43) for a total of 773. Input /
	 * Output
	 * 
	 * [execution time limit] 3 seconds (java)
	 * 
	 * [input] array.integer candleSizes
	 * 
	 * An array of integers representing the sizes of each of your candles. Not in
	 * any particular order.
	 * 
	 * Guaranteed constraints: 0 ≤ candleSizes.length ≤ 104 1 ≤ candleSizes[i] ≤ 106
	 * 
	 * [input] integer n
	 * 
	 * An integer representing the number of candles you need to burn in order to be
	 * able to create a new one from the leftover wax.
	 * 
	 * Guaranteed constraints: 2 ≤ n ≤ 104
	 * 
	 * [output] integer
	 * 
	 * An integer representing the sum of the sizes of all candles burned (including
	 * candles you created from leftovers).
	 * 
	 */
	public static int burningCandles(int[] candleSizes, int n) {
		//while (candleSizes.length > 0) {
			//for ()
			int[] newCandleSizes = new int[candleSizes.length-1];
			Arrays.sort(candleSizes);
			
		//}
		return 0;
		
	}

	

	/**
	 * Your family members live all around the world, and you're all planning to get
	 * together for the holidays!
	 * 
	 * You'd like to find the least costly way to congregate at one location, so
	 * you're trying to decide who should be the host. You're given an adjacency
	 * matrix travelCosts, where travelCosts[i][j] represents the cost for family
	 * member i to visit family member j. If it's not possible for i to visit j,
	 * then travelCosts[i][j] will be equal to -1.
	 * 
	 * Your task is to find the minimum total cost for everyone to get together (or
	 * return -1 if it's not possible).
	 * 
	 * @Note
	 * 
	 * 		All travel is direct; we won't consider any layovers or transfers. If
	 *       travelCosts[i][j] = -1 then i won't be able to visit j, even if there's
	 *       another index k available such that travelCosts[i][k] ≠ -1 and
	 *       travelCosts[k][j] ≠ -1.
	 * 
	 * @Example
	 * 
	 * 			For
	 * 
	 *          travelCost = [[ 0, 5, 0], [-1, 0,12], [ 0, 2, 0]] the output should
	 *          be whereToGather(travelCosts) = 7.
	 * 
	 *          It's not possible for family member 1 to visit family member 0, so 0
	 *          can't be the host. If family member 1 is hosting, then it costs 5
	 *          for guest 0 to attend, and 2 for guest 2 to attend. So the total
	 *          cost is 7. If family member 2 is hosting, then 0 can get there for
	 *          free, but it costs 12 for guest 1 to attend. So the total cost is
	 *          12, which is not as good as 7. So family member 1 should host the
	 *          event, for a total cost of 7.
	 * 
	 * @InputOutput
	 * 
	 * 				[execution time limit] 3 seconds (java)
	 * 
	 * @Input array.array.integer travelCosts
	 * 
	 *        A square matrix of integers, where travelCosts[guest][host] represents
	 *        the cost for guest to visit host. A -1 means guest cannot visit host.
	 *        It's guaranteed that it doesn't cost anything for a family member to
	 *        visit themselves.
	 * 
	 *        Guaranteed constraints: 2 ≤ travelCosts.length ≤ 250
	 *        travelCosts.length = travelCosts[i].length -1 ≤ travelCosts[i][j] ≤
	 *        106 travelCosts[i][i] = 0
	 * 
	 * @Output integer
	 * 
	 *         An integer representing the total minimum cost for everyone to gather
	 *         together (or -1 if it's not possible).
	 * 
	 * @TaskAuthor zero_cool
	 * @CodeSignalProfile https://app.codesignal.com/profile/zero_cool
	 */
	public static int whereToGather(int[][] travelCosts) {
		int[] sum = new int[travelCosts[0].length];
		for (int i = 0; i < travelCosts.length; i++) {
			for (int j = 0; j < travelCosts[0].length; j++) {
				if (travelCosts[i][j] == -1)
					sum[j] = Integer.MAX_VALUE;
				if (sum[j] != Integer.MAX_VALUE)
					sum[j] += travelCosts[i][j];
			}
		}
		Arrays.sort(sum);
		if (sum[0] == Integer.MAX_VALUE)
			return -1;
		return sum[0];
	}

	/**
	 * The Si Stebbins stack is a way to stack playing cards such that each card
	 * alternates suit in the repeating order [Clubs, Hearts, Spades, Diamonds] (not
	 * necessarily starting with Clubs), and has a numerical value three greater
	 * than the preceding card.
	 * 
	 * For non-numerical cards, Aces are represented by 1, Jacks are represented by
	 * 11, Queens are represented by 12, and Kings are represented by 13.
	 * 
	 * For numerical values greater than 13, start back at 1. For instance, in a
	 * deck in Si Stebbins order, the 10 of Diamonds is followed by the King of
	 * Clubs, which is followed by the 3 of Hearts.
	 * 
	 * Given a deck (52 cards or less), your task is to determine whether or not the
	 * cards are in Si Stebbins order.
	 * 
	 * We will represent the deck as a string deck, where the individual cards are
	 * separated by spaces. For instance, the string "10D KC 3H" represents the
	 * deck: 10 of Diamonds, King of Clubs, 3 of Hearts (which, as we have seen, is
	 * in Si Stebbins order).
	 * 
	 * Return 1 if deck is in Si Stebbins order. If deck is not in Si Stebbins
	 * order, return an integer (2 to 51) representing the card at which the deck
	 * stops being in Si Stebbins order (1-based).
	 * 
	 * Note: deck is always a valid deck of cards. It is not necessary to check for
	 * duplicate or impossible cards.
	 * 
	 * @Example
	 * 
	 * 			For deck = "10D KC 3H", the output should be isSiStebbinsStack(deck)
	 *          = 1.
	 * 
	 *          This is in Si Stebbins order.
	 * 
	 *          For deck = "9C QH 4S 7D 10H", the output should be
	 *          isSiStebbinsStack(deck) = 3.
	 * 
	 *          The 4 of Spades (card number 3) breaks the order, since its value is
	 *          more than 3 greater than the previous card.
	 * 
	 *          Note that additionally, card number 5 is the wrong suit, but since
	 *          the order was broken already by card number 3, the output should be
	 *          3.
	 * 
	 *          For deck = "10D KC 3H AH", the output should be
	 *          isSiStebbinsStack(deck) = 4.
	 * 
	 *          The fourth card (the Ace of Hearts) breaks the Si Stebbins order
	 *          because it's the wrong suit and the wrong number. To maintain the
	 *          order, this card should be the 6 of spades.
	 * 
	 *          For deck = "10D", the output should be isSiStebbinsStack(deck) = 1.
	 * 
	 *          Since any deck consisting of only one card is technically in Si
	 *          Stebbins order.
	 * 
	 * @InputOutput
	 * 
	 * 				[execution time limit] 3 seconds (java)
	 * 
	 * @input string deck
	 * 
	 *        A string representing a deck of cards, where each card is of the form
	 *        [value][suit], separated by spaces.
	 * 
	 *        Guaranteed constraints: 2 ≤ deck.length ≤ 159 deck[i] ∈ {"0" - "9",
	 *        "A", "J", "Q", "K", "C", "H", "S", "D", space}
	 * 
	 * @output integer
	 * 
	 *         Return 1 if deck is in Si Stebbins order, otherwise return 2 to 51,
	 *         representing the card at which the deck stops being in Si Stebbins
	 *         order (1-based).
	 * 
	 * @TaskAuthor hb20007
	 * @CodeSignalProfile https://app.codesignal.com/profile/hb20007
	 */
	public static int isSiStebbinsStack(String deck) {

		deck = deck.replaceAll("A", "1");
		deck = deck.replaceAll("J", "11");
		deck = deck.replaceAll("Q", "12");
		deck = deck.replaceAll("K", "13");

		String suits = "CHSDC";

		String[] d = deck.split(" ");
		int breakPoint = 1;

		for (int i = 1; i < d.length; i++) {
			int k = Integer.parseInt(d[i].substring(0, d[i].length() - 1))
					- Integer.parseInt(d[i - 1].substring(0, d[i - 1].length() - 1));

			if ((k != 3 && k != -10) || (d[i].charAt(d[i].length() - 1) != suits
					.charAt(suits.indexOf(d[i - 1].charAt(d[i - 1].length() - 1)) + 1))) {
				breakPoint = i + 1;
				break;
			}
		}

		return breakPoint;
	}

	/**
	 * While visiting the exquisite sacred forest Atsuta Jingu, you stumble upon a
	 * large stone under which you find a manuscript with some matrices. Since the
	 * matrices seem to resemble a Soroban (Japanese abacus), you suspect that these
	 * matrices may represent decimal numbers!
	 * 
	 * Given matrix as an 8-element array of arrays of strings, your task is to
	 * write a program which returns a decimal number as a result.
	 * 
	 * @Example
	 * 
	 * 			For
	 * 
	 *          matrix = [["o", "o", "o", "|", "|", "o"], ["|", "|", "|", "o", "o",
	 *          "|"], ["-", "-", ".", "-", "-", "-"], ["|", "|", "o", "o", "o",
	 *          "o"], ["o", "o", "|", "o", "|", "o"], ["o", "o", "o", "o", "o",
	 *          "o"], ["o", "o", "o", "o", "o", "|"], ["o", "o", "o", "|", "o",
	 *          "o"]] the output should be matrixToDecimal = 1.963.
	 * 
	 *          For
	 * 
	 *          matrix = [["o", "o", "o", "|", "|"], ["|", "|", "|", "o", "o"],
	 *          ["-", "-", ".", "-", "-"], ["o", "|", "|", "o", "|"], ["o", "o",
	 *          "o", "|", "o"], ["o", "o", "o", "o", "o"], ["|", "o", "o", "o",
	 *          "o"], ["o", "o", "o", "o", "o"]] the output should be
	 *          matrixToDecimal = 300.65.
	 * 
	 * @InputOutput
	 * 
	 * 				[execution time limit] 3 seconds (java)
	 * 
	 * @input array.array.string matrix
	 * 
	 *        A 2-dimensional matrix of single-character strings representing some
	 *        kind of abacus.
	 * 
	 *        Guaranteed constraints: matrix.length = 8 0 ≤ matrix[i].length ≤ 10
	 *        matrix[2][j] ∈ {"-", "."} matrix[i][j] ∈ {"o", "|"} (for i ≠ 2)
	 * 
	 * @output float
	 * 
	 *         The floating point number represented by the configuration of the
	 *         abacus.
	 * 
	 * @TaskAuthor the_mole
	 * @CodeSignalProfile https://app.codesignal.com/profile/the_mole
	 */
	public static double matrixToDecimal(String[][] matrix) {
		double output = 0.0;
		double value = 0;
		int commaIndex = 0;

		for (int h = 0; h < matrix[0].length; h++) {
			if (matrix[2][h].equals(".")) {
				commaIndex = h;
			}
		}

		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i].equals("|")) {
				value += 5;
			}

			for (int j = 3; j < matrix.length; j++) {
				if (matrix[j][i].equals("|")) {
					value += j - 3;
				}
			}

			value = (value * (Math.pow(10, (commaIndex - i))));

			output += value;
			value = 0;
		}
		return output;
	}

	/**
	 * You're almost finished your first semester at computer school - the only
	 * thing left is to write the exam for your data structures course!
	 * 
	 * To get a better idea of what you need to study, you'd like to see where you
	 * struggled the most. So your goal is to write an algorithm that shows what
	 * your grade was at each point in time throughout the course.
	 * 
	 * Your instructor's marking philosophy is that they only care about
	 * consistency, so they'll be judging your performance according to your mode
	 * mark in the course (based on all assignments and tests).
	 * 
	 * Given scores, an array of integers representing all test and assignment
	 * scores, your task is to return an array of integers where output[i]
	 * represents the mode grade of all marks up to (and including) scores[i]. Your
	 * instructor is a generous marker, so if there's a tie for the mode, your grade
	 * is the highest among them.
	 * 
	 * @Example
	 * 
	 * 			For scores = [75, 81, 75, 90] the output should be
	 *          modeScores(scores) = [75, 81, 75, 75].
	 * 
	 *          After each score is entered, the mode is recalculated as follows:
	 * 
	 *          For [75], the mode is 75 since it's the only element. For [75, 81],
	 *          the mode is 81 since it's greater than 75. For [75, 81, 75], the
	 *          mode is 75 (most frequent element). For [75, 81, 75, 90], the mode
	 *          is 75 (still the most frequent element). Input / Output
	 * 
	 *          [execution time limit] 3 seconds (java)
	 * 
	 * @Input array.integer scores
	 * 
	 *        An array of integers representing your test and assignment grades from
	 *        throughout the course (in chronological order).
	 * 
	 *        Guaranteed constraints: 0 ≤ scores.length ≤ 5 · 104 0 ≤ scores[i] ≤
	 *        106
	 * 
	 * @Output array.integer
	 * 
	 *         An array of integers where output[i] represents the mode score in the
	 *         course, up to and including scores[i].
	 */

	public static int[] modeScores(int[] scores) {
		int[] output = new int[scores.length];
		int mode = scores[0];
		int count = 0;
		int modeCount = 0;
		for (int i = 0; i < output.length; i++) {
			for (int j = 0; j <= i; j++)
				if (scores[i] == scores[j])
					count++;

			if ((scores[i] > mode && count >= modeCount) || count > modeCount) {
				mode = scores[i];
				modeCount = count;
			}
			output[i] = mode;
			count = 0;
		}
		return output;
	}

}
/* 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */