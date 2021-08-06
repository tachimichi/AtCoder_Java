import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int n = scan.nextInt();
        int a = scan.nextInt();
        scan.close();

        int amari = n % 500;
        if(amari <= a) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
