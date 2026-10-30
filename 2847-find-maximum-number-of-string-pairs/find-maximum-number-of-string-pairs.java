class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (String s : words) {
            String rev = new StringBuilder(s).reverse().toString();

            if (set.contains(rev))
                count++;
            else
                set.add(s);
        
    }
    return count;
}
}