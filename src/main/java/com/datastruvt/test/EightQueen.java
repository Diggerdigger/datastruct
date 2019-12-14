package com.datastruvt.test;


public class EightQueen {

    int max=8;
    int[] array=new int[max];
    static int count=0;
    static int judgeCount=0;

    public static void main(String[] args) {
        EightQueen queen = new EightQueen();
        queen.work(0);
        System.out.println(count+":"+judgeCount);
    }


    private void work(int n) {
        if(n==max) {
            judgeCount++;
            print();
            return;
        }
        for(int j=0;j<max;j++){
            array[n]=j;
            if(judge(n)){
                work(n+1);
                }
        }


    }

    private boolean judge(int i) {
        count++;
        for(int p=0;p<i;p++){
            if(array[p]==array[i]||Math.abs(i-p)==Math.abs(array[i]-array[p])){
                return false;
            }
        }
        return true;
    }

    private void print() {
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");

        }
        System.out.println("");
    }
}
