package com.wangxingdi.algorithm.leetcode.easy;

/**
 * 7. 整数反转
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 *
 * 示例 1:
 * 输入: 123
 * 输出: 321
 *
 *  示例 2:
 * 输入: -123
 * 输出: -321
 *
 * 示例 3:
 * 输入: 120
 * 输出: 21
 *
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class Q0007_ReverseInteger {

    public static void main(String[] args) {
        Q0007_ReverseInteger clazz = new Q0007_ReverseInteger();
        System.out.println(clazz.reverse(1023456789));
    }

    /**
     * 使用/和%运算
     * 拓展：取余和取模区别是什么？java中%是取余还是取模
     * @param x
     * @return
     */
    public int reverse(int x) {
        int res = 0;
        while(x!=0){
            int cur = x % 10;
            x /= 10;
            if(res>Integer.MAX_VALUE/10 || res==Integer.MAX_VALUE && cur>7){
                return 0;
            }
            if(res<Integer.MIN_VALUE/10 || res==Integer.MIN_VALUE && cur<-8){
                return 0;
            }
            res = res * 10 + cur;
        }
        return res;
    }
}
