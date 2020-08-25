package InterviewQA.DP;

public class TripleStep {
    public static void main(String[] args) {
        int n = 3;// 4
        int n1 = 4; // 7

        System.out.println(TripleStepMethod(n));
    }

    public static int TripleStepMethod(int n) {
        if (n > 0) {
            return TripleStepMethod(n - 1) + TripleStepMethod(n - 2) + TripleStepMethod(n - 3);
        }
        if (n == 0) {
            return 1;
        }
        return 0;
    }
}