package HashTable.LeetCode202;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个算法来判断一个数 n 是不是快乐数。
 * <p>
 * 思路：哈希表存储每一个数每一位平方的计算结果
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static int getNext(int n) {
        int totalSum = 0;

        while (n > 0) {

            int d = n % 10; // 从个位开始拿
            n = n / 10;

            totalSum += d * d;
        }

        return totalSum;
    }

    public static boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>(); // 存储 n 的结果

        while (n != 1 && !seen.contains(n)) {

            seen.add(n);
            n = getNext(n);
        }

        return n == 1;
    }

    public static void main(String[] args) {

        int n = 19;
        System.out.println(isHappy(n));

    }
}
