package com.datastruvt.test;

import com.datastruvt.utils.ArrQueue;
import com.datastruvt.utils.LinkNode;
import com.datastruvt.utils.SingleLinkedList;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedQueue;

public class DatastructTest {

    public static void main(String[] args){
        testSingleLinkedList();
    }

    public static void testSingleLinkedList(){
        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        LinkNode node1 = new LinkNode(5,"horace");
        LinkNode node2 = new LinkNode(3,"horace2");
        singleLinkedList1.addToLast(node1).addToLast(node2);
        singleLinkedList1.list();
        System.out.println("---------");
        singleLinkedList1.delete(node1);
        singleLinkedList1.list();
        System.out.println("---------");
        singleLinkedList1.delete(node2);
        singleLinkedList1.list();
        System.out.println("---------");
       /* SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        LinkNode node1 = new LinkNode(5,"horace");
        LinkNode node2 = new LinkNode(3,"horace2");
        LinkNode node3 = new LinkNode(8,"horace3");
        LinkNode node4 = new LinkNode(2,"horace");
        LinkNode node5 = new LinkNode(6,"horace2");
        LinkNode node6 = new LinkNode(4,"horace3");
        singleLinkedList1.addToLast(node1).addToLast(node2).addToLast(node3).addToLast(node4).addToLast(node5).addToLast(node6);
        singleLinkedList1.list();
        singleLinkedList2.addByOrder(node1).addByOrder(node2).addByOrder(node3).addByOrder(node4).addByOrder(node5).addByOrder(node6);
        singleLinkedList2.list();*/

        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<Integer>();
        queue.

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
