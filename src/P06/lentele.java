package P06;

import java.sql.SQLOutput;

public class lentele {
    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {

            for (int y = 1; y <= 5; y++) {
                System.out.print(printD(y)) + " x " + printD(x) + " = " + printR(r:x * y) + " | ");
            }
            System.out.println();
        }
    }
    static String printD(int d) {
        // if (d < 10) System.out.print(' ');
       //  System.out.print(d);
        return (d < 10 ? " " : "") + d;
    }
    static String printR(int r) {
       // if (r < 10) System.out.print("  ");
       //  else if (r < 100)  System.out.print(' ')
        // System.out.print(r);
        return (r < 10 ? "   " : r < 100 ? " " : "") + r;
    }
}
