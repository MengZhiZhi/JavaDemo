package com.qqlvp;
// 第二章示例代码
public class Chapter2 {
    // 1-3 程序示例章节(1)
    public static void main(String[] args) {
        Chapter2.PrintIntegerMaxAndMinValue();
    }

    // 2-2 基本数据类型的示例代码
    public static void PrintIntegerMaxAndMinValue(){
        // Int 类型的最大值和最小值
        System.out.println(Integer.MAX_VALUE);  // 输出： 2147483647
        System.out.println(Integer.MIN_VALUE);  // 输出： -2147483648

        // Long 类型的最大值和最小值
        System.out.println(Long.MAX_VALUE);  // 输出：9223372036854775807
        System.out.println(Long.MIN_VALUE);  // 输出：-9223372036854775808

        // Float类型的常量
        System.out.println(Float.MAX_VALUE);  // 输出：3.4028235E38
        System.out.println(Float.MIN_VALUE);  // 输出：1.4E-45
        System.out.println(Float.POSITIVE_INFINITY);  // 输出：Infinity
        System.out.println(Float.NEGATIVE_INFINITY);  // 输出：-Infinity
        System.out.println(Float.NaN);  // 输出：NaN

        // Double类型的常量
        System.out.println(Double.MAX_VALUE);  // 输出：1.7976931348623157E308
        System.out.println(Double.MIN_VALUE);  // 输出：4.9E-324
        System.out.println(Double.POSITIVE_INFINITY);  // 输出：Infinity
        System.out.println(Double.NEGATIVE_INFINITY);  // 输出：-Infinity
        System.out.println(Double.NaN);  // 输出：NaN

        // 声明一个Char类型的数据
        char c = 'a';
        System.out.println(c); // 打印输出Char类型的数据

        // 声明并初始化一个boolean类型的变量
        boolean b = true;

        System.out.println(b);


    }
}
