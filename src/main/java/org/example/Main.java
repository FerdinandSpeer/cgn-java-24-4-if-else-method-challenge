package org.example;

public class Main {

    public static void main(String[] args) {
        int a = 15;
        int b = 50;
        String name = "anna";

        if (a>b){
        System.out.println(subtract(a,b));
        }
        else {
            System.out.println(add(a,b));
        }
        System.out.println(makePositive(a));
        System.out.println(evenNumber(a));
        System.out.println(istPalindrom(name));

        String test = "otto";
        System.out.println(istPalindrom(test));  // Ausgabe: true

        test = "welt";
        System.out.println(istPalindrom(test));  // Ausgabe: false
    }

    public static int add(int a, int b) {
        System.out.println("Methode add ");
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int makePositive(int a) {
        if (a <= 0) {
            return -a;
        }
        else {
            return a;
        }
    }

    public static int evenNumber (int a) {
        if (a % 2 == 0) {
            return a;
        }
        else {
            return a * 2;
        }
    }

//Ab hier Chat GPT Lösung
    public static boolean istPalindrom(String text) {
        // Basisfall: Wenn der String leer oder nur ein Zeichen lang ist, ist er ein Palindrom
        if (text.length() <= 1) {
            return true;
        }

        // Überprüfe das erste und letzte Zeichen
        if (text.charAt(0) == text.charAt(text.length() - 1)) {
            // Rekursion mit dem String ohne das erste und letzte Zeichen
            return istPalindrom(text.substring(1, text.length() - 1));
        }

        // Wenn die Zeichen nicht übereinstimmen, ist es kein Palindrom
        return false;
    }

}