package Arrays;


public class ArrayFundamental{

    public static void main(String[] args) {
        
        //Created an array with 5 elements without declaring its length. The data type of the array is integer.
        int[] list2 = {10,20,30,40,50};
        printArray(list2);

        //Created an array with 10 elements. The data type of the array is integer.
        int[] list = new int [10];

        //Assigned numbers from 10 to 100 into list in tens.
        for(int i = 0; i < list.length; i++){
            int a = 10;
            list[i] = a*(i+1);
            //System.out.println(list[i]);
        }
        //Used the method to print the elements of the array.
        printArray(list);

        //Created an array with 10 elements. The data type of the array is double.
        double[] list1 = new double[10];

        //Assigned numbers starting from 1 to 10 one by one.
        for(int i = 0; i < list1.length; i++){
            list1[i] = i+1;
        }
        
        //Used the method to print the elements of the array.
        printArray(list1);

        //Used the method to print the elements of the REVERSE array.
        printArray(reverse(list));
        
    }

    /**
     * This method does reverse the array which it takes an parameter.
     * Then it passes its elements to the locally created array.
     * Then return the locally created array.
     * @param list integer array
     * @return  reverse integer array
     */
    static int[] reverse(int[] list){
        int[] reverse = new int[list.length];
        for (int i = 0, j = reverse.length - 1; i < list.length; i++, j--) {
            reverse[j] = list[i];
        }
        return reverse;
    }

    /**
     * This method uses for loop to print the elements of the integer array which taken as a parameter.
     * @param arr integer array
     */
    static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /**
     * This method uses for loop to print the elements of the double array which taken as a parameter. 
     * @param arr double array
     */
    static void printArray(double[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}