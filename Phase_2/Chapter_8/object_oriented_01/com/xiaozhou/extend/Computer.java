package com.xiaozhou.extend;

/**
 * @Author: zhouMiuzi
 * @CreateTime: 2024-11-05
 * @Description: Computer类
 * @Version: 1.0
 */


public class Computer {
    private String cpu;
    private int memory;
    private int hardisk;

    //返回computer信息
    public String getDetails(){
        return "cpu: "+cpu+" memory: "+memory+" hardisk: "+hardisk;
    }

    public Computer(String cpu, int memory, int hardisk) {
        this.cpu = cpu;
        this.memory = memory;
        this.hardisk = hardisk;
    }

    public Computer() {}

    public String getCpu() {
        return cpu;
    }

    public int getMemory() {
        return memory;
    }

    public int getHardisk() {
        return hardisk;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public void setHardisk(int hardisk) {
        this.hardisk = hardisk;
    }
}