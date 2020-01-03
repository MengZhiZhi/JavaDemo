// 第三章示例代码
package com.qqlvp;

import com.student.*; // 导入student包下的所有的类

import com.student.Student; // 导入 student包下的Student类

public class Chapter3 {

    public static void main(String[] args) {
        // 使用Student类
        Student stu = new Student();
        stu.name = "Bob";
        stu.age = 15;
        stu.play();
    }
}
