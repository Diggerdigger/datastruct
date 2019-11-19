package com.datastruvt.utils;

public class LinkNode {
    private static int num;
    private static String content;
    private static LinkNode next;

    public LinkNode(int num,String content){
        this.num=num;
        this.content=content;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "num=" + num +
                ", content='" + content + '\'' +
                '}';
    }
}
