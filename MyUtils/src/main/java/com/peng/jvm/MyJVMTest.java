package com.peng.jvm;

/**
 * @author peng.wang
 * @Description TODO
 * @createTime 2020/9/29
 */
public class MyJVMTest {

    public void syncBlock(){
        synchronized (this){
            System.out.println("hello block");
        }
    }
    public synchronized void syncMethod(){
        System.out.println("hello method");
    }

}
