public class SummaryRanges {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> results = new ArrayList<String>();
        if (nums.length == 0) return results;

        int beginVal = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] + 0L - nums[i-1] > 1) {
                results.add(constructRange(beginVal, nums[i-1]));
                beginVal = nums[i];
            }
        }
        
        results.add(constructRange(beginVal, nums[nums.length-1]));
        return results;
    }

    private String constructRange(int beginVal, int endVal) {
        if (beginVal == endVal) {
            return beginVal + "";
        }
        return beginVal + "->" + endVal;
    }
}