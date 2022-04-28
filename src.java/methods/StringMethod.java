package methods;

import java.util.Locale;

public class StringMethod {
    public static void main(String[] args) {
        String firstName = "Payal";
        String lastName = "Patil";
        StringBuffer stringBuffer = new StringBuffer(lastName);
        System.out.println(stringBuffer.reverse());
        int length = lastName.length();
        System.out.println(length);                                     // calculates length of lastName
        System.out.println(firstName.toLowerCase());                    // converts firstName in lowercase
        System.out.println(lastName.toUpperCase());                     // converts lastName in uppercase
        System.out.println(firstName.concat(lastName));                 // concat two strings
        System.out.println(lastName.charAt(3));                         // shows character according to given index
        System.out.println(firstName.indexOf('l'));                     // shows index according to given character
        System.out.println(lastName.replace('l','s'));   // replaces old character with new character
        System.out.println(firstName.compareTo(lastName));              // compares two strings with number
        System.out.println(lastName.startsWith("P"));                   // gives condition for starting characters
        System.out.println(firstName.contains("ti"));                   // gives condition for contains characters

    }
}
