package com.test.asynctaskdemo;

/**
 * Created by zhoumao on 16/1/16.
 */
public class NetOperator {

    public void operator(){
        try {
            //休眠1秒
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
