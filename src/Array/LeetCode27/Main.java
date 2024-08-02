package Array.LeetCode27;

/**
 * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
 * <p>
 * 思路：双指针【快慢】
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static int removeElement(int[] nums, int val) {

        int slow = 0; // 慢指针
        int fast = 0; // 快指针

        while (fast < nums.length) { // 快指针未遍历完数组

            if (nums[fast] != val) { // 快指针指向值不等于移除值【总的说快指针需要一直指到不等于移除值的地方】

                nums[slow] = nums[fast]; // 将快指针指向的数赋值给慢指针

                slow++; // 慢指针走一步

            }

            fast++;  // 快指针走一步
        }

        return slow;

    }


    public static void main(String[] args) {

        int[] nums = {3, 2, 2, 3};

        int target = 3;

        System.out.println(removeElement(nums, target));

    }
}
