package HashTable.LeetCode349;

import java.util.HashSet;

/**
 * 给定两个数组 nums1 和 nums2 ，返回 它们的交集。输出结果中的每个元素一定是 唯一 的。我们可以 不考虑输出结果的顺序 。
 * <p>
 * 思路：交集就集合嘛，HashSet
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        HashSet<Integer> resset = new HashSet<>();

        for (int i : nums1) {  // nums1 元素全部压入
            set.add(i);
        }

        for (int i : nums2) { // 判断 nums2 元素
            if (set.contains(i)) {
                resset.add(i);
            }
        }

        return resset.stream().mapToInt(x -> x).toArray();  // 集合转数组，流操作

    }

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        for (int i : intersection(nums1, nums2)) {
            System.out.print(i + " ");
        }

    }
}
