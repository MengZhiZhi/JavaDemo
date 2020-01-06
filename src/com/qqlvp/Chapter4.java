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

}

