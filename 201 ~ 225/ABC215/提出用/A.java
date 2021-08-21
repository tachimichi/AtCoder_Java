import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        String s = sc.next();
        String ac = "Hello,World!";
        sc.close();

        // System.out.println(ac);
        if (s.equals(ac)) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}
