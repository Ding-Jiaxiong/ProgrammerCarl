package Array.LeetCode59;

/**
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 * <p>
 * 思路：模拟
 * 顺时针的顺序：
 * <p>
 * 1. 从左到右填充上行
 * 2. 从上到下填充右列
 * 3. 从右到左填充下行
 * 4. 从下到上填充左列
 * <p>
 * 循环
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static int[][] generateMatrix(int n) {

        int[][] res = new int[n][n]; // 结果二维数组

        int left = 0; // 左边界
        int right = n - 1;  // 右边界
        int top = 0; // 上边界
        int bottom = n - 1; // 下边界

        int startnum = 1; // 从 1 开始填
        int endnum = n * n;  // 填充结束值

        while (startnum <= endnum) {

            for (int i = left; i <= right; i++) { // 1. 从左到右填充上行
                res[top][i] = startnum; // 行不变，一直是上边界
                startnum++;  // 值自增
            }

            top++; // 一行填充完毕

            for (int i = top; i <= bottom; i++) { // 2. 从上到下填充右列
                res[i][right] = startnum;  // 列不变，一直是右边界
                startnum++;

            }

            right--; // 一列填充完毕

            for (int i = right; i >= left; i--) { // 3. 从右到左填充下行
                res[bottom][i] = startnum; // 行不变，一直是下边界
                startnum++;

            }

            bottom--; // 一行填充完毕

            for (int i = bottom; i >= top; i--) { // 4. 从下到上填充左列
                res[i][left] = startnum; // 列不变，一直是左边界
                startnum++;

            }

            left++; // 一列完毕


        }

        return res;
    }

    public static void main(String[] args) {

        int n = 3;

        for (int[] ints : generateMatrix(n)) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }

    }

}
