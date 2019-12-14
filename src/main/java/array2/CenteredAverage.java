package array2;

public class CenteredAverage {

    public int centeredAverage(int[] nums) {

        if (nums == null) throw new NullPointerException("argument must be not null");

        if (nums.length < 3) return 0;

        int min = nums[0];
        int max = nums[0];
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) max = nums[i];
            if (min > nums[i]) min = nums[i];
            sum += nums[i];
        }

        return (sum - max - min) / (nums.length - 2);
    }
}
