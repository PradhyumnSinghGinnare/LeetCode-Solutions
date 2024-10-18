/*
#242_Valid_Anagram 
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false
*/

class Solution {
    public boolean isAnagram(String s, String t) {
        
        int m = s.length();
        int n = t.length();

        if(m != n){
            return false;
        } else{
            int count[] = new int [26];

            for(int i=0; i<m; i++){
                count[s.charAt(i)-'a']++;
            }

            for(int i=0; i<n; i++){
                count[t.charAt(i)-'a']--;
            }

            for(int i=0; i<count.length; i++){
                if(count[i] != 0){
                    return false;
                }
            }
            return true;
        }
    }
}