package com.xiaozhou.extend;

/**
 * @Author: zhouMiuzi
 * @CreateTime: 2024-11-05
 * @Description: pc子类
 * @Version: 1.0
 */


public class Pc extends Computer{

    private String brand;

    public Pc(String cpu, int memory, int hardisk, String brand) {
        super(cpu, memory, hardisk);
        this.brand = brand;
    }

    public Pc(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void printInfo(){
        System.out.println("以下是pc的信息: ");
        System.out.print(getCpu()+getMemory()+getHardisk());
        System.out.print(" "+getBrand());
    }

}
