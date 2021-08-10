import java.util.Scanner;

public class A {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //* 提出用のscan
        //* ------------------------------------------------
        // 排他的論理和(xor)：^
        // 論理積(and)：&
        // 論理和(or)：|
        // 反転(not)：~
        int a = scan.nextInt();
        int b = scan.nextInt();
        scan.close();
        int xor = a ^ b;
        System.out.println(xor);

        // int x = Integer.parseInt(Integer.toBinaryString(a));
        // int y = Integer.parseInt(Integer.toBinaryString(b));
        // System.out.println(x);
        // System.out.println(y);
    }
}
