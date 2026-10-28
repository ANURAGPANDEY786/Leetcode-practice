public class Solution {
        // hashmap and direct are also possible whwn capital
    boolean isAnagram(String s1, String s2) {
        if(s1.length() != s2.length())
            return false;

        int[] freq = new int[26];

        for(char ch : s1.toCharArray())
            freq[ch - 'a']++;

        for(char ch : s2.toCharArray())
            freq[ch - 'a']--;

        for(int x : freq)
            if(x != 0)
                return false;

        return true;
    }

        
    }
