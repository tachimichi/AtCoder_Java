import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int n = sc.nextInt();
        int a = sc.nextInt();
        sc.close();

        int amari = n % 500;
        if (amari <= a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
