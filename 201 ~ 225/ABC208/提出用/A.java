import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();

        //* NG例：a:3, b:2のケース
        if(a <= b && b <= a * 6) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
