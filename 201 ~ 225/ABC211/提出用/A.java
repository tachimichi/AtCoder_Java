import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        double a = scan.nextInt();
        double b = scan.nextInt();
        scan.close();

        System.out.println((a-b)/3 + b);
    }
}
