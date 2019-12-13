package com.arithmetic.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。
 * 返回妹妹可以获得的最大糖果的种类数。
 * <p>
 * 示例 1:
 * 输入: candies = [1,1,2,2,3,3]
 * 输出: 3
 * 解析: 一共有三种种类的糖果，每一种都有两个。
 * 最优分配方案：妹妹获得[1,2,3],弟弟也获得[1,2,3]。这样使妹妹获得糖果的种类数最多。
 * <p>
 * 示例 2 :
 * 输入: candies = [1,1,2,3]
 * 输出: 2
 * 解析: 妹妹获得糖果[2,3],弟弟获得糖果[1,1]，妹妹有两种不同的糖果，弟弟只有一种。这样使得妹妹可以获得的糖果种类数最多。
 *
 * @MailTO <a href="liukailk.ken@gmail.com"/>
 * @See
 * @Author ken
 * @Date 2019/12/13 10:35 上午
 **/
public class Array4 {


    public static int distributeCandies(int[] candies) {
        //1、先算出妹妹拿到的糖果数量getCount，然后和总种类数kindNums做对比；
        //2、种类数kindNums大于getCount，返回getCount;
        //   种类数kindNums小于getCount，返回kindNums;

        if (candies.length == 0) {
            return 0;
        }

        //拿到的糖果数量getCount
        int getCount = candies.length / 2;

        //计算总种类数kindNums--数组去重
        Set set = new HashSet();
        for (int i = 0; i < candies.length; i++) {
            set.add(candies[i]);
        }

        int kindNums = set.size();

        return getCount > kindNums ? kindNums : getCount;
    }

    public static void main(String[] args) {

        int[] candies = {1, 1, 2, 3};
        System.out.println("可以获得的最多种类数：" + distributeCandies(candies));
    }


}
