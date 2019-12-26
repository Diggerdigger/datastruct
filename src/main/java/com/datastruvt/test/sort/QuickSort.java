package com.datastruvt.test.sort;

public class QuickSort {

    public static void main(String[] args) {
        int [] ori=new int[5];
        for(int p=0;p<ori.length;p++){
            ori[p]= (int)(Math.random()*ori.length);
        }
        //int [] ori=new int[]{4,4,2,0,1};
        printargs(ori);
        long a = System.currentTimeMillis();

        selectSort(ori,0,ori.length-1);

        long b = System.currentTimeMillis();
        printargs(ori);
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

    private static void printargs(int[] args) {
        for(int k=0;k<args.length;k++){
            System.out.print(args[k]);
            System.out.print(";");
        }
        System.out.println("");
    }

}
