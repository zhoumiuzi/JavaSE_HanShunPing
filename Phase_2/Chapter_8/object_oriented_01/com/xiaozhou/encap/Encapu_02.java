package com.xiaozhou.encap;

import java.util.Scanner;

/**
 * @Author: zhouMiuzi
 * @CreateTime: 2024-11-03
 * @Description: 封装练习
 * @Version: 1.0
 */


public class Encapu_02 {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("名字：");
        String name=scanner.next();
        System.out.print("密码：");
        int passwd=scanner.nextInt();
        System.out.print("账户余额：");
        double money=scanner.nextDouble();
        Account account = new Account(name,money,passwd);

        account.info();
    }
}

class Account{
    public String name;
    private double money;
    private int passwd;

    public Account(String name, double money, int passwd) {
        setMoney(money);
        setName(name);
        setPasswd(passwd);
    }


    public void setName(String name) {
        if(name.length()>=2&&name.length()<=4){
            this.name = name;
        }else{
            System.out.println("密码长度要在2-4之间");
        }

    }

    public void setMoney(double money) {
        if(money>20){
            this.money = money;
        }else{
            System.out.println("没钱你开什么账户");
        }

    }

    public void setPasswd(int passwd) {
        if(passwd>99999&&passwd<1000000){
            this.passwd = passwd;
        }else{
            System.out.println("要6位密码");
        }
    }

    void info(){
        System.out.println("人："+this.name+" 钱:"+this.money+" 密码："+this.passwd);
    }
}