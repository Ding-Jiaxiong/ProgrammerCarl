package Array.LeetCode704;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * <p>
 * 思路：最常规的二分。
 * <p>
 * 1. 取中值时，int mid = left + (right - left) / 2;
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static int search(int[] nums, int target) {

        int left = 0; // 左边界从 0 开始
        int right = nums.length - 1; // 右边界是数组长度

        while (left <= right) { // 如果相遇，说明没找到 oi

            int mid = left + (right - left) / 2; // 这种写法是防止示例太大，left + right 直接越界

            if (nums[mid] < target) { // 目标值在右边

                left = mid + 1; // 向右收缩查找范围

            } else if (nums[mid] > target) { // 目标值在左边

                right = mid - 1; // 向左收缩查找范围
            } else {

                return mid; // 等于目标值，返回下标
            }

        }

        return -1; // 未找到，返回 -1

    }

    public static void main(String[] args) {

        int[] nums = {-1, 0, 3, 5, 9, 12};

        int target = 9;

        System.out.println(search(nums, target));

    }

}
