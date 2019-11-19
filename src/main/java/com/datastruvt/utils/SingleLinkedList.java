package com.datastruvt.utils;

public class SingleLinkedList {

    private LinkNode initNode;

    public SingleLinkedList(){
        initNode=new LinkNode(0,"");
    }

    public SingleLinkedList addToLast(LinkNode node){
       LinkNode tem=initNode;
       while(tem.getNext()!=null){
           tem=tem.getNext();
       }
       tem.setNext(node);
       return this;//返回链表地址；
    }



}
