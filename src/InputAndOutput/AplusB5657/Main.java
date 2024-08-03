package InputAndOutput.AplusB5657;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (in.hasNextLine()) {

            String[] s = in.nextLine().split(" ");

            int sum = 0;

            for (String string : s) {
                sum += Integer.parseInt(string);
            }

            System.out.println(sum);
        }

    }

}
