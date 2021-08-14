import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        // * 提出用のscan
        // * ------------------------------------------------
        int n = scan.nextInt();
        scan.close();
        if (n >= 212) {
            System.out.println(8);
        } else if (n <= 125) {
            System.out.println(4);
        } else {
            System.out.println(6);
        }
    }
}
