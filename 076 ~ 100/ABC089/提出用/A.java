import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        int n = sc.nextInt();
        sc.close();
        // System.out.println(n / 3); //* int型
        // System.out.println(Math.floor(n / 3)); //* double型
        System.out.println((int) Math.floor(n / 3)); // * int型
    }
}
