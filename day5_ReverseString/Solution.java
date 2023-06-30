//link - https://leetcode.com/problems/reverse-string/
//344. Reverse String
//Write a function that reverses a string. The input string is given as an array of characters s

  class Solution {
    public void reverseString(char[] s) {
        int left = 0;
    int right = s.length - 1;

    while (left < right) {
      char temp = s[left];
      s[left++] = s[right];
      s[right--] = temp;
        
    }
}
}
