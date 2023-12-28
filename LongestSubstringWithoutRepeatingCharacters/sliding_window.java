class Solution {
    public int lengthOfLongestSubstring(String s) {
        var l = 0;
        var chars = new HashSet<Character>();
        var longest = 0;

        for (var r = 0; r < s.length(); r++) {
            while (chars.contains(s.charAt(r))) {
                chars.remove(s.charAt(l));
                l++;
            }
            chars.add(s.charAt(r));
            longest = Math.max(longest, chars.size());
        }

        return longest;
    }
}
