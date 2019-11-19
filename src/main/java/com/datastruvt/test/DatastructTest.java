package com.datastruvt.test;

import com.datastruvt.utils.ArrQueue;

public class DatastructTest {

    public static void main(String[] args) {
        ArrQueue que = new ArrQueue(3);
        que.add(555);
        que.add(665);
        que.showQue();
        System.out.println("---------");
        System.out.println(que.get());
        System.out.println(que.get());
        System.out.println("---------");
        que.add(777);
        que.add(888);
        que.showQue();
        System.out.println("---------");
        System.out.println(que.get());
        System.out.println(que.get());
        System.out.println("---------");
        System.out.println("front="+que.getFront());
        System.out.println("rear="+que.getRear());
        System.out.println(que.get());
    }
}
