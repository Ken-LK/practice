package com.arithmetic.array;

import java.util.Arrays;

/**
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 *
 * 给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/12 11:27 上午
 **/
public class Array1 {

    public static int removeDuplicates(int[] nums) {
        if (nums == null){
            return 0;
        }
        if (nums.length == 1){
            return 1;
        }
        int i = 0;
        int j =1;
        while(j<nums.length){
            if(nums[i]==nums[j]){
                j++;
            }else{
                i++;
                nums[i]=nums[j];
                j++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3};
        removeDuplicates(nums);

        System.out.printf("==="+ Arrays.toString(nums));
    }
}
