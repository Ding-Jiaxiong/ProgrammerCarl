package InputAndOutput.AplusB2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {

            int n = in.nextInt();

            while (n-- > 0) {

                int a = in.nextInt();
                int b = in.nextInt();

                System.out.println(a + b);
            }

        }
    }
}
