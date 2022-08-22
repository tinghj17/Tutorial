package tutorial1;
import java.util.Scanner;

public class Main {
//    shortcut: psvm + tab
    public static void main(String[] args) {
//        System.out.println("Hello World");
        int x = 5;
        double num2 = 5.2;
        boolean choice = true;
//       char: single quotation mark
        char c = 's';
//        double quotation mark
        String word = "hello";
        int y;
        y = 3;
//        Scanner is a data type
        Scanner sc = new Scanner(System.in);
//        int scanned_int = sc.nextInt();
        String scanned = sc.next();
//        int z = Integer.parseInt(scanned);
//        System.out.println(z);

        if (scanned.equals("Hello")) {
            System.out.println("hi");
        } else {
            System.out.println("not the same");
        }

    }
}
