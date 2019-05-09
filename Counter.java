package com.example.tapbuttoncountermainactivity;

public class Counter {

    private int mCount;

    public Counter(){
        mCount = 0;
    }

    public void addCount(){
        mCount++;
    }

    public void subtractCount(){
        mCount--;
    }
    public Integer getCount(){
        return mCount;
    }

}
