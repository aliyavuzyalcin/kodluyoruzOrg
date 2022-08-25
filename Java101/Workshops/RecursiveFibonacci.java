package Workshops;

/**
 * @author Ali Yavuz YALCIN
 * 
 * Program to Find Fibonacci Series with Recursive
 * 
 */
public class RecursiveFibonacci {
    public static void main(String[] args) {
        
        System.out.println(fib(8));
    }

    public static int fib(int n){
        //For the first two series we know their values. So, didn't need to calculate.
        if (n == 1 || n == 2){
            return 1;
        }
        //Every other series, we let the program to calculate value of each steps and give the result of total calculation.
        return fib(n - 1) + fib(n - 2);
    }
}
