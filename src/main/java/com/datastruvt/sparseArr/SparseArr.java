package com.datastruvt.sparseArr;

import java.io.FileOutputStream;

public class SparseArr {

    public static void main(String[] args) {
        System.out.println("aaa");

        int[][] oriArr=new int [11][11];//默认值为0；
        oriArr[2][3]=1;
        oriArr[3][4]=2;
        oriArr[3][6]=2;
        for (int[] row:oriArr) {
            for (int i:row) {
                System.out.printf("%d\t",i);
            }
            System.out.println("");
        }

        int sum=0;
        for (int[] row:oriArr) {
            for (int i:row) {
                if(i!=0) sum++;
            }
        }

        int[][] sparseArr=new int[sum+1][3];
        sparseArr[0][0]=11;
        sparseArr[0][1]=11;
        sparseArr[0][2]=sum;

        int count=0;
        System.out.println(oriArr.length);
        for (int i=0;i<oriArr.length;i++) {
                for(int j=0;j<oriArr[i].length;j++){
                    if (oriArr[i][j]!=0){
                        count++;
                        sparseArr[count][0]=i;
                        sparseArr[count][1]=j;
                        sparseArr[count][2]=oriArr[i][j];
                    }
                }
        }

        for (int[] row:sparseArr) {
            for (int i:row) {
                FileOutputStream fileOutputStream = new FileOutputStream("");

                System.out.printf("%d\t",i);

            }
            System.out.println("");
        }



    }
}
