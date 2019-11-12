package com.arithmetic.array;

import java.util.Arrays;

/**
 * 给定一个数组 nums 和一个值 val，你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度。
 * <p>
 * <p>
 * 给定 nums = [0,1,2,2,3,0,4,2], val = 2,
 * <p>
 * 函数应该返回新的长度 5, 并且 nums 中的前五个元素为 0, 1, 3, 0, 4。
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/11/12 11:29 上午
 **/
public class Array2 {

    public static int removeElement(int[] nums, int val) {

        if (nums == null || nums.length == 0) {
            return 0;
        }
        //当前数组下标
        int i = 0;

        //新数组下标
        int j = 0;


        while (i < nums.length) {
            if (val != nums[i]) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }


        return j;
    }


    public static void main(String[] args) {
        int[] nums = {2};

        int count = removeElement(nums, 3);
        System.out.printf("个数==>" + count + "nums==>" + Arrays.toString(nums));


    }

}
