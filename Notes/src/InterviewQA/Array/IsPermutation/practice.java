package InterviewQA.Array.IsPermutation;

public class practice {
    public static void main(String[] args) {
        System.out.println(linearMethod(4));
    }

    public static int linearMethod(int n) {
        if (n < 1) {
            return 0;
        }
        if (n == 1) {
            return 1;

        }
        int pre = linearMethod(n / 2);
        int cur = pre * 2;
        System.out.println(cur);
        return cur;
    }
}
