public class BigDiff {

    public int bigDiff(int[] nums) {

        if (nums == null) {
            throw new NullPointerException("argument must be not null");
        }

        if (nums.length == 0) {
            return 0;
        }

        int min = nums[0];
        int max = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            if (nums[nums.length - i - 1] > max) max = nums[nums.length - i - 1];
            if (nums[i] < min) min = nums[i];
        }

        return max - min;
    }
}