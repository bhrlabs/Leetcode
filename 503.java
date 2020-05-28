class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ret = new int[nums.length];
        Arrays.fill(ret, -1);
        
        Stack<Integer> st = new Stack<>();
        for (int x = 0; x < 2 * nums.length; x++) { // O(n) + O(n) = O(n)
            while(!st.isEmpty() && nums[st.peek()] < nums[x % nums.length]) {
                ret[st.pop()] = nums[x % nums.length];
            }
            
            if (x < nums.length) {
                st.push(x);
            }
        }
        return ret;
    }
}