import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        if (b == 0) {
            System.out.println("Gold");
        } else if (a == 0) {
            System.out.println("Silver");
        } else {
            System.out.println("Alloy");
        }
    }
}
