package com.datastruvt.utils;

//数组模拟环形队列
public class ArrQueue {

    private static Integer maxSize;

    private static Integer front;  //front指向队列的第一个元素
    private static Integer rear;  //rear指向队列最后一个元素的后一个位置
    private static int[] arrQue;

    public ArrQueue(int maxSize){
        this.maxSize=maxSize;
        this.front=0;
        this.rear=0;
        arrQue=new int[maxSize];
    }

    public void add(int num){
        if ((rear+1)%maxSize==front) {//队列中空出一个位置做约定
            throw  new RuntimeException("队列已满");
        }
        arrQue[rear%maxSize]=num;
        rear++;
    }

    public int get(){
        if(rear==front) throw  new RuntimeException("队列为空");
        int rs= arrQue[front%maxSize];
        front++;
        return rs;
    }

    public void showQue(){
        for(int i=front;i<rear;i++){
            System.out.println(arrQue[i%maxSize]);
        }
    }

    public Integer getFront() {
        return front;
    }

    public Integer getRear() {
        return rear;
    }
}
