package com.company.demo;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Vector;

public class Hit {
    Vector<Integer> v = new Vector<>();

    void hit(int timestamp)
    {
        v.add(timestamp);
    }

    int getHits(int timestamp)
    {
        int i, j;
        for (i = 0; i < v.size(); ++i) {
            if (v.get(i)> timestamp - 300) {
                break;
            }
        }
        return v.size() - i;
    }
    private int getHits() {
        return v.size();
    }

    public static void main(String[] args) {
        Hit h = new Hit();
        h.hit(1);
        h.hit(2);
        h.hit(3);
        h.hit(4);
        System.out.println(h.getHits());

    }
}
