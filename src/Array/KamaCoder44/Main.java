package Array.KamaCoder44;

import java.util.Scanner;

/**
 * 第一行输入两个正整数，代表 n 和 m。【n x m】的土地区块
 * 接下来的 n 行，每行输出 m 个正整数。
 * <p>
 * 请输出一个整数，代表两个子区域内土地总价值之间的最小差距。
 * <p>
 * 思路：二维前缀和
 *
 * @author Ding Jiaxiong
 */

public class Main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();  // 土地行数
        int m = in.nextInt();  // 土地列数

        int sum = 0; // 所有土地的价值和
        int[][] groundvalues = new int[n][m];  // 土地价值

        // 读入数据
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                groundvalues[i][j] = in.nextInt();
                sum += groundvalues[i][j];
            }
        }

        // 横向统计
        int[] horizontal = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                horizontal[i] += groundvalues[i][j];
            }
        }

        // 纵向统计
        int[] vertical = new int[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                vertical[j] += groundvalues[i][j];
            }
        }

        // 计算最小差距 【其实还是就相当于考虑了每一种情况】
        int res = Integer.MAX_VALUE;

        int hcut = 0;
        for (int i = 0; i < n; i++) {
            hcut += horizontal[i];
            res = Math.min(res, Math.abs((sum - hcut) - hcut));
        }

        int vcut = 0;
        for (int j = 0; j < m; j++) {
            vcut += vertical[j];
            res = Math.min(res, Math.abs((sum - vcut) - vcut));
        }

        System.out.println(res);

        in.close();

    }
}
