package com.datastruvt.test;

import com.datastruvt.utils.ArrQueue;
import com.datastruvt.utils.LinkNode;
import com.datastruvt.utils.SingleLinkedList;



public class DatastructTest {

    private static int [] weights={11,5,9,1,6,10};

    public static void main(String[] args){
        //System.out.println( packageProblem(29,weights.length));
        testMaze();
    }

    public  static  void testMaze(){
        int[][] maze=new int[10][10];
        for(int i=0;i<10;i++){
            maze[0][i]=1;
            maze[9][i]=1;
            maze[i][0]=1;
            maze[i][9]=1;
        }
        maze[2][2]=1;
        maze[4][4]=1;
        maze[3][3]=1;
        maze[5][5]=1;
        maze[6][6]=1;
        maze[7][7]=1;
        for(int ii=0;ii<10;ii++){
            for(int jj=0;jj<10;jj++){
                System.out.print(maze[ii][jj]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        System.out.println("================");
        //boolean re=mazeFind(maze,1,1,8,8);
        boolean re=mazeFind(maze,1,1);
        if (re){
            for(int i=0;i<10;i++){
                for(int j=0;j<10;j++){
                    System.out.print(maze[i][j]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
        }
    }

    private static boolean mazeFind(int[][] maze, int oriX, int oriY) {
        if (maze[8][8] == 2) {
            return true;
        } else {
            if (maze[oriX][oriY] == 0) {
                maze[oriX][oriY] = 2;
                if (mazeFind(maze, oriX + 1, oriY)) {
                    return true;
                } else if (mazeFind(maze, oriX, oriY - 1)) {
                    return true;
                } else if (mazeFind(maze, oriX - 1, oriY)) {
                    return true;
                } else if (mazeFind(maze, oriX, oriY + 1)) {
                    return true;
                } else {
                    maze[oriX][oriY] = 3;
                    return false;
                }
            } else {
                return false;
            }
        }
    }

    public static boolean packageProblem(int s,int n){//背包问题
        if(s==0) return true;
        else if((s<0)||(s>0&&n<1)) return false;
        else{
            if(packageProblem(s-weights[n-1],n-1)){
                System.out.println(weights[n-1]);
                return true;
            }else{
                return packageProblem(s,n-1);
            }
        }
    }

    public static void testSingleLinkedList(){
        SingleLinkedList singleLinkedList1 = new SingleLinkedList();
        LinkNode node1 = new LinkNode(5,"horace");
        LinkNode node2 = new LinkNode(3,"horace2");
        singleLinkedList1.addToLast(node1).addToLast(node2);
        singleLinkedList1.list();
        System.out.println("---------");
        singleLinkedList1.delete(node1);
        singleLinkedList1.list();
        System.out.println("---------");
        singleLinkedList1.delete(node2);
        singleLinkedList1.list();
        System.out.println("---------");
       /* SingleLinkedList singleLinkedList2 = new SingleLinkedList();
        LinkNode node1 = new LinkNode(5,"horace");
        LinkNode node2 = new LinkNode(3,"horace2");
        LinkNode node3 = new LinkNode(8,"horace3");
        LinkNode node4 = new LinkNode(2,"horace");
        LinkNode node5 = new LinkNode(6,"horace2");
        LinkNode node6 = new LinkNode(4,"horace3");
        singleLinkedList1.addToLast(node1).addToLast(node2).addToLast(node3).addToLast(node4).addToLast(node5).addToLast(node6);
        singleLinkedList1.list();
        singleLinkedList2.addByOrder(node1).addByOrder(node2).addByOrder(node3).addByOrder(node4).addByOrder(node5).addByOrder(node6);
        singleLinkedList2.list();*/
    }

    public static void testDataStruct(){
        ArrQueue que = new ArrQueue(3);
        que.add(555);
        que.add(665);
        que.showQue();
        System.out.println("---------");
        System.out.println(que.get());
        System.out.println(que.get());
        System.out.println("---------");
        que.add(777);
        que.add(888);
        que.showQue();
        System.out.println("---------");
        System.out.println(que.get());
        System.out.println(que.get());
        System.out.println("---------");
        System.out.println("front="+que.getFront());
        System.out.println("rear="+que.getRear());
        System.out.println(que.get());
    }
}
