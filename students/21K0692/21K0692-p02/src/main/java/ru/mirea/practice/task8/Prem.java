package EX8;

import java.util.Scanner;
import java.lang.*;

public class Prem {
    public void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();
            char[] ch = s.toCharArray();
            for (int t = 0; t < s.length() / 2; t++) {
                char ch0 = ch[t];
                ch[t] = ch[s.length() - 1 - t];
                ch[s.length() - 1 - t] = ch0;
            }
            for (int i = 0; i < s.length(); i++) {
                System.out.print(ch[i]);
            }
        }
    }
}
