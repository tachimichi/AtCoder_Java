import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // * 提出用のscan
        // * ------------------------------------------------
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        System.out.println(21 - (a + b + c));
        
    }
}
