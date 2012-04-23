package tests;

import dt07.BigBrother;

/**
 * Created with IntelliJ IDEA.
 * User: Andrew
 * Date: 23/04/12
 * Time: 12:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class testCensor {
    public static void main(String[] args){
        boolean allPassed = true;

        allPassed &= test1();
//        allPassed &= test2();
//        allPassed &= test3();
//        allPassed &= test4();
//        allPassed &= test5();
//        allPassed &= test6();

        if(allPassed){
            System.out.println("All tests PASSED! You are AWESOME!");
        }
    }

    private static boolean test1() {
        boolean pass = true;
        BigBrother bb = new BigBrother();

        System.out.println(bb.CensorText("Lie! They are all LIES! I tell you! This statement is a lie. Lie lie lIe LIE!"));

        return pass;
    }

    private static boolean test2() {
        boolean pass = true;



        return pass;
    }

    private static boolean test3() {
        boolean pass = true;



        return pass;
    }

    private static boolean test4() {
        boolean pass = true;



        return pass;
    }

    private static boolean test5() {
        boolean pass = true;



        return pass;
    }

    private static boolean test6() {
        boolean pass = true;



        return pass;
    }
}
