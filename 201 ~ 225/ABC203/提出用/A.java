import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();

        if (a == b) {
            System.out.println(c);
        } else if (b == c) {
            System.out.println(a);
        } else if (a == c) {
            System.out.println(b);
        } else {
            System.out.println(0);
        }

    }
}
