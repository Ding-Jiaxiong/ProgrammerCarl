package HashTable.LeetCode1;

import java.util.HashMap;
import java.util.List;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * <p>
 * 思路：哈希表
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>(); // 创建哈希表, 键是数值，值是数值在数组中的下标

        // 因为要返回下标，不用增强for 循环
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) { // 循环终止条件
                return new int[]{map.get(target - nums[i]), i};
            }

            map.put(nums[i], i);
        }

        return new int[0]; // 未找到随便返回【题目一定会有答案】
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        for (int i : twoSum(nums, target)) {
            System.out.print(i + " ");
        }

    }
}
