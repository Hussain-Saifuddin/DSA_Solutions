//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//  Input: nums = [2,7,11,15], target = 9
//  Output: [0,1]
//  Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:
//  Input: nums = [3,2,4], target = 6
//  Output: [1,2]
// Example 3:
//  Input: nums = [3,3], target = 6
//  Output: [0,1]
// Constraints:
//  2 <= nums.length <= 104
//  -109 <= nums[i] <= 109
//  -109 <= target <= 109
//   Only one valid answer exists.

package com.hussainsaifuddin.Strings;

import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = new int[] {3,2,4};
        //Traditional method with complexity O(n2)
        System.out.println(Arrays.toString(twoSums(arr,12)));

        //Optimal solution with complexity O(n)
        System.out.println(Arrays.toString(optimalTwoSums(arr,6)));
    }

    public static int[] optimalTwoSums(int[] arr, int target){
        HashMap<Integer,Integer> resultList = new HashMap<>();
        resultList.put(arr[0],0);
        for(int i=1;i<arr.length;i++){
           int sub = target-arr[i];
           if(resultList.get(sub) != null){
               System.out.println("Found target sum at index: " + resultList.get(sub) + " and " + i);
               int[] result = new int[] {resultList.get(sub), i};
               return result;
           }else{
               resultList.put(arr[i],i);
           }
        }
        System.out.println("OOPS! No match present");
        return null;
    }
    public static int[] twoSums(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+arr[j] == target && i != j){
                    System.out.println("Found target sum at index: " + i + " and " + j);
                    int[] result = new int[] {i,j};
                    return result;
                }
            }
        }
        System.out.println("OOPS! No match present");
        return null;
    }
}
