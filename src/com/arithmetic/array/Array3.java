package com.arithmetic.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/12 2:05 下午
 **/
public class Array3 {

    public static void main(String[] args) {

        int[] nums = {2,2,3,4,5};

        System.out.println("==>"+ Arrays.toString(twoSum2(nums,9)));


    }

    public static int[] twoSum1(int[] nums, int target) {

        int[] result = new int[2];

        if(nums == null || nums.length < 2){
            return result;
        }

        //双游标
        int i = 0;

        int j = 1;

        boolean isFind = false;

        while (i < nums.length){

            if (!isFind)
            {
                while (j < nums.length){
                    if (nums[i] + nums[j] != target){
                        j++;
                    }
                    else
                    {
                        result[0] = i;
                        result[1] = j;

                        isFind =true;

                        j++;
                    }
                }

                i++;
                j=i+1;

            }else {
                break;
            }


        }

        return result;

    }

    public static int[] twoSum2(int[] nums, int target){

        Map<Integer,Integer> map = new HashMap<>();

        int complement;
        for (int i=0;i<nums.length;i++){
            complement = target - nums[i];
            if (map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }

        throw new IllegalArgumentException("No two sum solution");
    }


}
