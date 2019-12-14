package array2;

public class Has22 {

    public boolean has22(int[] nums) {

        if (nums == null) throw new NullPointerException("argument must be not null");

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 2) return true;
        }

        return false;
    }

}
