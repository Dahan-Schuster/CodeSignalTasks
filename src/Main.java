import codesignal.tasks.dahanschuster.*;

@SuppressWarnings("unused")
public class Main {

	/**
	 * Use for testing the tasks. You can copy and paste input examples from the doc
	 * of each method.
	 * 
	 * @TasksAuthor: Dahan Schuster
	 * @CodeSignalProfile: https://app.codesignal.com/profile/dahan-schust
	 */
	public static void main(String[] args) {

		String[][] matrix = 
				{ 
				{ "o","o","o","o","|","|","|","|"}, 
				{"|","|","|","|","o","o","o","o"}, 
				{"-","-","-",".","-","-","-","-"}, 
				{"o","o","o","o","|","o","o","o"}, 
				{"|","o","o","o","o","|","o","o"}, 
				{"o","|","o","o","o","o","|","o"}, 
				{"o","o","|","o","o","o","o","|"}, 
				{"o","o","o","|","o","o","o","o" } 
				};

		System.out.println(DailyChallenges.matrixToDecimal(matrix));

	}

}