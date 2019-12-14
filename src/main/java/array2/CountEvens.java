package array2;

public class CountEvens {

    public int countEvens(int[] nums) {

        if (nums == null) throw new NullPointerException("argument array must be not null");
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) count++;
        }

        return count;
    }
}
