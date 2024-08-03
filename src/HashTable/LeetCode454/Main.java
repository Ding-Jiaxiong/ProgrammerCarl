package HashTable.LeetCode454;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你四个整数数组 nums1、nums2、nums3 和 nums4 ，数组长度都是 n ，请你计算有多少个元组 (i, j, k, l) 能满足：
 * - 0 <= i, j, k, l < n
 * - nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
 * <p>
 * 思路：数组分为两部分来看, 哈希表存储结果
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        int res = 0;

        Map<Integer, Integer> map = new HashMap<>(); // 键是和值，值是次数

        // 前两个
        for (int i : nums1) {
            for (int j : nums2) {
                int sum = i + j;

                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }

        // 后两个
        for (int i : nums3) {
            for (int j : nums4) {
                res += map.getOrDefault(0 - i - j, 0);
            }
        }

        return res;

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        System.out.println(fourSumCount(nums1, nums2, nums3, nums4));
    }
}
