package org.eclipse.textclock.internal;

public class ConsoleDisplay extends Display {

	public static void createFormalString(String timeSentence) {
		StringBuffer firstLine = new StringBuffer("+------------------+");
		StringBuffer firstStr = new StringBuffer("|                  |"); // 18 empty spaces
		StringBuffer secondStr = new StringBuffer("|                  |");
		StringBuffer thirdStr = new StringBuffer("|                  |");
		StringBuffer fourthStr = new StringBuffer("|                  |");
		StringBuffer LastLine = new StringBuffer("+------------------+");

		String[] strArray = timeSentence.split(" ");

		firstStr.replace(7, 7 + strArray[0].length(), strArray[0]);
		firstStr.replace(11, 11 + strArray[1].length(), strArray[1]);
		secondStr.replace(2, 2 + strArray[2].length(), strArray[2]);
		thirdStr.replace(9, 9 + strArray[3].length(), strArray[3]);
		fourthStr.replace(3, 3 + strArray[4].length(), strArray[4]);

		String allStrings = firstLine + "\n" + firstStr + "\n" + secondStr + "\n" + thirdStr + "\n" + fourthStr + "\n"
				+ LastLine;

		System.out.println(allStrings.toString());
	}

	public static void createinFormalString(String timeSentence) {
		StringBuffer firstLine = new StringBuffer("+------------------+");
		StringBuffer firstStr = new StringBuffer("|                  |"); // 18
																			// empty
																			// spaces
		StringBuffer secondStr = new StringBuffer("|                  |");
		StringBuffer thirdStr = new StringBuffer("|                  |");
		StringBuffer fourthStr = new StringBuffer("|                  |");
		StringBuffer LastLine = new StringBuffer("+------------------+");

		String allStrings = null;
		String[] strArray = timeSentence.split(" ");
		firstStr.replace(7, 7 + strArray[0].length(), strArray[0]);
		firstStr.replace(11, 11 + strArray[1].length(), strArray[1]);

		if (strArray.length == 3) {

			secondStr.replace(2, 2 + strArray[2].length(), strArray[2]);
			allStrings = firstLine + "\n" + firstStr + "\n" + secondStr + "\n" + thirdStr + "\n" + fourthStr + "\n"
					+ LastLine;
		}
		if (strArray.length == 4) {

			secondStr.replace(2, 2 + strArray[2].length(), strArray[2]);
			secondStr.replace(14, 14 + strArray[3].length(), strArray[3]);
			allStrings = firstLine + "\n" + firstStr + "\n" + secondStr + "\n" + thirdStr + "\n" + fourthStr + "\n"
					+ LastLine;

		}
		if (strArray.length == 5) {

			secondStr.replace(2, 2 + strArray[2].length(), strArray[2]);
			secondStr.replace(14, 14 + strArray[3].length(), strArray[3]);
			thirdStr.replace(3, 3 + strArray[4].length(), strArray[4]);
			allStrings = firstLine + "\n" + firstStr + "\n" + secondStr + "\n" + thirdStr + "\n" + fourthStr + "\n"
					+ LastLine;

		}
		if (strArray.length == 6) {

			secondStr.replace(2, 2 + strArray[2].length(), strArray[2]);
			secondStr.replace(14, 14 + strArray[3].length(), strArray[3]);
			thirdStr.replace(3, 3 + strArray[4].length(), strArray[4]);
			thirdStr.replace(12, 12 + strArray[5].length(), strArray[5]);
			allStrings = firstLine + "\n" + firstStr + "\n" + secondStr + "\n" + thirdStr + "\n" + fourthStr + "\n"
					+ LastLine;
		}
		if (strArray.length == 7) {

			secondStr.replace(2, 2 + strArray[2].length(), strArray[2]);
			secondStr.replace(14, 14 + strArray[3].length(), strArray[3]);
			thirdStr.replace(3, 3 + strArray[4].length(), strArray[4]);
			thirdStr.replace(12, 12 + strArray[5].length(), strArray[5]);
			fourthStr.replace(5, 5 + strArray[6].length(), strArray[6]);
			allStrings = firstLine + "\n" + firstStr + "\n" + secondStr + "\n" + thirdStr + "\n" + fourthStr + "\n"
					+ LastLine;
		}
		if (strArray.length == 8) {

			secondStr.replace(2, 2 + strArray[2].length(), strArray[2]);
			secondStr.replace(14, 14 + strArray[3].length(), strArray[3]);
			thirdStr.replace(3, 3 + strArray[4].length(), strArray[4]);
			thirdStr.replace(12, 12 + strArray[5].length(), strArray[5]);
			fourthStr.replace(5, 5 + strArray[6].length(), strArray[6]);
			fourthStr.replace(11, 11 + strArray[7].length(), strArray[7]);
			allStrings = firstLine + "\n" + firstStr + "\n" + secondStr + "\n" + thirdStr + "\n" + fourthStr + "\n"
					+ LastLine;
		}
		System.out.println(allStrings.toString());
	}

	@Override
	void show(String timeSentence) {
		
	}
}
