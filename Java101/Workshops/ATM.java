package Workshops;

import java.util.Scanner;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Make an ATM project where user can manage bank account with java loops.
 * 
 * ATMs are simply machines where people view the balance in their bank account, withdraw or top up their account.
 */
public class ATM{
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String userName = "aliyavuzyalcin", password = "patika.dev";        //think like these come from database.
        String inputUserName,inputPassword;     //these are variables which will keep users input.
        int input, trial = 3;           // trial is the variable that we understand how many wrong entry done by user.
        double totalAmount = 1000;      // Total amount that we have in our bank account.
        /*This while loop starts the program. The value of trial must be greater than 0. */
        while(trial > 0){
            System.out.println("\nWelcome to the BANK PATIKA!\n" + "*****************************");

            /*Get the username and password values from the user. */
            System.out.print("Please enter your username: ");
            inputUserName = keyboard.nextLine();
            System.out.print("Please enter your password: ");
            inputPassword = keyboard.nextLine();

            /*IF what user gave to the program and the actual value of them is equal, then proceed. */
            if(userName.equals(inputUserName) && password.equals(inputPassword)){

                do{
                    System.out.println("\nWelcome " + userName);
                    /*Ask user what user wants to do. */
                    System.out.print("Please select the action you want to do" + "\n1-Balance Inquiry" + "\n2-Cash Deposit" + "\n3-Money Withdrawal" +"\n4-Exit" + "\nSelection: ");
                    input = keyboard.nextInt();     //get the number from user.
                    int selection = input;      //assign the number to selection. Because we will use it as a key value for swtich case structure.
                    /*In this switch: case 1 is to see balance inquiry. Case 2 is for to add cash. Case 3 is for to withdrawal certain amount. Case 4 is for exit. */
                    switch (selection) {
                        case 1:
                            System.out.println("\nTotal amount: " + totalAmount);
                            break;
                        case 2:
                            System.out.println("\nEnter the amount you want to deposit: ");
                            input = keyboard.nextInt();
                            totalAmount = totalAmount + input;
                            System.out.println("\n" + input + " amount is added up your balance.");
                            break;
                        case 3:
                            System.out.println("\nEnter the amount you want to withdrawal: ");
                            input = keyboard.nextInt();
                            if(totalAmount >= input){     //if input is greater than total amount, that means user is trying to withdrawal the amount he dosn't have in the account.
                                totalAmount = totalAmount - input;      //Do the math and find the amount after withdrawal.
                                System.out.println("\nDon't forget your money!");
                            }else{
                                System.out.println("\nInsufficient Balance!\n");
                            }
                            break;
                        case 4:                             //This is for exit. Soi it doesn't have to do anything.
                            break;
                        default:
                            System.out.println("\nPlease enter one of the numbers specified!\n");       //If user enter different than 1,2,3,4.
                            break;
                    }
                }while(input != 4);
                /*ask the user if he wants to terminate the program or not. */
                System.out.print("\nDo you want to terminate? 0 -> No || 1 -> Yes : "); 
                input = keyboard.nextInt();
                if(input == 1){
                    System.out.println("\nHave a nice day!\n");
                    break;
                }else{
                    keyboard.nextLine();            //make empty the cache of keyboard object.
                }
            }else{
                trial--;            //decrease the value of trial. So that we can understand the user gave wrong entry.
                System.out.println("\nIncorrect! Please try again.\n");
                if(trial == 0){
                    System.out.println("You entered your password incorrectly 3 times. Your account is suspended. Please call Customer Service.");
                }else{
                    System.out.println("\nYour remaining right: " + trial + "\n");
                }
            }

        }
        keyboard.close();           //Close the keyboard. We can prevent any leak due to not closed keyboard.
    }
}
