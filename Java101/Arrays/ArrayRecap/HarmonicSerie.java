package Arrays.ArrayRecap;

/**
 * @author Ali Yavuz YALCIN
 * 
 *         Write a program that calculates the harmonic mean of the numbers in
 *         the array.
 * 
 *         Harmonic Mean formula: n (number of elements) / harmonic series of
 *         elements
 * 
 *         Harmonic Series Formula:
 * 
 *          1+1/1+1/2+1/3+1/4+1/5... => while n = 0 to infinite, [Total symbol] 1/n  
 */
public class HarmonicSerie {
    public static void main(String[] args) {
        double[] serie = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        double sum = 0;
        for (int row = 0; row < serie.length; row++) {

            sum = sum + (1 / serie[row]);
            System.out.print(row + ". row" + " " + "Sum is:\t");
            System.out.format("%.2f", sum);
            System.out.println();
        }
    }
}
