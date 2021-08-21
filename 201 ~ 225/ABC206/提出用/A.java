import java.util.*;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int a = sc.nextInt();
        sc.close();
        // Math.floorは型変換が複雑になる
        int n = (int) (a * 1.08);
        // System.out.println(n);
        if (n == 206) {
            System.out.println("so-so");
        } else if (n < 206) {
            System.out.println("Yay!");
        } else {
            System.out.println(":(");
        }
    }
}
