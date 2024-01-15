package tech.bingulhan.jdk10;

public class VarKeyWord {

    public static void main(String[] args) {
        var age = 18;
        var username = "BingulHan";
        var isMan = true;

        System.out.println(age+" "+username+" "+isMan);

        test(age);

        test2();


    }

    public static void test(int i) {
        System.out.println("Test -> "+i);
    }

    public static int test2() {

        var result = 10;
        var result2 = "10";
        return result; //result2 not working.

    }
}
