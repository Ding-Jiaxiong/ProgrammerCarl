package InputAndOutput.AplusB7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {

            int a = in.nextInt();
            int b = in.nextInt();

            System.out.println(a + b);
            System.out.println();

        }

    }
}
