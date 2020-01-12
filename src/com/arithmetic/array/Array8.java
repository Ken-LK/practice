package com.arithmetic.array;

import java.util.*;
import java.util.stream.Stream;

/**
 * 给你两个整数数组 arr1 和 arr2，返回使 arr1 严格递增所需要的最小「操作」数（可能为 0）。
 * <p>
 * 每一步「操作」中，你可以分别从 arr1 和 arr2 中各选出一个索引，分别为 i 和 j，0 <= i < arr1.length 和 0 <= j < arr2.length，然后进行赋值运算 arr1[i] = arr2[j]。
 * <p>
 * 如果无法让 arr1 严格递增，请返回 -1。
 * <p>
 * 示例 1：
 * 输入：arr1 = [1,5,3,6,7], arr2 = [1,3,2,4]
 * 输出：1
 * 解释：用 2 来替换 5，之后 arr1 = [1, 2, 3, 6, 7]。
 * <p>
 * 示例 2：
 * 输入：arr1 = [1,5,3,6,7], arr2 = [4,3,1]
 * 输出：2
 * 解释：用 3 来替换 5，然后用 4 来替换 3，得到 arr1 = [1, 3, 4, 6, 7]。
 * <p>
 * 示例 3：
 * 输入：arr1 = [1,5,3,6,7], arr2 = [1,6,3,3]
 * 输出：-1
 * 解释：无法使 arr1 严格递增。
 *
 * @Author ken
 * @Date 2019/12/30 10:13 上午
 **/
public class Array8 {


    public static void main(String[] args) {

        int[] arr1 = {1,5,3,6,7};
        int[] arr2 = {4,3,1};

        System.out.println("===>"+makeArrayIncreasing(arr1,arr2));


    }


    public static int makeArrayIncreasing(int[] arr1, int[] arr2) {

        int useCount = 0;

        //相等不符合严格递增
        Set<Integer> arr2Set = new HashSet<>();

        for (int arr : arr2) {
            arr2Set.add(arr);
        }

        if (arr2 == null || arr2.length == 0) {
            return -1;
        }

        for (int i = 1; i < arr1.length; i++) {

            //满足严格递增，pass
            if (arr1[i] > arr1[i - 1] && arr1[i] < arr1[i + 1]) {
                break;
            }
            // 不满足，从arr2里查找有没有符合的
            // 三种情况：
            // 1、左边 大于或等于，右边符合；
            // 2、右边 小于或等于，左边符合；
            // 3、右边 小于或等于，左边 大于或等于；
            else {
                // 1、左边大于或等于，右边符合；
                if (arr1[i] <= arr1[i - 1] && arr1[i] < arr1[i + 1]) {

                    //符合条件的数据
                    for (Integer arr2_set : arr2Set) {
                        if (arr1[i] > arr2_set) {
                            useCount++;
                            break;
                        }
                    }

                }
                // 2、右边 小于或等于，左边符合；
                else if (arr1[i] > arr1[i - 1] && arr1[i] > arr1[i + 1]) {

                    //符合条件的数据
                    for (Integer arr2_set : arr2Set) {
                        if (arr1[i] < arr2_set) {
                            useCount++;
                            break;
                        }
                    }

                }
                // 3、右边 小于或等于，左边 大于或等于；
                else {

                    //符合条件的数据
                    for (Integer arr2_set : arr2Set) {
                        //找左边数据
                        if (arr1[i] > arr2_set) {
                            useCount++;
                            break;
                        }
                        //找右边数据
                        else if (arr1[i] < arr2_set) {
                            useCount++;
                            break;
                        }
                    }
                }
            }
        }


        return useCount;

    }


}
