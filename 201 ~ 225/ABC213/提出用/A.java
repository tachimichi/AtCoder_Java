import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // * 提出用のsc
        // * ------------------------------------------------
        // 排他的論理和(xor)：^
        // 論理積(and)：&
        // 論理和(or)：|
        // 反転(not)：~
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int xor = a ^ b;
        System.out.println(xor);

        // int x = Integer.parseInt(Integer.toBinaryString(a));
        // int y = Integer.parseInt(Integer.toBinaryString(b));
        // System.out.println(x);
        // System.out.println(y);
    }
}
