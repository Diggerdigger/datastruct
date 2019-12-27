package com.datastruvt.test.sort;
//https://blog.csdn.net/MoreWindows/article/details/6678165
public class MergeSort {

    public static void main(String[] args) {
        int[] ori = new int[10];
        for (int i = 0; i < ori.length; i++) {
            ori[i] = (int) (Math.random() * ori.length);
        }
        ori=new int[10]{0,6,5,9,7,9,8,4,7,9};
        for (int p = 0; p < ori.length; p++) {
            System.out.print(ori[p]);
            System.out.print(",");
        }
        System.out.println("");
        System.out.println("=====================");

        int[] temp = new int[ori.length];
        mergeSort(ori,0,ori.length-1,temp);

        for (int p = 0; p < ori.length; p++) {
            System.out.print(ori[p]);
            System.out.print(",");
        }
        System.out.println("");
        System.out.println("=====================");
    }

    private static void mergeSort(int[] ori, int beginIndex, int endIndex, int[] temp) {

        if(beginIndex<endIndex){
            int mid=(beginIndex+endIndex)/2;
            mergeSort(ori,beginIndex,mid,temp);
            mergeSort(ori,mid+1,endIndex,temp);
            mergeArray(ori,beginIndex,mid,endIndex,temp);
        }

    }

    private static void mergeArray(int[] ori, int beginIndex, int mid, int endIndex, int[] temp) {
        int i=beginIndex;  int j=mid;
        int m=mid+1;         int n=endIndex;
        int k=0;
        while(i<=j&&m<=n){
            if(ori[i]<ori[m]){
                temp[k++]=ori[i++];
            }else{
                temp[k++]=ori[m++];
            }
        }
        while(i<=j){
            temp[k++]=ori[i++];
        }
        while(m<=n){
            temp[k++]=ori[m++];
        }

        for(int p=beginIndex;p<beginIndex+k-1;p++){
            ori[p]=temp[p-beginIndex];
        }
    }
}
