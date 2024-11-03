package com.xiaozhou.encap;

import java.util.Objects;
import java.util.Scanner;

/**
 * @Author: zhouMiuzi
 * @CreateTime: 2024-11-03
 * @Description: 引入封装
 * @Version: 1.0
 */

//不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。
// 年龄合理就设置，否则给默认年龄, 必须在 1-120, 年龄， 工资不能直接查看 ， name 的长度在 2-6 字符 之间

public class Encapu_01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("XiaoZhou");
        person.setAge(1000);
        person.setSalary(3000);
        person.info();

        person.getSalary();
    }
}


class Person {
    public String name;
    private int age;
    private double salary;

    public void setName(String name) {
        if (name.length() >= 2 && name.length() < 6) {
            this.name = name;
        }

    }

    public void setAge(int age) {
        if (age > 0 && age <= 120) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    void info() {
        System.out.println("name= " + this.name + " age= " + this.age + " salary= " + this.salary);
    }

    public void getSalary() {
        System.out.println("输入密码：");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.next();
        if (Objects.equals(in, "Xiaozhou")) {
            System.out.println(salary);
        }else{
            System.out.println("不给看");
        }
    }
}






















