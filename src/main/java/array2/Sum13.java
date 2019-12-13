public class Sum13 {

    public int sum13(int[] nums) {

        if (nums == null) throw new NullPointerException("argument must be not null");

        int sum = 0;

        if (nums.length == 0) return 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) i++;
            else sum += nums[i];
        }

        return sum;
    }

}
