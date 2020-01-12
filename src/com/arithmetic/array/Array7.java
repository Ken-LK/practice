package com.arithmetic.array;

import java.util.ArrayList;
import java.util.List;


/**
 给定一个整数数组 nums，按要求返回一个新数组 counts。
 数组 counts 有该性质： counts[i] 的值是  nums[i] 右侧小于 nums[i] 的元素的数量。

 示例:
    输入: [5,2,6,1]
    输出: [2,1,1,0]
 解释:
    5 的右侧有 2 个更小的元素 (2 和 1).
    2 的右侧仅有 1 个更小的元素 (1).
    6 的右侧有 1 个更小的元素 (1).
    1 的右侧有 0 个更小的元素.

 * @Author ken
 * @Date 2019/12/30 9:51 上午
 **/
public class Array7 {


    public static void main(String[] args) {

        int[] nums = {5,2,6,1};

        countSmaller(nums).forEach(
                num-> System.out.println(num+",")
        );

    }

    public static List<Integer> countSmaller(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i=0;i<nums.length;i++){

            int count = 0;
            //从右向左，循环到第i个元素
            for (int j=nums.length-1;j > i; j--)
            {
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            list.add(count);

        }



        return list;

    }


}
