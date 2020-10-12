package fr.manulep.entrainement;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
        String string = "ABC@dsklfj!";
        String[] arrayLetter = new String[string.length()];
        for (int i = 0; i < string.length(); i++) {
			Character stringChar = string.charAt(i);
			String strinCharToString = stringChar.toString();
            arrayLetter[i] = strinCharToString;
            
            boolean isTrue = arrayLetter[i].matches("[@!%#]");
            if(isTrue == true){
                return true;
                break;
            }
        }

        return false;

    }
}
