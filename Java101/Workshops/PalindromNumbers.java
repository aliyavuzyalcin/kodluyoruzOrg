package Workshops;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Palindromic numbers are numbers that have the same reading direction when read from both sides.
 * 
 * Examples; 
 * 1, 4, 8, 99, 101, 363, 4004, 9889...
 * 
 */
public class PalindromNumbers {
    public static void main(String[] args) {

        System.out.println(isPalindrom(363));
    }

    public static boolean isPalindrom (int number){

        int temp = number, reverseNumber = 0, lastNumber;

        while(temp != 0){
            //Getting the last digit of the number
            lastNumber = temp % 10;
            //Reverse the number and take the last digit and replace it as first digit.
            reverseNumber = (reverseNumber * 10) + lastNumber;
            //Leave the current digit and move to the other digit.
            temp = temp / 10;
        }

        if(number == reverseNumber)
            return true;
        else
            return false;
    }
}
