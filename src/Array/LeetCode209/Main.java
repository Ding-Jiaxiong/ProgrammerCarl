package Array.LeetCode209;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 target 。
 * <p>
 * 找出该数组中满足其总和大于等于 target 的长度最小的 【子数组就肯定是连续的了】 子数组 [numsl, numsl+1, ..., numsr-1, numsr] ，并返回其长度。如果不存在符合条件的子数组，返回 0 。
 * <p>
 * 思路：双指针【滑动窗口】
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static int minSubArrayLen(int target, int[] nums) {

        // 找子数组肯定就是连续的了

        int currentSum = 0; // 窗口中的数值和

        int left = 0; // 窗口起始位置
        int right = 0; // 窗口终止位置

        int subarrayLength = Integer.MAX_VALUE; // 子数组长度，也是这道题要返回的结果


        while (right < nums.length) { // 窗口滑到数组结束位置, 循环结束

            currentSum += nums[right]; // 加上窗口右指针指向的值

            while (currentSum >= target) { // 当前和比目标值还小的话，不会进入循环

                // 计算当前窗口长度
                int tmpLen = right - left + 1;
                if (tmpLen < subarrayLength) { // 更新最小子数组长度
                    subarrayLength = tmpLen;
                }

                currentSum -= nums[left]; // 减去左指针指向的值
                left++; // 左指针右移，移除当前指向值
            }

            right++; // 右指针继续走
        }
        return subarrayLength == Integer.MAX_VALUE ? 0 : subarrayLength; // 返回最小子数组长度【如果最后 subarrayLength 没变过，说明没找到答案】

    }


    public static void main(String[] args) {


        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;

        System.out.println(minSubArrayLen(target, nums));

    }
}
