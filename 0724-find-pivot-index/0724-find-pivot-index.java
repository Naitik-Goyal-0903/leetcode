class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int[] arr_left = new int[n];
        int[] arr_right = new int[n];

        arr_left[0] = 0;
        for (int i = 1; i < n; i++) {
            arr_left[i] = arr_left[i - 1] + nums[i - 1];
        }

        arr_right[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            arr_right[i] = arr_right[i + 1] + nums[i + 1];
        }

        for (int k = 0; k < n; k++) {
            if (arr_left[k] == arr_right[k]) {
                return k;
            }
        }

        return -1;
    }
}