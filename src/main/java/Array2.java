public class Array2 {

    public int countEvens(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }

        return count;
    }

    public int bigDiff(int[] nums) {
        if (nums.length == 0) return 0;

        int min = nums[0];
        int max = nums[nums.length - 1];

        for (int i = 1; i < nums.length; i++) {
            if (nums[nums.length - i - 1] > max) max = nums[nums.length - i - 1];
            if (nums[i] < min) min = nums[i];
        }

        return max - min;
    }

    public int centeredAverage(int[] nums) {
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


    public int sum13(int[] nums) {
        int sum = 0;

        if (nums.length == 0) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) i++;
            else sum += nums[i];
        }

        return sum;
    }


    public boolean has22(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) return true;
        }

        return false;
    }


}
