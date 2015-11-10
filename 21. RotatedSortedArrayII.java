public class RotatedSortedArrayII {
public boolean search(int[] nums, int target) {
    int start = 0;
    int end = nums.length - 1;
    while (start <= end) {
        int mid = start + (end - start) / 2;
        if (nums[mid] == target) // case 0
            return true;
        // finally start == mid == end, if case 0, return true, else end the loop
        else if (nums[start] == nums[mid])
            start++;
        else if (nums[end] == nums[mid])
            end--;
        else if (nums[start] <= target && target <= nums[mid]) // case 1
            end = mid;
        else if (nums[mid] < target && target <= nums[end]) // case 2
            start = mid + 1;
        else if (nums[start] > nums[mid]) // case 2 is false, so target in this range
            end = mid;
        else   // case A[mid] > A[end] and case 1 is false, similar to above
            start = mid + 1;
    }
    return false;
}
}