package codesignal.tasks.dahanschuster;

import java.util.Arrays;

public class Arcade_level_02 {

	public static int adjacentElementsProduct(int[] inputArray) {
		int m = -2147483648;
		int p = 0;

		for (int i = 0; i < inputArray.length; i++) {
			if (i != inputArray.length - 1) {

				p = inputArray[i] * inputArray[(i + 1)];

				if (p > m)
					m = p;
			}
		}

		return m;
	}

	public static String shapeArea() {

		/* ruby code */
		/*
		 * def shapeArea(n)
		 * 
		 * cruz = (n*4) -3 pontas = (((n-2) * 2) - 1 ) * 4
		 * 
		 * l = n
		 * 
		 * while (l > 4) do l = l-2 pontas += (((l-2) * 2) - 1 ) * 4 end
		 * 
		 * if (pontas < 0) then pontas = 0 end
		 * 
		 * return cruz + pontas
		 * 
		 * end
		 */
		return "There's a ruby code in this method. Please, copy and paste on a ruby file.";
	}

	public static int makeArrayConsecutive2(int[] x) {
		Arrays.sort(x);
		return (x[x.length - 1] - x[0] - x.length + 1);
	}

	public static boolean almostIncreasingSequence(int[] s) {
		int x = 0;
		int y = 0;

		for (int i = 0; i < s.length - 1; i++) {
			if (s[i] >= s[i + 1]) {
				System.out.println(s[i] + " >= " + s[i + 1]);
				x++;
			}
		}

		for (int k = 0; k < s.length - 2; k++) {
			if (s[k] >= s[k + 2]) {
				System.out.println(s[k] + " >= " + s[k + 2]);
				y++;
			}
		}

		if (x + y > 2)
			return false;

		return true;
	}

	public static int matrixElementsSum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length - 1; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i + 1][j] = 0;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}

		return sum;
	}

}
