package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 *         A program that finds whether the word the user has entered is
 *         "palindromic".
 * 
 *         If the reverse reading of a word gives the same word, that word is
 *         "Palindromic Word".
 * 
 *         Example: redivider, deified, civic, radar, level, rotor, kayak etc..
 */
public class PalindromicWord {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String word;
        System.out.print("Enter a word: ");
        word = keyboard.nextLine();

        if (isPalindromic(word)) {
            System.out.println(word + " is Palindromic.");
        } else {
            System.out.println(word + " is NOT Palindromic.");
        }
        keyboard.close();
    }

    /**
     * This method takes a String. Then makes its letter lower so that ignore the
     * upper or lower case differences.
     * Then with the help of while, visits all the letter in that word. One counter
     * comes from the begining, the other one comes from the end of the word.
     * Till the condition of while loops is no longer provided.
     * 
     * @param word The word that will be controlled if it is a palindromic or not.
     * @return <b>true</b> if the word is palindromic.
     *         <b>false</b> if the word is NOT palindromic.
     */
    public static boolean isPalindromic(String word) {

        String ignored = word.toLowerCase();
        int i = 0;
        int j = word.length() - 1;

        while (i < j) {
            if (ignored.charAt(i) != ignored.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
