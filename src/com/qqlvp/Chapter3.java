// 第三章示例代码
package com.qqlvp;

import com.student.*; // 导入student包下的所有的类

import com.student.Student; // 导入 student包下的Student类

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Chapter3 {

    public static void main(String[] args) {
        // 使用Student类
        Student stu = new Student();
        stu.name = "Bob";
        stu.age = 15;
        stu.play();

        test1();

    }

    // 流程控制语句示例
    public static void test(){
        // if...else... 语句示例
        int a = 3;
        int b = 5;

        if (a > b){
            // 当 a>b 为真时，执行下面的语句
            System.out.println("a > b");
        }else {
            // 当 a>b 为假时，执行下面的语句
            System.out.println("b > a");
        }


        // if...elseif...else 语句示例
        int a1 = 59;
        if(a1 > 90){
            System.out.println("成绩优秀");
        }else if(a1 > 60 && a1 <= 90){
            System.out.println("成绩良好");
        }else if (a1 == 59){
            System.out.println("差一分就及格了");
        }else {
            System.out.println("不及格");
        }

        // if语句可以嵌套使用，if中还可以写if判断
        int c = 100;

        if (a>b){
            if(a>c){
                System.out.println("a>b>c");
            }else {
                System.out.println("a>b && a<c");
            }
        }


        // switch语句实例
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输出数字：");
        int day = scanner.nextInt();
        switch (day){
            case 1:{
                System.out.println("星期一");
            }
            break;
            case 2:{
                System.out.println("星期二");
            }
            break;
            case 3:{
                System.out.println("星期三");
            }
            break;
            case 4:{
                System.out.println("星期四");
            }
            break;
            case 5:{
                System.out.println("星期五");
            }
            break;
            case 6:{
                System.out.println("星期六");
            }
            break;
            case 7:{
                System.out.println("星期天");
            }
            break;
            default:{
                System.out.println("输入错误！");
            }
        }


        // For循环语句示例代码
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }
        // 该程序总共执行10，每次输出i的值，当i=11时，循环条件为假，循环结束，
        // 如果条件表达式的值永远为真，则循环会无限制地执行下去，直到系统资源耗尽为止。


        // 5、While 语句代码示例
        a = 1;
        b = 10;
        while (a < b){
            a += 2;
        }
        //如果a<b为false，循环体将一次不执行，如果a的值不变，此循环为死循环。

        System.out.println(a+b);


        // 6、Do 语句代码示例
        a = 1;
        b = 10;

        do{
            a += 2;
        }while (a < b);

        // 不论条件是否成立，do中的循环体都会运行一次。

        System.out.println(a+b);


        // 7-1 break 语句

        for (int i = 0; i < 10; i++){
            if (i == 3){
                // 当 i == 3 时，执行break语句，跳出循环
                break;
            }
            System.out.println(i);
        }

        // 7-2 continue 语句代码示例
        out:for (int i = 0;i < 10;i++){
            for (int j = 0; j < 20; j++){
                if(j > i){
                    System.out.println("");
                    continue out;
                }
                System.out.println("*");
            }
        }

    }

    // 3-3 输入输出
    public static void test1(){

        //3-3-1：使用Scanner类,获取键盘输入的字符
        String message;

        Scanner scan = new Scanner(System.in);

        // 创建从键盘输入的对象
        System.out.println("Enter a line of text:");

        message = scan.nextLine();  // 从键盘读入一行

        System.out.println("You enter:"+message);


        //3-3-2：读入数值数值示例
        int age;

        double weight,height,bmi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入您的年龄：");

        age = scanner.nextInt();

        System.out.println("请输入您的体重（ 公斤）:");

        weight = scanner.nextDouble();

        System.out.println("请输入您的身高（米）:");

        height = scanner.nextDouble();

        bmi = weight/(height * height);

        System.out.println("BMI:"+bmi);


        // 3-3-3 NumberFormat的使用

        Double myNumber = 12345.123456789;

        NumberFormat.getInstance().format(myNumber);  //返回当前默认语言环境的默认数值格式
        NumberFormat.getCurrencyInstance().format(myNumber);  //返回当前默认语言环境的通过格式。
        NumberFormat.getNumberInstance().format(myNumber);    //返回当前默认语言环境的通过数值格式
        NumberFormat.getPercentInstance().format(myNumber);  //返回当前默认语言环境的百分比格式


        NumberFormat format = NumberFormat.getInstance();

        format.setMaximumFractionDigits(2); //设置数值的小数部分允许的最大位数。
        format.setMaximumIntegerDigits(3);  //设置数值的整数部分允许的最大位数。
        format.setMinimumFractionDigits(3); //设置数值的小数部分允许的最小位数。
        format.setMinimumIntegerDigits(4);  //设置数值的整数部分允许的最小位数。

        System.out.println(format.format(myNumber));


        // 3-3-4 DecimalFormat

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("请输入您的年龄：");

        age = scanner1.nextInt();

        System.out.println("请输入您的体重（ 公斤）:");

        weight = scanner1.nextDouble();

        System.out.println("请输入您的身高（米）:");

        height = scanner1.nextDouble();

        bmi = weight/(height * height);

        DecimalFormat format1 = new DecimalFormat("0.###");

        System.out.println("BMI:"+format1.format(bmi));

        // 输出答案：
        /*
            请输入您的年龄：
            25
            请输入您的体重（ 公斤）:
            65
            请输入您的身高（米）:
            178
            BMI:0.002
        */

        // 3-3-5 异常示例
        String greetings[] = {"Hello","World","!"};

        int i = 0;

        while (i < 4){
            // 当i =3时，该输出程序执行到第4次循环时会发生异常
            try {
                System.out.println(greetings[i]);
                i++;
            }catch (ArrayIndexOutOfBoundsException e){
                // 抛出异常
                throw new ArrayIndexOutOfBoundsException(e.getMessage());
            }

        }
        /*
        * 发生异常的代码行，i =3时，程序执行到第4次循环时会发生异常，程序先是输出了部分结果，
        * 然后报告发生了异常；ArraylndexOutOfBoundsException，这个异常的含义是数组下标越界，越界值是3。
        * 下一行告知发生异常的代码所在的行数。
        * */




    }
}
