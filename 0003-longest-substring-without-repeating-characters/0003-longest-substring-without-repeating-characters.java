class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> windows = new HashSet<>();
        int left = 0, max_length = 0;

        for(int right = 0; right< s.length(); right++){
            char c = s.charAt(right);
            while(windows.contains(c)){
                windows.remove(s.charAt(left));
                left++;   
            }
            windows.add(c);
            max_length = Math.max(max_length, right-left +1);
        }
        return max_length;
    }
}