/*
#58_Length_of_Last_Word
Given a string s consisting of words and spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
*/
class Solution {
    public int lengthOfLastWord(String s) {
        int i = s.length()-1;
        while(s.charAt(i)==' '){
            i--;
        }
        int count = 0;
        while(i>=0 && s.charAt(i)!=' '){
            count++;
            i--;
        }
        return count;
    }
}