package Array.KamaCoder58;

import java.util.Scanner;

/**
 * 给定一个整数数组 Array，请计算该数组在每个指定区间内元素的总和。
 * <p>
 * 【输入描述】
 * 第一行输入为整数数组 Array 的长度 n，接下来 n 行，每行一个整数，表示数组的元素。随后的输入为需要计算总和的区间下标：a，b （b > = a），直至文件结束。
 * 【输出描述】
 * 输出每个指定区间内元素的总和。
 * <p>
 * 思路：前缀和【计算区间问题】
 *
 * @author Ding Jiaxiong
 */


public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // 读入数组长度 n

        int[] array = new int[n]; // 原数组
        int[] pre = new int[n]; // 前缀和数组

        // 读入数据
        // 前缀和暂存
        int presum = 0;

        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            presum += array[i];
            pre[i] = presum;
        }

        // 读入计算区间
        while (in.hasNextInt()) {

            int left = in.nextInt();
            int right = in.nextInt();

            int sum = 0;

            if (left == 0) {
                sum = pre[right];
            } else {
                sum = pre[right] - pre[left - 1];
            }

            System.out.println(sum);

        }


        in.close(); // 关闭
    }
}
