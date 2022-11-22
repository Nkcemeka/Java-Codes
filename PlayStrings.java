import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayStrings {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter the first string: ");
        String firstString = reader.readLine().trim(); // trimming the string input

        System.out.print("Enter the second string: ");
        String secondString = reader.readLine().trim(); // trimming the string input

        output(firstString, secondString);
    }

    public static void output(String firstStr, String secondStr){
        // Details of the first string
        System.out.println("\nThe first string is: " + firstStr);
        System.out.println("It is " + firstStr.length() + " characters long.");
        System.out.println("The substring of the first two letters is: " + firstStr.substring(0,2));

        // Details of the second string
        System.out.println("\nThe second string is: " + secondStr);
        System.out.println("It is " + secondStr.length() + " characters long.");
        int secondLength = secondStr.length();
        int startIndex = secondLength - 2;
        System.out.println("The substring of the last two letters is: " + secondStr.substring(startIndex));

        System.out.println("\nThe two strings concatenated are: " + firstStr + secondStr);
        String concatStr = firstStr + secondStr;
        System.out.println("It is " + concatStr.length() + " characters long.");
        System.out.println("The index of the first c in the concatenated string is: " + concatStr.indexOf('c'));
        System.out.println("The combined string with every e replaced with Q is: " + concatStr.replace("e", "Q"));

        System.out.println("\nThe two strings concatenated and in all caps is: " + concatStr.toUpperCase());
        System.out.println("The two strings concatenated and in all lowercase is: " + concatStr.toLowerCase());

    }
}
