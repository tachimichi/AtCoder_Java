
import java.util.*;
import java.io.*;

public class A {
    public static void main(String[] args) throws Exception {
		File file = new File("../txt/A.txt");
		Scanner scan = new Scanner(file);
        //* 学習用scan
        //* ------------------------------------------------
		int n = scan.nextInt();
		scan.close();
        // System.out.println(n / 3); //* int型
        // System.out.println(Math.floor(n / 3)); //* double型
        System.out.println((int)Math.floor(n / 3)); //* int型
    }
}
