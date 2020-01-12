package com.arithmetic.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 数轴上放置了一些筹码，每个筹码的位置存在数组 chips 当中。
 * <p>
 * 你可以对 任何筹码 执行下面两种操作之一（不限操作次数，0 次也可以）：
 * <p>
 * 将第 i 个筹码向左或者右移动 2 个单位，代价为 0。
 * 将第 i 个筹码向左或者右移动 1 个单位，代价为 1。
 * 最开始的时候，同一位置上也可能放着两个或者更多的筹码。
 * <p>
 * 返回将所有筹码移动到同一位置（任意位置）上所需要的最小代价。
 * <p>
 * <p>
 * 示例 1：
 * 输入：chips = [1,2,3]
 * 输出：1
 * 解释：第二个筹码移动到位置三的代价是 1，第一个筹码移动到位置三的代价是 0，总代价为 1。
 * <p>
 * 示例 2：
 * 输入：chips = [2,2,2,3,3]
 * 输出：2
 * 解释：第四和第五个筹码移动到位置二的代价都是 1，所以最小总代价为 2。
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/12/20 9:18 上午
 **/
public class Array5 {


    public static void main(String[] args) {

        int[] chips1 = {1,2,2,2,2};

        int[] chips2 = {2, 2, 2, 3, 3};

        System.out.println("===>" + minCostToMoveChips(chips1));
        System.out.println("===>" + minCostToMoveChips(chips2));


    }


    public static int minCostToMoveChips(int[] chips) {

        if (chips == null || chips.length == 0) {
            return 0;
        }
        //奇数数组长度往中间元素移动代价最小
        int count1 = 0;
        //偶数数组长度往中间任意两个元素移动代价最小
        int count2 = 0;

        for (int chip : chips) {
            if (chip%2 == 0){
                count1++;
            }else {
                count2++;
            }
        }


        return Math.min(count1, count2);


    }


}
