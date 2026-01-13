public class weakmethod {

    public static int weakMethod(int a, int b) {
        int result = a + b;

        // BUG: אם a==0 אז החלק השני גורם ל-division by zero
        if (a != 0 || (b / a) > 1) {
            result += 10;
        }

        return result;
    }
}