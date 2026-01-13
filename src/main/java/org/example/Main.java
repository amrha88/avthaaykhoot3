package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    //--------------------------------------------------------------------//
    //First function
    public static int func1(int x, int y, int z) {
        int res = 0;

        if ((x != 0) & (y == 0)){
            res = z / 10;
        }
        res= res/x;

        return res;
    }
    //--------------------------------------------------------------------//



    //--------------------------------------------------------------------//
    //Second function
    public static String func2 (float p, float q) {

        if (p != 0) {
            p = p + 10;
        }

        // תקלה: חלוקה ב־0 כאשר p == 0
        q = q / p;

        return String.format("p=%.2f, q=%.2f", p, q);
    }
    //--------------------------------------------------------------------//



    //--------------------------------------------------------------------//
    //Third function
    public static String func3(int x) {
        int result = 10;

        if (x > 0) {
            result = result / x;
        }
        result = result / 0;

        return String.format("result=%d", result); // This line will never run because in line 40 there is a division by 0.
    }
    //--------------------------------------------------------------------//

    public static void main(String[] args) {

    }
}