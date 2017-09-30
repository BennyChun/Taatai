package application.util;

import java.util.ArrayList;
import java.util.HashMap;


/**
 * this class provides the tools for converting a number to a maori word 
 * and provides a way to check if the users answer equals to the actual answer (this might need to be changed)
 * @author se206
 *
 */
public class MaoriAnswerUtil {

	
	private final HashMap<String, Integer> maoriToNumber= new HashMap<String, Integer>();
	private final HashMap<Integer , String> numberToMaori = new HashMap<Integer, String>();
	
	private String finalMaoriWords = "";
	
	/**
	 * this constructor will set up the initial maoriToNumber HashMap
	 * 
	 */
	public MaoriAnswerUtil(){
		maoriToNumber.put("tahi", 1);
		maoriToNumber.put("rua",  2);
		maoriToNumber.put("toru", 3);
		maoriToNumber.put("whaa", 4);
		maoriToNumber.put("rima", 5);
		maoriToNumber.put("ono",  6);
		maoriToNumber.put("whitu",7);
		maoriToNumber.put("waru", 8);
		maoriToNumber.put("iwa",  9);
		maoriToNumber.put("tekau",10);
		
		
		numberToMaori.put(1 ,  "tahi");
		numberToMaori.put(2 ,   "rua");
		numberToMaori.put(3 ,  "toru");
		numberToMaori.put(4 ,  "whaa");
		numberToMaori.put(5 ,  "rima");
		numberToMaori.put(6 ,   "ono");
		numberToMaori.put(7 , "whitu");
		numberToMaori.put(8 ,  "waru");
		numberToMaori.put(9 ,   "iwa");
		numberToMaori.put(10 ,"tekau");
		
		
	}
	
	
	
	/**
	 * takes a number, and converts it into a maori word
	 * puts it into an arraylist called finalMaoriWords
	 */
	public void numberToMaori(int number) {
		if (number <= 10) {
			String maoriWord = numberToMaori.get(number);
			finalMaoriWords = maoriWord;
		}else {
		
			int firstDigit = number/10%10;
			int secondDigit = number%10;
			
			
			if (secondDigit == 0) {
				finalMaoriWords = numberToMaori.get(firstDigit) + " tekau";
			}else {
				finalMaoriWords = numberToMaori.get(firstDigit) + " tekau maa " + numberToMaori.get(secondDigit);
			}
		}	
	}
	
	
	

	/**
	 * this method returns the String of maori words
	 * @return
	 */
	public String getMaoriWords(){
		return finalMaoriWords;
	}
	
	/**
	 * this method takes a String which is the users answer
	 * the users answer came from the file recout.mlf
	 * the recout.mlf file was created from the HTK speech recognition
	 * 
	 * 
	 * @param userAnswer
	 * @return
	 */
	public boolean checkAnswer(String userAnswer) {
		if (userAnswer.equals(finalMaoriWords)) {return true;} else {return false;}
	}
	
	
	
}
