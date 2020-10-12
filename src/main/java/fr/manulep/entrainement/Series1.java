package fr.manulep.entrainement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Series1 {
	
	private Series1() {
		 throw new IllegalStateException("Test class");
	}


	public static String helloWorld(String name) {
		//1
		String message = "";
		if((name != null) && (name != "")){
			message = "Hello " + name;
			return message;
		}else {
			return "Hello World";
		}
	}
	

	public static String[] removeNullElements(String[] array) {
		ArrayList<String> data = new ArrayList<String>();
        for (String s : array) {
            if(s != null){
                data.add(s);
            }
        }

        String[] target = data.toArray(new String[data.size()]);

        for(String s : target) {
            System.out.println(s + " ");
		}
		return target;
	}

	public static int[] addElementToBeginning(int[] array, int element) {
		int len = array.length;
		int[] array2 = new int[len+1];
		array2[0] = element;

		for(int i = 0; i < len;i++){
			array2[i+1] = array[i];
		}
			return array2;
	}
	
	public static int[] allElementsExceptFirstThree(int[] array) {
		ArrayList<Integer> array2 = new ArrayList<Integer>();
        int[] array3;

        for (int i = 0; i < array.length; i++) {
            if (i > 2) {
                array2.add(array[i]);
            }
        }

        array3 = new int[array2.size()];

        for (int i = 0; i < array2.size(); i++) {
            array3[i] = array2.get(i).intValue();
        }

        return array3;
	}
	
	public static String getFirstHalf(String word) {

        String wordHalf = "";

        for(int i = 0; i < 3; i++) {
            wordHalf = wordHalf + word.charAt(i);
		}
		return wordHalf;
	}
	
	public static String[] selectElementsStartingWithA(String[] array) {
		ArrayList<String> arrayWordFirstLetterA = new ArrayList<String>();

        for(int i = 0; i < array.length; i++ ) {
            int firstLetter = array[i].charAt(0);
            if(firstLetter == 'a') {
                arrayWordFirstLetterA.add(array[i]);
            }
        }

        String[] arrayFinal = new String[arrayWordFirstLetterA.size()];

        for (int i = 0; i < arrayWordFirstLetterA.size(); i++) {
            arrayFinal[i] = arrayWordFirstLetterA.get(i);
        }

        return arrayFinal;
	}
	
	public static String[] selectElementsStartingWithVowel(String[]array) {
		String[] vowel = { "a", "e", "i", "o", "u", "y"};
        ArrayList<String> arrayVowel = new ArrayList<String>();

        for(String y :  array){
            if(y != null) {
                for(String s: vowel) {
                    if(y.startsWith(s)) {
                        arrayVowel.add(y);
                    }
                }
            }
        };
        
        return arrayVowel.toArray(new String[arrayVowel.size()]); 
	}
	
	public static String[] reverseOrderInArray(String[]array) {
        ArrayList<String> arrayFinal = new ArrayList<String>();

        for(int i = array.length-1; i>=0;i--){
            arrayFinal.add(array[i]);
        }

        return arrayFinal.toArray(new String[arrayFinal.size()]);
	}

	public static int[] insertElementInTheMiddleOfAnArray(int[] array, int element) {
		
        int moitiee = array.length / 2; 
        int[] array2 = new int[array.length +1];


        for (int i = 0; i < moitiee ; i++) {
            array2[i] = array[i];
        }
        array2[moitiee] = element;

        for (int i = moitiee+1; i < array2.length; i++) {
            array2[i] = array[i - 1];
        }

		return array2;
	}

	public static String shortestWord(String text) {
		String[] mots = text.split(" ");
        String plusPetit = mots[0];
        
        for (String mot : mots) {

          if(plusPetit.length() > mot.length()){
              plusPetit = mot;
          }
        }
		return plusPetit;
	}

	public static String removeCapitals(String text) {
		//11
		return text.replaceAll("[A-Z]", "");
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
		int resultatFinal = 0;
		for (Integer integer : numbers) {
			resultatFinal += integer;
		}
		return resultatFinal;
	}

	public static float makeNegative(float number) {
		if (number < 0){
			return number;
		}
		else {
			return 0 - number;
		}
	}


	public static boolean checkForSpecialCharacters(String string) {
		Pattern p = Pattern.compile("[^a-z0-9! ]", Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(string);
		boolean resultatFinal = m.find();
		return resultatFinal;
	}

	public static boolean checkIfStringStartsWithConsonant( String word ) {
        String wordUpper = word.toUpperCase();
        Character firstCharWord = wordUpper.charAt(0);
        String firstCharWordToString = firstCharWord.toString();
        Pattern p = Pattern.compile("[BCDFGHJKLMNPQRSTVWXZ]");
        Matcher m = p.matcher(firstCharWordToString);
        boolean b = m.matches();
		return b;
	}
        

	public static String getDomainName(String email) {
		String[] emailSplit = email.split("@");
        String domainName = emailSplit[1];
		return domainName.replaceAll(".com", "");

	}

	public static int[] letterPosition(String name) {
		String[] alphabet = { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r",
				"s", "t", "u", "v", "w", "x", "y", "z" };
		List<String> alphaList = Arrays.asList(alphabet);

		String[] list = name.split("");
		int[] positions = new int[list.length];

		for (int i = 0; i < list.length; i++) {
			String letter = list[i].toLowerCase();
			positions[i] = alphaList.indexOf(letter) + 1;
		}
		return positions;
	}

	public static boolean isPeer(int number) {
		int isPaire = number % 2;
		if(isPaire == 0) {
			return true;
		}
		return false;
	}


}
