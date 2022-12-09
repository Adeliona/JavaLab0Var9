package lab0;

import java.lang.Math;

public class Variant9Lab0 {

    public enum DAY_OF_WEEK {
        MONDAY, TUESDAY, WEDNESDAY
    }

   /* public int inputOutputTask(int k) {
        return 0;
    }*/

    /**
     * @param k is number > 99 < 1000
     * @return first digit of k
     */
    public int integerNumbersTask(int k) {
        if (k < 100 || k > 999) {
            throw new IllegalArgumentException("Number should be more 99 & less 1000");
        }
        return k / 100;
    }

    /**
     * @param a and b
     * @return true if one of numbers is even
     */
    public boolean booleanTask(int a, int b) {
        return a % 2 == 0 || b % 2 == 0;
    }


    /**
     * @param a
     * @param b
     * @return a < b
     */
    public int ifTask(int a, int b) {
        if (a > b) {
            int temp = b;
            b = a;
            a = temp;
            //int A[] = {a, b};
        }
        //int A[] = {a, b};
        return a;
    }

    /**
     * @param D
     * @param M
     * @return day of week day represented number1
     */
    public DAY_OF_WEEK switchTask(int D, int M) {
        return DAY_OF_WEEK.MONDAY;
    }


    /**
     * @param a
     * @param b (a <  b)
     * @return sum of numbers square from a to b
     */
    public double forTask(int a, int b) {
        assert a < b : "B should be more than A";
        double sum = 0;
        for (int i = a; i < b; i++) {
            sum = sum + i * i;
        }
        return sum;
    }

    /**
     * @param N (N > 1)
     * @return min k when 3^k > N
     */

    public double whileTask(int N) {
        if (N < 1) {
            throw new IllegalArgumentException("Argument should be more than one");
        }
        //assert (N < 1) : "Argument should be more than one";
        double i = 0, k = 0;
        while (i == 0) {
            if (Math.pow(3, k) > N) {
                i = k;
            } else k = k + 1;
        }
        return k;
    }

    /**
     * @param array
     * @return resArr; Output all even numbers contained
     * in this array in descending order of
     * their indices, as well as their number K.
     */
    public double[] arrayTask(double[] array) {
        double[] resArr = new double[array.length];
        int k = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] % 2 == 0) {
                resArr[k] = array[i];
                k++;
            }
        }
        double[] res = new double[k]; // 4
            for(int i = 0; i < res.length; i++){
                res[i] = resArr[i];
            }

        return res;
    }

    /**
     * @param array
     * @param m
     * @param n
     * @return resArr
     */
    public int[][] twoDimensionArrayTask(int[][] array, int n, int m) {
        int resArr[][] = new int[n/2][m], k = 0;
        // (int) Math.ceil(n/2)
        for (int i = 0; i < n; i += 2) {
            for (int j = 0; j < m; j++) {
                resArr[k][j] = array[i][j];
                k++;
            }
        }
        return resArr;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}
