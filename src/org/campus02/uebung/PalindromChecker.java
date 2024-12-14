package org.campus02.uebung;

import java.util.ArrayList;
import java.util.HashMap;

public class PalindromChecker {

    public static void main(String[] args) {
//        String test = "Test";
//        String testUpper = test.toUpperCase();
//        System.out.println(testUpper);
//
//        char first = testUpper.charAt(0);
//        System.out.println("first = " + first);
//        char last = testUpper.charAt(test.length() - 1);
//        System.out.println("first = " + first);
//        System.out.println("last = " + last);
//
//
//        System.out.println(last == first);

        String palindrom = "Rotor";
        String palindrom2 = "ro,tor!";

        System.out.println("check(palindrom) = " + check(palindrom));
        System.out.println("check(palindrom2) = " + check(palindrom2));
        System.out.println(check("Motor"));
    }

    public static boolean check(String palindrom) {
        // Abbruchsbestimmung
        if (palindrom.length() <= 1) {
            return true;
        }

        palindrom = palindrom.toUpperCase();

        char firstChar = palindrom.charAt(0);
        if (!Character.isLetter(firstChar)) {
            String newPalindrom = palindrom.substring(1); // erstes Zeichen abschneiden
            return check(newPalindrom);
        }

        char lastChar = palindrom.charAt(palindrom.length() - 1);
        if (!Character.isLetter(lastChar)) {
           return check(palindrom.substring(0, palindrom.length() - 1)); // schneide letztes Zeichen weg
        }

        // jetzt überprüfen wir, ob beide zeichen gleich sind
        if (firstChar == lastChar) {
            return check(palindrom.substring(1, palindrom.length() - 1));
        }

        // kein Palindrom
        return false;
    }
}
