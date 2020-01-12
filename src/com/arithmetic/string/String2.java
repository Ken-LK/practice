package com.arithmetic.string;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * 移除无效的括号
 * 给你一个由 '('、')' 和小写字母组成的字符串 s。
 * 你需要从字符串中删除最少数目的 '(' 或者 ')' （可以删除任意位置的括号)，使得剩下的「括号字符串」有效。
 * 请返回任意一个合法字符串。
 * 有效「括号字符串」应当符合以下 任意一条 要求：
 * 空字符串或只包含小写字母的字符串
 * 可以被写作 AB（A 连接 B）的字符串，其中 A 和 B 都是有效「括号字符串」
 * 可以被写作 (A) 的字符串，其中 A 是一个有效的「括号字符串」
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "a)b(c)d"
 * 输出："ab(c)d"
 * <p>
 * 示例 2：
 * 输入：s = "))(("
 * 输出：""
 * 解释：空字符串也是有效的
 * <p>
 * 示例 3：
 * 输入：s = "(a(b(c)d)"
 * 输出："a(b(c)d)"
 *
 * @Author ken
 * @Date 2019/12/30 11:01 上午
 **/
public class String2 {

    public static void main(String[] args) {
        String ss = "a)b(c)d";

        System.out.println("===>" + minRemoveToMakeValid(ss));
    }

    public static String minRemoveToMakeValid(String s) {

        StringBuilder availableSb = new StringBuilder();

        //与数据同长的boolean数组，不可用为true
        boolean[] invalidIndex = new boolean[s.length()];

        //使用栈记录
        Stack<Integer> stack = new Stack();

        ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(11);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
                invalidIndex[i] = true;
            }
            if (s.charAt(i) == ')') {
                if (stack.empty()) {
                    invalidIndex[i] = true;
                } else {
                    invalidIndex[stack.pop()] = false;
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            if (!invalidIndex[i]) {
                availableSb.append(s.charAt(i));
            }
        }

        return availableSb.toString();


    }

}
