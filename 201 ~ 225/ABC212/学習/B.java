import java.util.*;
import java.io.*;

public class B {
    public static void main(String[] args) throws Exception {
        File file = new File("../txt/B.txt");
        Scanner scan = new Scanner(file);
        // * 学習用scan
        // * ---------------------------
        String numList[] = "01234567890".split("");
        //* String型として、標準入力
        //* 配列もString型で格納する
        String strNum = scan.next();
        String a[] = strNum.split("");

        String ans = "Weak";
        if(a[0].equals(a[1]) && a[1].equals(a[2]) && a[2].equals(a[3])) {
            System.out.println(ans);
            return;
        }

        for(int i = 0; i < a.length-1; i++) {
            String testNum = a[i];
            String nextNum = a[i+1];
            for(int j = 0; j < numList.length-1; j++) {
                if(testNum.equals(numList[j])) {
                    if(!(nextNum.equals(numList[j+1]))) {
                        System.out.println("Strong");
                        return;
                    }
                }
            }
        }
        System.out.println(ans);

    }
}
