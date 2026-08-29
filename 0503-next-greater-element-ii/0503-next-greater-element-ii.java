class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans = new int[nums.length];
        Arrays.fill(ans,-1);
        Stack<Integer> stack = new Stack<>();
        for(int i=(nums.length*2)-1;i>=0;i--){
            int num = nums[i%nums.length];
            while(!stack.isEmpty()&&stack.peek()<=num){
                stack.pop();
            }
            if(i<nums.length&&!stack.isEmpty()){
                ans[i]=stack.peek();
            }
            stack.push(num);
        }
        return ans;
    }
}