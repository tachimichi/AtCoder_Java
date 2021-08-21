import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        // * NG例：a:3, b:2のケース
        if (a <= b && b <= a * 6) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
