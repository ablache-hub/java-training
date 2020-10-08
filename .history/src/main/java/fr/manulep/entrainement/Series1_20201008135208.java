package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.google.common.primitives.Chars; 
import org.checkerframework.checker.units.qual.Length;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		if (name == null || name == "")
			return "Hello World";
		else return "Hello " +name;
		
	}
	
 
	public static String[] removeNullElements(String[] array) {
		//2	
		ArrayList<String> liste = new ArrayList<>();


		for (int i=0; i<array.length; i++) {
			if (array[i] != null) {
				liste.add(array[i]);
			}
		}
		
		String []arrayExpected = liste.toArray(new String[0]);

		return arrayExpected;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		//3
		int [] arrayExpected = new int[(array.length)+1] ;
		arrayExpected[0]=element;
		for (int i=0; i<array.length; i++) {
			arrayExpected[i+1] = array[i];
		}
			
		return arrayExpected;
	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		//4
		int[]array2;

		if (array.length>3) {
			array2 = new int[array.length -3];
			System.arraycopy(array, 3, array2, 0, array2.length);
			}
		else {
			array2 = new int[0];
		}
		
		return array2;
	}
	
	public static String getFirstHalf(String word) {
		//5
		int length = word.length();
		int rounded = (int) Math.ceil(length/2.0);

		String half = word.substring(0, rounded);

		return half;
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		//6
		ArrayList<String> liste = new ArrayList<>();

		for (int i=0; i<array.length; i++){
			if (array[i].charAt(0) == 'a') {
				liste.add(array[i]);

			}
		}
		return liste.toArray(new String[0]);
		
		
	}
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		//7
		ArrayList<String> liste = new ArrayList<>();
		char voyelles[] = {'a','e','i','o','u','y'};

		for (int i=0; i<array.length; i++) {
			for (int j=0; j<voyelles.length; j++) {
				if (array[i] != null && array[i].charAt(0) == voyelles[j]) {
					liste.add(array[i]);

				}
			}
		}
		
		return liste.toArray(new String[0]);
	}
	
	public static String[] reverseOrderInArray(String[]array) {
		//8
		String inverse[] = new String[4];
		int j = 3;
		for (int i=0; i<array.length; i++) {
			
				inverse[j] = array[i];
				j--;
			
		}
		return inverse;
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		//9

		int array2[] = new int[array.length+1];
		int millieux = (int) Math.round(array.length/2);


		System.arraycopy(array, 0, array2, 0, millieux);
		array2[millieux] = element;
		System.arraycopy(array, millieux, array2, millieux+1, array.length-millieux);
		return array2;
	}

	public static String shortestWord(String text) {
		//10
		String[] splitted = text.split(" ");
		String court = splitted[0];

		for (String test: splitted) {
			if (test.length() < court.length()) {
				court=test;
			}
		}
		
		return court;
	}

	public static String removeCapitals(String text) {
		//11
		return null;
	}
	
	public static long addingTwoNumbers(long number1, long number2) {
		//12
		return number1 + number2;
	}

	public static long addingThreeNumbers(long number1, long number2, long number3) {
		//13
		return number1 + number2 + number3;
	}

	public static long addingSeveralNumbers(final Integer... numbers) {
		//14
		int sum = 0;
		for( int value : numbers ) {
			sum += value;
		}
		return sum;
	}

	public static float makeNegative(float number) {
		//15
		return 0;
	}

	public static boolean checkForSpecialCharacters(String string) {
		//16
		Pattern specialChar = Pattern.compile("[@#%]");
		Matcher m;

		m = specialChar.matcher(string);	
		
		if (m.find())
			return true;

		else return false;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
		//17
		String[] vowels = {"a","e","i","o","u","y"};
		List<String> liste = Arrays.asList(vowels); 
		String airletter = word.substring(0, 1).toLowerCase();
		return !liste.contains(airletter);

		
	}
		

	public static String getDomainName(String email) {
		//18
        return email.replaceAll("(^.*@|.com$)", "");

	}

	public static int[] letterPosition(String name) {
		//19
		String nom = name.toLowerCase();
		char [] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int [] position = new int[8];

		for(int i=0; i<nom.length(); i++) {
				for (int j = 0; j < alphabet.length; j++)
					if (alphabet[j] == nom.charAt(j)) {
						 position[i] = j;
					}
				
				}
			}	
		

		
	private static void charAt(int i) {
	}

		}

	public static boolean isPeer(int number) {
		//20
		return( number %2 == 0);
		
		
		
	}


}
