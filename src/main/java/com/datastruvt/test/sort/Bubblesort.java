package com.datastruvt.test.sort;

import java.util.Random;


//排序算法性能：插入排序>冒泡排序>选择排序


public class Bubblesort {

    private static int count=0;
    private static boolean flag;
    private static int temp;

    public static void main(String[] args) {
        int [] ori=new int[50000000];
        for(int p=0;p<ori.length;p++){
            ori[p]= (int)(Math.random()*ori.length);
        }

        int[] clone = ori.clone();
        int[] insertArg = clone.clone();
        int[] quickArg = insertArg.clone();
        int[] shellArg = quickArg.clone();
        /*
        //printargs(ori);
        long a = System.currentTimeMillis();
        bubbleSort(ori);
        long b = System.currentTimeMillis();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&");
        //printargs(ori);
        System.out.println("冒泡:"+(b-a));
        System.out.println("=====================");

        //printargs(clone);
        long c = System.currentTimeMillis();
        selectSort(clone);
        long d = System.currentTimeMillis();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&");
        //printargs(clone);
        System.out.println("选择:"+(d-c));

        //printargs(insertArg);
        long e = System.currentTimeMillis();
        insertSort(insertArg);
        long f = System.currentTimeMillis();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&");
        //printargs(insertArg);
        System.out.println("插入:"+(f-e));
        */
        //printargs(shellArg);
        long j = System.currentTimeMillis();
        shellSort(shellArg);
        long k = System.currentTimeMillis();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&");
        //printargs(shellArg);
        System.out.println("希尔:"+(k-j));

        //printargs(quickArg);
        long g = System.currentTimeMillis();
        selectSort(quickArg,0,quickArg.length-1);
        long h = System.currentTimeMillis();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&");
       // printargs(quickArg);
        System.out.println("快速:"+(h-g));
    }

    private static void shellSort(int[] ori) {
        for (int gap = ori.length / 2; gap >= 1; gap /= 2) {
            for(int j=gap;j<ori.length;j++){
                if (ori[j - gap] > ori[j]) {
                    int tem = ori[j];
                    int p = j - gap;
                    while (p >= 0 && ori[p] > tem) {
                        ori[p + gap] = ori[p];
                        p -= gap;
                    }
                    ori[p + gap] = tem;
                }
            }
        }

    }


    private static void insertSort(int[] insertArg) {
        int temp;
        for(int i=1;i<insertArg.length;i++){
            for(int j=i-1;j>=0;j--){
                if(insertArg[j]>insertArg[j+1]){
                    temp=insertArg[j];
                    insertArg[j]=insertArg[j+1];
                    insertArg[j+1]=temp;

                }else{
                    break;
                }
            }
        }
    }

    private static void printargs(int[] args) {
        for(int k=0;k<args.length;k++){
            System.out.print(args[k]);
            System.out.print(";");
        }
        System.out.println("");
    }

    private static void selectSort(int[] ori) {
        int tem;
        for(int i=0;i<ori.length-1;i++){
            for(int j=i;j<ori.length-1;j++){
                if(ori[i]>ori[j+1]){
                    tem=ori[j+1];
                    ori[j+1]=ori[i];
                    ori[i]=tem;
                }
            }
        }
    }

    private static void bubbleSort(int[] ori) {

        for(int i=0;i<ori.length-1;i++){
            flag=true;
            for(int j=0;j<ori.length-i-1;j++){
                if (ori[j]>ori[j+1]){
                    temp=ori[j];
                    ori[j]=ori[j+1];
                    ori[j+1]=temp;
                    flag=false;
                }
            }
            if (flag){
                break;
            }else{
                count++;
            }
        }

    }

    public static void selectSort(int[] ori,int orilow,int orihigh) {
        int low=orilow;
        int high=orihigh;

        int temp=ori[low];
        while(low!=high){
            if(ori[high]>=temp){
                high--;
            }else{
                ori[low]=ori[high];
                low++;
                while(low!=high){
                    if(ori[low]<=temp){
                        low++;
                    }else{
                        ori[high]=ori[low];
                        high--;
                        break;
                    }
                }
            }
        }
        ori[low]=temp;//此时low=high;

        if(orilow+1<low){
            selectSort(ori,orilow,low-1);
        }
        if(high+1<orihigh){
            selectSort(ori,high+1,orihigh);
        }
    }
}
