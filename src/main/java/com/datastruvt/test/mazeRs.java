package com.datastruvt.test;

public class mazeRs implements Comparable<mazeRs> {

    protected boolean rs;
    protected int lengths;



    public boolean getRs() {
        return rs;
    }

    public void setRs(boolean rs) {
        this.rs = rs;
    }

    public int getLengths() {
        return lengths;
    }

    public void setLengths(int lengths) {
        this.lengths = lengths;
    }

    @Override
    public int compareTo(mazeRs mazeRs) {
        if(this.lengths>mazeRs.getLengths()){
            return 1;
        }else if(this.lengths<mazeRs.getLengths()){
            return -1;
        }else {
            return 0;
        }
    }
}
