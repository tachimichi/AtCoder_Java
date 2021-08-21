import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        double a = sc.nextInt();
        double b = sc.nextInt();
        sc.close();

        System.out.println((a - b) / 3 + b);
    }
}
