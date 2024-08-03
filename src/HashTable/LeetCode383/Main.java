package HashTable.LeetCode383;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。
 * <p>
 * 如果可以，返回 true ；否则返回 false 。【注意每个字符只能用一次】
 * <p>
 * 思路：哈希表简单题
 *
 * @author Ding Jiaxiong
 */

public class Main {

    /**
     * @param ransomNote 被构
     * @param magazine   源
     * @return 返回是否能
     */
    public static boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {  // 将 magazine 所有字符加入集合
            map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0) + 1);
        }

        // 判断 ransomNote
        for (int i = 0; i < ransomNote.length(); i++) {

            if (map.getOrDefault(ransomNote.charAt(i), 0) == 0) { // 如果map中没有这个字符或者这个字符已经“用完了”，直接false
                return false;
            } else {
                map.put(ransomNote.charAt(i), map.get(ransomNote.charAt(i)) - 1); // 次数 -1
            }

        }

        return true;
    }

    public static void main(String[] args) {

        String ransomNote = "a";
        String magazine = "b";

        System.out.println(canConstruct(ransomNote, magazine));

    }
}
