// 第四章示例代码
package com.qqlvp;

public class Chapter4 {

    public static void main(String[] args) {

        // 这就是调用了默认的构造方法
        Student stu = new Student();

        stu.age = 15;
        stu.name = "Bob";

        System.out.println(stu.age);
        System.out.println(stu.name);

        // 按值传送示例
        String str;
        int val;

        PassValueTest pt = new PassValueTest();

        val = 11;
        pt.changeInt(val); // 改变val的值
        System.out.println("Int value is :"+val);

        str = new String("Hello");

        pt.changeStr(str);

        System.out.println("Str value is"+str);

        pt.ptValue = 101.f;  // 给ptValue赋值

        pt.changeObjValue(pt);  // 通过对象引用该值

        System.out.println("Current ptValue is:"+pt.ptValue);


        // 数学函数的使用示例
        Circle c1 = new Circle();
        c1.setRadius(50);
        Circle c2 = new Circle();
        c2.setRadius(10);

        double circum1 = c1.circumference();
        double circum2 = c2.circumference();

        System.out.println("Circle1 has circumference:"+circum1);
        System.out.println("Circle2 has circumference:"+circum2);


        //静态方法示例
        int a = 9,b = 10;
        // 使用类名来调用方法，而不是对象名
        int c = GeneralFunction.addUp(a,b);
        System.out.println("addUp() give:"+c);


        // 自动装箱示例
        Integer obj1;

        int num1 = 69;

        obj1 = num1;  // 自动创建Integer对象

        // 自动拆箱示例
        Integer obj2 = new Integer(69);


        int num2;

        num2 = obj2;  // 自动解析出int型




    }

    // (1)类的示例
    // 使用类可以构造所需的各种类型。例如 ，程序中要说明日期这个类型，
    // 它含有3个成员变量：日、月 、年 ，分别用3个整数来表示。
    public class Date{
        private int day,month,year; // 日，月，年

        public void printDate(){
            // 通过this关键字调用自身属性
            System.out.println("The current date is (dd/mm/yy):"+this.day+"/"+this.month+"/"+this.year);
        }
    }

    public class Person{
        private String name;
        private int age;
        private String gender,phonenumber;

        public String getName() {
            // 此处是必要的代码
            return name;
        }

        public int getAge() {
            // 此处是必要的代码
            return age;
        }

        public void setPhonenumber(String phonenumber) {
            // 此处是必要的代码
            this.phonenumber = phonenumber;
        }
    }

    class BankAccount{
        private String owner;
        private float balance;
        private long accountNumber;

        private void withdraw(float need){
            // 此处是必要的代码
        }

        private void deposit(float cash){
        }

    }

    // 6、默认的构造方法
    private static class Student{

        public int age;

        public String name;

        public Student(String s,int a){
            name = s;
            age = a;
        }
        public  Student(String s){
            name = s;
        }
        public  Student(int a){
            age = a;
        }

        // 默认的构造方法
        public Student(){
            this("Unknow");
        }
    }

    //按值传送的示例
    public static class PassValueTest{
        private  float ptValue;
        public void changeInt(int value){
            value = 55;
        }
        public void changeStr(String value){
            value = new String("different");
        }
        public void changeObjValue(PassValueTest ref){
            ref.ptValue = 99.0f;
        }
    }

    // 数学函数的使用示例
    public static class Circle{
        static double PI = 3.14159265;
        private int radius;
        public double circumference(){
            return 2*PI*radius;
        }
        public void setRadius(int r){
            radius = r;
        }
    }

    // 静态方法的示例
    public static class GeneralFunction{
        // 静态方法
        public static  int addUp(int x,int y){
            return x+y;
        }
    }

}

