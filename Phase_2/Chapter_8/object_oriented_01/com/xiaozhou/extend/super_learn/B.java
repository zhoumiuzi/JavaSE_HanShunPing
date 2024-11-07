package com.xiaozhou.extend.super_learn;

/**
 * @Author: zhouMiuzi
 * @CreateTime: 2024-11-05
 * @Description: A 的子类
 * @Version: 1.0
 */


public class B extends A {

    //访问父类的属性
    public void h1() {
        System.out.println(super.n1 + super.n2 + super.n3);
    }

    public void ok() {
        super.test1();
        super.test2();
        super.test3();
    }

}
