import java.util.Arrays;
import java.util.HashMap;

/**
 * 直接遍历即可
 */
//public class TowSum {
//
//    class Solution {
//        public int[] twoSum(int[] nums, int target) {
//
//            int[] ans = new int[2];
//            for(int i=0;i<nums.length;i++){
//                for(int j=i+1;j<nums.length;j++){
//                    if (nums[i] + nums[j] == target){
//                        ans[0] = i;
//                        ans[1] = j;
//                    }
//                }
//            }
//            return ans;
//        }
//    }
//}

public class TowSum {

    class Solution {
        public int[] twoSum(int[] nums, int target) {
            int[] res = new int[2];
            if (nums == null || nums.length < 2)
                return res;
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (!map.containsKey(target - nums[i])) {
                    map.put(nums[i], i);
                } else {
                    res[0] = map.get(target - nums[i]);
                    res[1] = i;
                    break;
                }
            }
            return res;
        }
    }
}
