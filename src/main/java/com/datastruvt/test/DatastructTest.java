package com.datastruvt.test;

import com.datastruvt.utils.ArrQueue;
import com.datastruvt.utils.LinkNode;
import com.datastruvt.utils.SingleLinkedList;

public class DatastructTest {

    public static void main(String[] args) {
        testLinkNode();
    }

    public static void testLinkNode(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        LinkNode node1 = new LinkNode(1,"horace");
        LinkNode node2 = new LinkNode(2,"horace2");
        LinkNode node3 = new LinkNode(3,"horace3");
        singleLinkedList.addToLast(node1).addToLast(node2).addToLast(node3);

    }

    public static void testDataStruct(){
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
