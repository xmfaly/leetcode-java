import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 将O(n^3)转换成O(n^2)
 * 1. 进行排序 时间复杂度为O(nlgn)
 * 2. 固定一个值，然后从前后扫其他数 如果合为0符合题意 时间复杂度为 O(n^2)
 */
public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            List<List<Integer>> ans = new ArrayList<>();
            if (nums == null || nums.length < 3) {
                return ans;
            }
            Arrays.sort(nums);
            int len = nums.length;

            for (int i = 0; i < len - 2; i++) {
                int l = i + 1, r = len - 1;
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                while (l < r) {
                    if (nums[i] + nums[l] + nums[r] < 0) {
                        l++;
                    } else if (nums[i] + nums[l] + nums[r] > 0) {
                        r--;
                    } else {
                        //ans
                        List<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[l]);
                        a.add(nums[r]);
                        ans.add(a);
                        l++;
                        r--;
                        while (l < r && nums[l] == nums[l - 1]) l++;
                        while (l < r && nums[r] == nums[r + 1]) r--;
                    }
                }
            }
            return ans;
        }
    }
}
