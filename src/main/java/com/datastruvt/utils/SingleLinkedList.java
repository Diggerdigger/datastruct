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

    public SingleLinkedList addByOrder(LinkNode node){
        LinkNode parentNode=initNode;
        while(true){
            if(parentNode.getNext()==null){
               break;
            }
            else {
               if (parentNode.getNext().getNum()>node.getNum()) {
                   break;
               }
            }
            parentNode=parentNode.getNext();
        }
        node.setNext(parentNode.getNext());
        parentNode.setNext(node);
        return this;//返回链表地址；
    }

    public void list(){
        LinkNode tem=initNode;
        while (tem.getNext()!=null){
            tem=tem.getNext();
            System.out.println("num:"+tem.getNum()+",content:"+tem.getContent());
        }
    }

    public void delete(LinkNode node){
        LinkNode tem=initNode;
        Boolean flag=false;
        while (tem.getNext()!=null){

            if(tem.getNext().getNum()==node.getNum()){
                flag=true;
                break;
            }
            tem=tem.getNext();
        }
        if(flag){
            tem.setNext(tem.getNext().getNext());
        }

    }

}
