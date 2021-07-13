import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int n = scan.nextInt();
        scan.close();
        // System.out.println(n / 3); //* int型
        // System.out.println(Math.floor(n / 3)); //* double型
        System.out.println((int)Math.floor(n / 3)); //* int型
    }
}
