package code1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WuQiChuan
 * @Description:
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 *
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @Date: Created in:2018/10/17 22:56
 * @Version: 1.0
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0;i<nums.length;i++){
            //差值等于目标减当前值
            int complement = target - nums[i];
            //如果存在和当前差值一样的key，就返回
            if(map.containsKey(complement)){
                return new int[] { map.get(complement), i };
            }
            //将数组值作为key，索引下标作为value
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
