package Problem4;

import java.util.List;

public class StringFormatter {
	
	public static int totalLetters(List<String> wordList) {
		//part a
		//Returns the total number of letters in wordList
		//wordList contains at least two words, consisting of letters only
		
		int total = 0;
		
		for(String word : wordList) {
			total += word.length();
		}
		
		return total;
	}
	
	public static int basicGapWidth (List<String> wordList, int formattedLen) {
		//part b
		//Returns basic gap width when wordList is used to produce a formatted String of formattedLen characters
	
		int basicGapWidth =  (formattedLen - totalLetters(wordList)) / (wordList.size()-1);
		return basicGapWidth;
	}
	
	public static int leftoverSpaces(List<String> wordList, int formattedLen) {

	}
	
	public static String format(List<String> wordList, int formattedLen) {
	
		String formatted = "";
		int basicGapWidth = basicGapWidth(wordList, formattedLen);
		int leftoverSpaces = leftoverSpaces(wordList, formattedLen);
		
		for(int i = 0; i < wordList.size() -1; i++) {
			formatted = formatted + wordList.get(i);
			for (int j = 0; j < basicGapWidth; j++) {
				formatted = formatted + " ";
			}
			if(leftoverSpaces > 0) {
				formatted = formatted + " ";
				leftoverSpaces--;
			}
		}
		formatted = formatted + wordList.get(wordList.size() -1);
		
		return formatted;
	}
}
