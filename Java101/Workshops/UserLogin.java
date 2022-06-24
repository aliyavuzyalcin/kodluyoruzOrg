package Workshops;
import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * Checking the user's username and password. If user's password is incorrect, then the program will ask the user if he/she wants to change it. 
 * If yes, then the program will ask the new password.
 * If no, then the program will terminate without changing the program.
 * The password can't be same with the original one and the one which user type as incorrect. 
 */
public class UserLogin {
    public static void main(String[] args) {
        String userName = "JavaPath",userNameInput, password = "Java123", passInput, passNew="";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter your Username:");
        userNameInput = keyboard.nextLine();

        System.out.println("Enter your Password:");
        passInput = keyboard.nextLine();

        if(userName.equals(userNameInput) && password.equals(passInput)){

            System.out.println("Successful!");

        }else{

            System.out.println("Incorrect. Do you want to change your password? 1 for YES, 0 for NO:");
            int isChange = keyboard.nextInt();
            switch (isChange) {
                case 1:
                    
                    System.out.println("Enter new password:");
                    keyboard.nextLine();
                    passNew= keyboard.nextLine();
                    
                    //System.out.println("Password is created! New Password: " + passNew);
                    if(!(passInput.equals(passNew))){

                        System.out.println("Password is created! New Password: " + passNew);
                    }else{

                        System.out.println("Password is not created. Type another password.");
                    }
                    break;
                case 0:
                    
                    System.out.println("Password didn't change.");
                    break;
            
                default:
                    System.out.println("Enter a valid password!");
                    break;
            }
            
        }
        keyboard.close();
    }
}
