import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        if(b == 0) {
            System.out.println("Gold");
        } else if (a == 0) {
            System.out.println("Silver");
        } else {
            System.out.println("Alloy");
        }
    }
}
