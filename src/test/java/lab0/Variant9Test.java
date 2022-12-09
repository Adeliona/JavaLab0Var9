package lab0;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab0.Variant9Lab0;
import lab0.Variant9Lab0.DAY_OF_WEEK;

public class Variant9Test {

    //public static double EPS = 0.0000001;

    // @Test
   /* public void MassTest(){
        assertEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});
    }*/

  /*  @Test(enabled = false)
    public void loginOld() {

        assertEquals(new Variant9Lab0().booleanTask(3, 4), false);

    }*/

   /* @Test(dataProvider = "inputProvider")
    public void inputTest(int p1, long p3) {
        assertEquals(new Variant9Lab0().inputOutputTask(p1), p3);
    }*/

    /*@DataProvider
    public Object[][] inputProvider() {
        return new Object[][] { { 2, 4l }, { 6, 36L } };
    }*/
/*
    @Test(expectedExceptions = AssertionError.class)
    public void negativeInputTest() {
        new Variant9Lab0().inputOutputTask(-2);
    }*/

    ////////////////////////////////////////////////

    @Test(dataProvider = "integerProvider")
    public void inputTest(int p1, int p3) {
        assertEquals(new Variant9Lab0().integerNumbersTask(p1), p3);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][] { { 584, 5 }, { 785, 7 }, { 750, 7 } };
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void negativeIntegerTest() {
        new Variant9Lab0().integerNumbersTask(99);
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(int p1, int p2, int p3) {
        assertEquals(new Variant9Lab0().ifTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{2, 3, 2}, {0, 0, 0}, {11, 5, 5}};
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, boolean p3) {
        assertEquals(new Variant9Lab0().booleanTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][]{{5, 8, true}, {1, 13, false}, {-3, 7, false}};
    }

    //////////////////////////////////////////////////

   /* @Test(dataProvider = "switchProvider")
    public void switchTest(int p1, DAY_OF_WEEK p2) {
        assertEquals(new Variant9Lab0().switchTask(p1), p2);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][] { { 3, DAY_OF_WEEK.WEDNESDAY }, { 6, 6 } };
    }

    @Test(expectedExceptions = AssertionError.class)
    public void switchNegativeTest() {
        new Variant9Lab0().forTask(10, 5);
    }*/

    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int p1, int p2, double p3) {
        assertEquals(new Variant9Lab0().forTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{{2, 4, 13}, {0, 1, 0}, {5, 6, 25}};
    }

    ///////////////////////////////////////////////////


    @Test(dataProvider = "whileProvider")
    public void whileTest(int n, double p1) {
        assertEquals(new Variant9Lab0().whileTask(n), p1);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]{{3, 2}, {15, 3}, {324, 6}};
    }


    /*@Test(expectedExceptions = AssertionError.class, dataProvider = "negativeWhileProvider")
    public void negativeWhileTest(int p1) {
        new Variant9Lab0().whileTask(p1);
    }

    @DataProvider
    public Object[][] negativeWhileProvider() {
        return new Object[][]{{1, 2}, {-2, 1}, {2, -1}};
    }*/

    //////////////////////////////////////////

    @Test(dataProvider = "arrayProvider")
    public void arrayTest(double[] array1, double[] array2) {
        assertEquals(new Variant9Lab0().arrayTask(array1), array2);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][]{{new double[]{10, 2, 3, 5, 8, 8}, 8, 8, 2, 10}, {new double[]{15, 0, 8}, 8, 0},
                {new double[]{-6, -4, 18, 0, 0, 32}, 32, 0, 0, 18, -4, -6},
                {new double[]{13, 11, 7, 5},} };
    }


    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void twoDimensionArrayTest(int[][] array, int n, int m, int[][] res) {
        assertEquals(new Variant9Lab0().twoDimensionArrayTask(array, n, m), res);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] array1 = {{2, 3, 6, 9, -9},
                {34, 98, -9, 2, 1},
                {-4, 2, 1, 6, 1},
                {-98, 8, 1, 5, 3}};

        int[][] array2 = {{2, 3, 6, 9, -9},
                {-4, 4, 4, 7, 1}};

        int[][] array3 = {{55, 88, 10, 5, -3, 55},
                {-1, 0, 1, 0, 1, 10},
                {3, 98, -9, 22, -10, 0},
                {11, 58, -11, 9, -9, 22},
                {3, 98, -9, 22, -10, 44},
                {3, 98, -9, 22, -10, 88}};

        int[][] res1 = {{2, 3, 6, 9, -9},
                {-4, 2, 1, 6, 1}};

        int[][] res2 = {{2, 3, 6, 9, -9}};

        int[][] res3 = {{55, 88, 10, 5, -3, 55},
                {3, 98, -9, 22, -10, 0},
                {3, 98, -9, 22, -10, 44}};


        return new Object[][]{{array1, 3, 4, res1}, {array2, 2, 4, res2}, {array3, 5, 5, res3}};

    }

    //////////////////////////////////////////
    /*@Test
    public void arrayTest2() {
        assertEquals(new int[]{2, 3}, new int[]{2, 3});
    }*/

}

