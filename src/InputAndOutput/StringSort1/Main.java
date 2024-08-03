package InputAndOutput.StringSort1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();


        while (in.hasNextLine()) {

            String[] arr = in.nextLine().split(" ");

            Arrays.sort(arr);

            for (int i = 0; i < arr.length - 1; i++) {
                System.out.print(arr[i] + ' ');
            }

            System.out.print(arr[arr.length - 1]);

        }

    }

}
