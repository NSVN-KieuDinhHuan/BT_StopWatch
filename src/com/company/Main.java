package com.company;

public class Main {

    public static void main(String[] args) {
        StopWatch time=new StopWatch();
        time.start();
        int sum=0;
        for(int i=0;i<100000000;i++){
            sum+=i;
        }
        time.stop();
        System.out.println("thoi gian chay: "+time.getElapsedTime()+"ms");
    }
}
