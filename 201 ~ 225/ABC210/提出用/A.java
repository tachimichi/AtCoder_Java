import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int n = sc.nextInt();
        int a = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        sc.close();

        int ans;
        if (n > a) {
            ans = a * x + (n - a) * y;
        } else {
            ans = n * x;
        }
        System.out.println(ans);
    }
}
