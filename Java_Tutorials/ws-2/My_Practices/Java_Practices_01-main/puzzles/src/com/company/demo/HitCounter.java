package com.company.demo;

import java.util.ArrayDeque;

public class HitCounter {
    ArrayDeque<Integer> dq;
    public HitCounter(){
        dq = new ArrayDeque<Integer>();
    }

    public void recordHits(int timestamp){
        dq.add(timestamp);
        int startTime = timestamp-299;
    }
    public int range(int lower,int timestamp){
        int startTime = timestamp-299;
        int count=0;
        for (int i=lower;i<=timestamp;i++) {
            count++;
        }
        return count;
    }
    public int total(){
        return dq.size();
    }

    public static void main(String[] args) {
        HitCounter hitCounter =new HitCounter();
        hitCounter.recordHits(1);
        hitCounter.recordHits(2);
        hitCounter.recordHits(3);
        hitCounter.recordHits(4);
        System.out.println(hitCounter.total());
        System.out.println(hitCounter.range(2,4));
    }
}
