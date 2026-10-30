class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // nums2 ke har element ke liye next greater find karo
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                map.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        // Jo elements stack mein bach gaye, unka koi next greater nahi hai
        while (!stack.isEmpty()) {
            map.put(stack.pop(), -1);
        }
        
        // nums1 ke elements ke liye answer nikal lo
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = map.get(nums1[i]);
        }
        
        return result;
    }
}