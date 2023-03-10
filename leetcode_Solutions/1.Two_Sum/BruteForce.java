// ! We simply use two loops: double pointer appraoch, traversal technique.
// ** The key is to return a array of two element representing the indices.

class Solution {
  public int[] twoSum(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          return new int[] { i, j };
        }
      }
    }
    return new int[] {};
  }
}

/*
 * Time complexity: O(N^2);
 * Space Complexity: O(1);
 */