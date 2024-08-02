package Array.LeetCode977;

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 * <p>
 * 思路：双指针
 *
 * @author Ding Jiaxiong
 */

public class Main {


    // 结果数组的从后开始填充，每次循环就是为了找左右哪个的平方更大
    public static int[] sortedSquares(int[] nums) {


        int left = 0; // 左指针
        int right = nums.length - 1; // 右指针指着最后那个数

        int k = nums.length - 1;  // 结果数组指针

        int[] res = new int[nums.length];  // 结果数组

        while (left <= right) { // 左右指针相遇，所有数计算完毕，结束循环

            if (nums[left] * nums[left] < nums[right] * nums[right]) { // 右边更大

                res[k] = nums[right] * nums[right]; // 赋值
                k--; // 结果填充向左收
                right--; // 右指针向左收
            } else { // 左边的更大

                res[k] = nums[left] * nums[left];
                k--; // 结果填充向左收
                left++; // 左指针向右收
            }

        }

        return res; // 返回结果数组
    }

    public static void main(String[] args) {

        int[] nums = {-4, -1, 0, 3, 10};

        for (int num : sortedSquares(nums)) {
            System.out.print(num + " ");
        }

    }

}
