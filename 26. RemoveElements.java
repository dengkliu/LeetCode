public class RemoveElements {
    public int removeElement(int[] nums, int val) {
        int len = nums.length;
        for (int i = 0 ; i< len; ++i){
            while (nums[i]==val && i< len) // use while instead of using if!!!
            {
                nums[i]=nums[len-1];
                len--;
            }
        }
        return len;
    }
}