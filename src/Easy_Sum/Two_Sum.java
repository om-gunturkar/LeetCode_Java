//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
package Easy_Sum;
import java.util.Arrays;
import java.util.HashMap;
public class Two_Sum {
    public int[] solution(int[] nums,int target){
        HashMap<Integer,Integer> seen=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            int complement=target-nums[i];
            if(seen.containsKey(complement)){
                return new int[]{
                        seen.get(complement),i};
                }
            seen.put(nums[i],i);
            }
        return new int[]{};
        }
    public static void main(String[] args) {
        Two_Sum ts = new Two_Sum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = ts.solution(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
    }
