package com.datastruvt.test;

public class ShellSort {

    public static void main(String[] args) {

        int[] ori = new int[10];
        for (int i = 0; i < ori.length; i++) {
            ori[i] = (int) (Math.random() * ori.length);
        }

        for (int p = 0; p < ori.length; p++) {
            System.out.print(ori[p]);
            System.out.print(",");
        }
        System.out.println("");
        System.out.println("=====================");

        /*for (int gap = ori.length / 2; gap >= 1; gap /= 2) {
            for (int group = 0; group < gap; group++) {
                //shellInsert(ori, gap, group);
                for (int j = group + gap; j < ori.length; j += gap) {
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
        }*/

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

        for (int p = 0; p < ori.length; p++) {
            System.out.print(ori[p]);
            System.out.print(",");
        }
    }

    private static void shellInsert(int[] ori, int gap, int group) {
        int temp;

            for (int j = group + gap; j < ori.length; j += gap) {
                for (int k = j - gap; k >= 0; k -= gap) {
                    if (ori[k + gap] < ori[k]) {
                        temp = ori[k + gap];
                        ori[k + gap] = ori[k];
                        ori[k] = temp;
                    } else {
                        break;
                    }
                }
            }


    }
}
