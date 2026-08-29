class Solution {
    public int[] nextGreaterElement(int[] num1, int[] num2) {
        int[] ans = new int[num1.length];

        for (int j = 0; j < num1.length; j++) {
            Stack<Integer> stack = new Stack<>();

            for (int i = num2.length - 1; i >= 0; i--) {

                while (!stack.isEmpty() && stack.peek() <= num2[i]) {
                    stack.pop();
                }

                if (num2[i] == num1[j]) {
                    ans[j] = stack.isEmpty() ? -1 : stack.peek();
                    break;
                }

                stack.push(num2[i]);
            }
        }

        return ans;
    }
}
