package Utils;

public class ArrayUtils {
    public static void displayArr(long[] a) {
        String s = "[ ";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + (i == a.length - 1 ? " ]" : ", ");
        }
        System.out.println(s);
    }
}