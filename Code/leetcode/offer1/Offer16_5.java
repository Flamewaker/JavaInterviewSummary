package com.todd.leetcode.offer1;

/**
 * @author todd
 * @date 2020/6/17 11:40
 * @description: 设计一个算法，算出 n 阶乘有多少个尾随零。
 * 其实n!中的零全部是5和2的倍数贡献的，由于因子为2的个数大于5的，所以，只需计算其中有多少个5的倍数即可。
 * 有多少个尾随 0，其实也就是有多少个尾数为 5、尾数为 0 的数字，即可以整除 5，所以可以遍历一遍，每次遇到可以整除 5 的数字 +1，但是对于诸如 25，125等包含多个 5 的数字，就需要循环取出因子了。
 * 数从1 - n之间，有多少个数含有5为因子，并要把所有的5因子的个数加起来。
 */
public class Offer16_5 {
    public int trailingZeroes(int n) {
        int m5 = 0;
        while (n > 0) {
            n /= 5;
            m5 += n;
        }
        return m5;
    }
}
