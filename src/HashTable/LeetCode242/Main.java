package HashTable.LeetCode242;

import java.util.HashMap;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * <p>
 * 思路：哈希表【两次操作，最后验证】
 *
 * @author Ding Jiaxiong
 */

public class Main {

    public static boolean isAnagram(String s, String t) {

        int length1 = s.length(); // s 字符串长度
        int length2 = t.length(); // t 字符串长度

        if (length1 != length2) return false;  // 长度不一样，肯定不是异位词

        HashMap<Character, Integer> dic = new HashMap<>();  // 哈希表

        for (int i = 0; i < length1; i++) { // 遍历第一个字符串
            dic.put(s.charAt(i), dic.getOrDefault(s.charAt(i), 0) + 1);  // 字符作为键，值是出现的次数，有就 +1，没有就默认 0 + 1
        }

        for (int i = 0; i < length2; i++) {  // 遍历第二个字符串

            dic.put(t.charAt(i), dic.getOrDefault(t.charAt(i), 0) - 1);  // 字符作为键，值是出现的次数，有就-1， 没有默认 0 + 1
        }

        // 最后遍历哈希表
        for (Integer value : dic.values()) {
            if (value != 0) return false;  // 如果是异位词，那最后dic中每个字符对应的出现次数应该都是 0 [互相抵消]
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}
