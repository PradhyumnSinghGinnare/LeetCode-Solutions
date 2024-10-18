/*
#6_Zigzag_Conversion
The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
*/
class Solution {
    public String convert(String s, int numRows) {
        String[] ans = new String[numRows];
        for(int i=0; i<numRows; i++){
            ans[i] = "";
        }
        int i=0;
        while(i<s.length()){
            for(int index=0; index<numRows && i<s.length(); index++){
                ans[index] += s.charAt(i++);
            }

            for(int index=numRows-2; index>0 && i<s.length(); index--){
                ans[index] += s.charAt(i++);
            }
        }
        String res = "";
        for(String str : ans){
            res += str;
        }
        return res;
    }
}