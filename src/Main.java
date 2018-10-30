import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int N;
        int c;
        int i=0;
        int a;
        Scanner S = new Scanner(System.in);
        N = S.nextInt();

        if (N <= 0) {
            return;
        }

        a = (int)Math.pow(2, i) - 1;

        if (isSimple(a) && isSimple(i)) {
            for (i = 2; i <= N + 1; i++) {
                c = (int)(Math.pow(2, i - 1) * (Math.pow(2, i) - 1));

                if (!isSimple(i)) {
                    continue;
                }

                if (c > N) {
                    break;
                } else {
                    System.out.println(c);
                }
            }
        }
    }

    public static boolean isSimple(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++)
            if (n % i == 0)
                return false;
        return true;
    }
}
