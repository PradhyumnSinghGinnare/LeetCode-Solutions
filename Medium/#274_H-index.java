/*
#274_H-index
Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

Example 1:

Input: citations = [3,0,6,1,5]
Output: 3
Explanation: [3,0,6,1,5] means the researcher has 5 papers in total and each of them had received 3, 0, 6, 1, 5 citations respectively.
Since the researcher has 3 papers with at least 3 citations each and the remaining two with no more than 3 citations each, their h-index is 3.
*/
class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        int arr[] = new int[n+1];

        for(int c:citations){
            if(c > n){
                arr[n]++;
            } else{
                arr[c]++;
            }
        }

        int count = 0;
        for(int i=n; i>=0; i--){
            count = count + arr[i];
            if(count>=i){
                return i;
            }
        }
        return 0;
    }
}